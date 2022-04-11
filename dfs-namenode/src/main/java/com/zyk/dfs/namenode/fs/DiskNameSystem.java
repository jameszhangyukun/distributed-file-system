package com.zyk.dfs.namenode.fs;

import com.dfs.common.enums.FsOpType;
import com.dfs.model.backup.EditLog;
import com.zyk.dfs.backup.fs.FsImage;
import com.zyk.dfs.namenode.config.NameNodeConfig;
import com.zyk.dfs.namenode.editslog.EditLogWrapper;
import com.zyk.dfs.namenode.editslog.FsEditLog;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;

import java.util.Map;

/**
 * 负责管理文件系统的元数据组件
 */
@Slf4j
public class DiskNameSystem extends AbstractFsNameSystem {
    private NameNodeConfig nameNodeConfig;

    private FsEditLog editLog;

    public DiskNameSystem(NameNodeConfig nameNodeConfig) {
        super();
        this.nameNodeConfig = nameNodeConfig;
        this.editLog = new FsEditLog(nameNodeConfig);
    }

    @Override
    protected void recoveryNamespace() throws Exception {
        try {
            FsImage fsImage = scanLatestValidFsImage(nameNodeConfig.getBaseDir());
            long txId = 0;
            if (fsImage != null) {
                txId = fsImage.getMaxTxId();
                applyFsImage(fsImage);
            }
            this.editLog.playbackEditLog(txId, obj -> {
                EditLog editLog = obj.getEditLog();
                int opType = editLog.getOpType();
                if (opType == FsOpType.MKDIR.getValue()) {
                    // 这里要调用super.mkdir 回放的editLog不需要再刷磁盘
                    super.mkdir(editLog.getPath(), editLog.getAttrMap());
                } else if (opType == FsOpType.CREATE.getValue()) {
                    super.createFile(editLog.getPath(), editLog.getAttrMap());
                } else if (opType == FsOpType.DELETE.getValue()) {
                    super.deleteFile(editLog.getPath());
                }
            });
        } catch (Exception e) {
            log.info("NameNode恢复命名空间异常：", e);
            throw e;
        }
    }

    public NameNodeConfig getNameNodeConfig() {
        return nameNodeConfig;
    }

    @Override
    public Node listFiles(String filename) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Node node = super.listFiles(filename);
        stopWatch.stop();
        return node;
    }

    @Override
    public void mkdir(String path, Map<String, String> attr) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        super.mkdir(path, attr);
        this.editLog.logEdit(new EditLogWrapper(FsOpType.MKDIR.getValue(), path, attr));
        log.info("创建文件夹：{}", path);
        stopWatch.stop();
        stopWatch.stop();
    }

    @Override
    public boolean createFile(String filename, Map<String, String> attr) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        if (!super.createFile(filename, attr)) {
            return false;
        }
        this.editLog.logEdit(new EditLogWrapper(FsOpType.CREATE.getValue(), filename, attr));
        stopWatch.stop();
        return true;
    }

    @Override
    public boolean deleteFile(String filename) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        if (!super.deleteFile(filename)) {
            return false;
        }
        this.editLog.logEdit(new EditLogWrapper(FsOpType.DELETE.getValue(), filename));
        stopWatch.stop();
        return true;
    }

    /**
     * 优雅停机
     * 强制把内存中的edits log刷入磁盘
     */
    public void shutdown() {
        log.info("Shutdown DiskNameSystem");
        this.editLog.flush();
    }

    /**
     * 获取editLog
     *
     * @return editLog
     */
    public FsEditLog getEditLog() {
        return editLog;
    }


}
