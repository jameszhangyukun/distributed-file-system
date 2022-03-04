package com.dfs.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NodeType {
    /**
     * 文件节点类型
     */
    FILE(1), DIRECTORY(2);
    private int value;
}
