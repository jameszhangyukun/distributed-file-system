package com.zyk.dfs.namenode.fs;

import com.zyk.dfs.namenode.editslog.EditLogWrapper;

/**
 * 回放日志接口
 */
public interface PlaybackEditLogCallback {
    /**
     * 回放
     */
    void playback(EditLogWrapper editLogWrapper);
}
