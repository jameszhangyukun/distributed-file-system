package com.zyk.dfs.namenode.editslog;

import com.dfs.common.utils.FileUtil;
import com.zyk.dfs.namenode.config.NameNodeConfig;
import com.zyk.dfs.namenode.fs.PlaybackEditLogCallback;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 表示Edit log
 */
@Slf4j
public class FsEditLog {
    private static Pattern indexPattern = Pattern.compile("(\\d+)_(\\d+)");

    private NameNodeConfig nameNodeConfig;
    /**
     * 每条editLog的id
     */
    private volatile long txIdSeq = 0;
    /**
     * 双缓冲
     */
    private DoubleBuffer doubleBuffer;

    /**
     * 每个线程保存的最大TxId
     */
    private ThreadLocal<Long> localTxId = new ThreadLocal<>();
    /**
     * 当前刷新磁盘最大的TxId
     */
    private volatile long syncTxId = 0;
    /**
     * 是否正在刷磁盘
     */
    private volatile boolean isSyncRunning = false;
    /**
     * 是否正在调度刷入磁盘
     */
    private volatile boolean isSchedulingSync = false;
    /**
     * 磁盘中的Edits log文件
     */
    private List<EditsLogInfo> editsLogInfos = null;

    public FsEditLog(NameNodeConfig nameNodeConfig) {
        this.nameNodeConfig = nameNodeConfig;
        this.doubleBuffer = new DoubleBuffer(nameNodeConfig);
        this.loadEditLogInfos();
    }

    /**
     * 写入一条edit log
     *
     * @param editLog 内容
     */
    public void logEdit(EditLogWrapper editLog) {
        synchronized (this) {
            // 1. 检查是否有线程刷磁盘
            waitSchedulingSync();
            txIdSeq++;
            long txid = txIdSeq;
            localTxId.set(txid);
            editLog.setTxId(txid);
            try {
                doubleBuffer.write(editLog);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!doubleBuffer.shouldForceSync()) {
                return;
            }
            isSchedulingSync = true;
        }
        logSync();
    }

