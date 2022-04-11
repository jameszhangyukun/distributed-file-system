package com.zyk.dfs.namenode.fs;

import com.dfs.common.Constants;
import com.dfs.model.namenode.Metadata;
import com.zyk.dfs.backup.fs.FsImage;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.*;

/**
 * 文件系统
 */
@Slf4j
public abstract class AbstractFsNameSystem implements FsNamesystem {
    /**
     * 负责管理文件目录树的组件
     */
    protected FsDirectory fsDirectory;

    public AbstractFsNameSystem() {
        this.fsDirectory = new FsDirectory();
    }

    /**
     * 基于本地文件恢复元数据空间
     *
     * @throws Exception IO异常
     */
    protected abstract void recoveryNamespace() throws Exception;

    @Override
    public void mkdir(String path, Map<String, String> attr) {
        fsDirectory.mkdir(path, attr);
    }

    @Override
    public boolean createFile(String filename, Map<String, String> attr) {
        return this.fsDirectory.createFile(filename, attr);
    }

    @Override
    public boolean deleteFile(String filename) {
        return fsDirectory.delete(filename) != null;
    }

    @Override
    public Set<Metadata> getFilesBySlot(int slot) {
        return fsDirectory.findAllFileBySlot(slot);
    }

    /**
     * 加载FsImage文件到内存进行恢复
     */
    protected void applyFsImage(FsImage fsImage) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        log.info("Staring apply FsImage file ...");
        fsDirectory.applyFsImage(fsImage);
        stopWatch.stop();
        log.info("Apply FsImage File cost {} ms", stopWatch.getTime());
    }

    /**
     * 扫描最新的FsImage
     *
     * @return 最新并合法的FsImage
     */
    protected FsImage scanLatestValidFsImage(String baseDir) throws IOException {
        Map<Long, String> timeFsImageMap = scanFsImageMap(baseDir);
        List<Long> sortedList = new ArrayList<>(timeFsImageMap.keySet());
        sortedList.sort((o1, o2) -> o1.equals(o2) ? 0 : (int) (o2 - o1));
        for (Long time : sortedList) {
            String path = timeFsImageMap.get(time);
            try (RandomAccessFile raf = new RandomAccessFile(path, "r"); FileInputStream fis = new FileInputStream(raf.getFD()); FileChannel fileChannel = fis.getChannel()) {
                FsImage fsImage = FsImage.parse(fileChannel, path, (int) raf.length());
                if (fsImage != null) {
                    return fsImage;
                }
            }
        }
        return null;
    }

    /**
     * 扫描本地文件，把所有FsImage文件扫描出来
     *
     * @param path 文件路径
     * @return FsImage Map
     */
    public Map<Long, String> scanFsImageMap(String path) {
        Map<Long, String> timeFsImageMap = new HashMap<>(8);
        File dir = new File(path);
        if (!dir.exists()) {
            return timeFsImageMap;
        }
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return timeFsImageMap;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                continue;
            }
            if (!file.getName().contains("fsimage")) {
                continue;
            }
            String str = file.getName().split("-")[1];
            long time = Long.parseLong(str);
            timeFsImageMap.put(time, file.getAbsolutePath());
        }
        return timeFsImageMap;
    }

    /**
     * 获取文件列表
     *
     * @param filename 文件路径
     * @return 文件列表
     */
    public Node listFiles(String filename) {
        return this.fsDirectory.listFiles(filename);
    }

    /**
     * 计算文件数量
     *
     * @param path 文件路径
     * @return 计算结果
     */
    public CalculateResult calculate(String path) {
        CalculateResult calculateResult = new CalculateResult();
        calculateResult.setFileCount(0);
        calculateResult.setTotalSize(0);
        Node node = unsafeListFiles(path);
        if (node == null) {
            return calculateResult;
        } else {
            internalCalculate(node, calculateResult);
        }
        return calculateResult;
    }

    private void internalCalculate(Node node, CalculateResult calculateResult) {
        if (node.isFile()) {
            calculateResult.addFileCount();
            String fileSizeStr = node.getAttr().getOrDefault(Constants.ATTR_FILE_SIZE, "0");
            long fileSize = Long.parseLong(fileSizeStr);
            calculateResult.addTotalSize(fileSize);
        } else {
            for (String key : node.getChildren().keySet()) {
                Node children = node.getChildren().get(key);
                internalCalculate(children, calculateResult);
            }
        }
    }

    /**
     * 获取文件列表
     *
     * @param filename 文件路径
     * @return 文件列表
     */
    public Node listFiles(String filename, int level) {
        return this.fsDirectory.listFiles(filename, level);
    }

    /**
     * <pre>
     *     假设存在文件：
     *
     *     /aaa/bbb/c1.png
     *     /aaa/bbb/c2.png
     *     /bbb/ccc/c3.png
     *
     * 传入：/aaa，则返回：[/bbb/c1.png, /bbb/c2.png]
     *
     * </pre>
     * <p>
     * 返回文件名
     */
    public List<String> findAllFiles(String path) {
        return this.fsDirectory.findAllFiles(path);
    }

    /**
     * 获取文件列表
     *
     * @param filename 文件路径
     * @return 文件列表
     */
    public Node unsafeListFiles(String filename) {
        return this.fsDirectory.unsafeListFiles(filename);
    }

    /**
     * 获取文件属性
     *
     * @param filename 文件名称
     * @return 文件属性
     */
    public Map<String, String> getAttr(String filename) {
        Node node = this.fsDirectory.listFiles(filename);
        if (node == null) {
            return null;
        }
        return Collections.unmodifiableMap(node.getAttr());
    }
}
