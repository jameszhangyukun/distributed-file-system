package com.zyk.dfs.namenode.editslog;

import com.zyk.dfs.namenode.config.NameNodeConfig;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;

/**
 * 双缓冲机制
 */
@Slf4j
public class DoubleBuffer {
    private NameNodeConfig nameNodeConfig;

    private EditLogBuffer currentBuffer;

    private EditLogBuffer syncBuffer;

    public DoubleBuffer(NameNodeConfig nameNodeConfig) {
        this.nameNodeConfig = nameNodeConfig;
        this.currentBuffer = new EditLogBuffer(nameNodeConfig);
        this.syncBuffer = new EditLogBuffer(nameNodeConfig);
    }

    /**
     * 写入一条edit log
     */
    public void write(EditLogWrapper editLog) throws Exception {
        currentBuffer.write(editLog);
    }

    /**
     * 交换两块缓冲区
     */
    public void setReadyToSync() {
        EditLogBuffer tmp = currentBuffer;
        currentBuffer = syncBuffer;
        syncBuffer = tmp;
    }

    /**
     * 把缓存去的Edits log刷入到磁盘
     */
    public EditsLogInfo flush() throws Exception {
        EditsLogInfo editsLogInfo = syncBuffer.flush();
        if (editsLogInfo != null) {
            syncBuffer.clear();
        }
        return editsLogInfo;
    }

    public boolean shouldForceSync() {
        return currentBuffer.size() >= nameNodeConfig.getEditLogFlushThreshold();
    }

    public List<EditLogWrapper> getCurrentEditLog() {
        return currentBuffer.getCurrentEditLog();
    }

}