    private void logSync() {
        synchronized (this) {
            long txId = localTxId.get();
            localTxId.remove();

            // 在这种情况下需要等待：
            // 1. 有其他线程在刷盘，但是其他线程刷的磁盘的最大的txid比当前需要的线程id少
            // 正在刷磁盘的线程不会把当前
            while (txId > syncTxId && isSyncRunning) {
                try {
                    wait(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // 多个线程在上面等待，当前一个线程磁盘操作完毕之后，会唤醒一堆线程，此时只有一个现场获取到锁
            // 这个线程会进行刷磁盘操作，当线程释放锁之后，其他线程会依次获取到锁
            // 此时每个被唤醒的线程需要重新判断，自己需要刷入的是否被其他线程刷入了
            if (txId <= syncTxId) {
                return;
            }
            // 交换缓冲区
            doubleBuffer.setReadyToSync();

            // 记录最大的txId
            syncTxId = txId;

            // 设置当前正在同步到磁盘的标志位
            isSchedulingSync = false;

            // 唤醒等待wait的线程
            notifyAll();
            isSyncRunning = true;
        }
        try {
            EditsLogInfo editsLogInfo = doubleBuffer.flush();
            if (editsLogInfo != null) {
                editsLogInfos.add(editsLogInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.info("FSEditLog刷入磁盘失败：", e);
        }
        synchronized (this) {
            isSyncRunning = false;
            notifyAll();
        }
    }

    /**
     * 强制把内存缓冲中的数据刷入磁盘
     */
    public void flush() {
        synchronized (this) {
            try {
                doubleBuffer.setReadyToSync();
                EditsLogInfo editsLogInfo = doubleBuffer.flush();
                if (editsLogInfo != null) {
                    editsLogInfos.add(editsLogInfo);
                }
            } catch (Exception e) {
                log.info("强制刷新Edits log到磁盘失败.", e);
            }
        }
    }

    /**
     * 获取当前写editLog缓冲区
     *
     * @return 当前写editLog的缓冲区
     */
    public List<EditLogWrapper> getCurrentEditLog() {
        synchronized (this) {
            return doubleBuffer.getCurrentEditLog();
        }
    }

    /**
     * 等待正在调度的刷盘的操作
     */
    private void waitSchedulingSync() {
        try {
            while (isSchedulingSync) {
                wait(1000);
            }
        } catch (Exception e) {
            log.info("waitSchedulingSync has interrupted !!");
        }
    }

    /**
     * NameNode重启时回放edits log到内存中
     * @param txId 回放比txId大的日志
     * @param callback 回放的回调接口
     * @throws IOException
     */
    public void playbackEditLog(long txId, PlaybackEditLogCallback callback) throws IOException {
        long currentTxSeq = txId;
        this.txIdSeq = currentTxSeq;

        List<EditsLogInfo> sortedEditLogFiles = getSortedEditLogFiles(txId);

        StopWatch stopWatch = new StopWatch();
        for (EditsLogInfo sortedEditLogFile : sortedEditLogFiles) {
            if (sortedEditLogFile.getEnd() <= currentTxSeq) {
                continue;
            }
            List<EditLogWrapper> editLogWrappers = readEditLogFromFile(sortedEditLogFile.getName());
            stopWatch.start();
            for (EditLogWrapper editLogWrapper : editLogWrappers) {
                long tmpTxId =editLogWrapper.getTxId();
                if (tmpTxId <= currentTxSeq) continue;
                currentTxSeq = tmpTxId;
                this.txIdSeq = currentTxSeq;
                if (callback != null){
                    callback.playback(editLogWrapper);
                }
            }
            stopWatch.stop();
            log.info("回放editLog文件: [file={}, cost={} s]", sortedEditLogFile.getName(), stopWatch.getTime() / 1000.0D);
            stopWatch.reset();
        }
    }


    /**
     * 从文件中读取EditsLog
     */
    public List<EditLogWrapper> readEditLogFromFile(String absolutePath) throws IOException {
        return EditLogWrapper.parseForm(FileUtil.readBuffer(absolutePath));
    }

    /**
     * 获取比minTxId更大的edits文件
     */
    public List<EditsLogInfo> getSortedEditLogFiles(long minTxId) {
        List<EditsLogInfo> result = new ArrayList<>();
        for (EditsLogInfo editsLogInfo : editsLogInfos) {
            if (editsLogInfo.getEnd() >= minTxId) {
                result.add(editsLogInfo);
            }
        }
        return result;
    }

    /**
     * 加载磁盘中所有的edits log 文件信息
     */
    public void loadEditLogInfos() {
        this.editsLogInfos = new CopyOnWriteArrayList<>();
        File file = new File(nameNodeConfig.getBaseDir());
        if (!file.isDirectory()) {
            return;
        }
        File[] files = file.listFiles();
        if (files == null || files.length == 0) {
            return;
        }

        for (File editsLogFile : files) {
            if (!editsLogFile.getName().contains("edits")) {
                continue;
            }
            long[] index = getIndexFromFileName(file.getName());
            this.editsLogInfos.add(new EditsLogInfo(index[0], index[1], editsLogFile.getName()));
        }
        this.editsLogInfos.sort(null);
    }

    /**
     * 从文件名中提取index
     *
     * @param name 文件名
     */
    private long[] getIndexFromFileName(String name) {
        Matcher matcher = indexPattern.matcher(name);
        long[] result = new long[2];
        if (matcher.find()) {
            result[0] = Long.parseLong(matcher.group(0));
            result[1] = Long.parseLong(matcher.group(1));
        }
        return result;
    }

    /**
     * 清除比txId小的日志文件
     */
    public void cleanEditLogByTxId(long txId) {
        List<EditsLogInfo> toRemoveEditLog = new ArrayList<>();
        for (EditsLogInfo editsLogInfo : editsLogInfos) {
            if (editsLogInfo.getEnd() <= txId) {
                toRemoveEditLog.add(editsLogInfo);
                File file = new File(editsLogInfo.getName());
                if (file.delete()) {
                    log.info("删除editLog文件: [file={}]", editsLogInfo.getName());
                }
            }
        }
        editsLogInfos.removeAll(toRemoveEditLog);
    }


}
