// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dfs-client.proto

package com.dfs.model.client;

public interface CreateFileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dfs.common.proto.CreateFileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.dfs.common.proto.DataNode dataNodes = 1;</code>
   */
  java.util.List<com.dfs.model.common.DataNode> 
      getDataNodesList();
  /**
   * <code>repeated .com.dfs.common.proto.DataNode dataNodes = 1;</code>
   */
  com.dfs.model.common.DataNode getDataNodes(int index);
  /**
   * <code>repeated .com.dfs.common.proto.DataNode dataNodes = 1;</code>
   */
  int getDataNodesCount();
  /**
   * <code>repeated .com.dfs.common.proto.DataNode dataNodes = 1;</code>
   */
  java.util.List<? extends com.dfs.model.common.DataNodeOrBuilder> 
      getDataNodesOrBuilderList();
  /**
   * <code>repeated .com.dfs.common.proto.DataNode dataNodes = 1;</code>
   */
  com.dfs.model.common.DataNodeOrBuilder getDataNodesOrBuilder(
      int index);

  /**
   * <code>string realFileName = 2;</code>
   */
  java.lang.String getRealFileName();
  /**
   * <code>string realFileName = 2;</code>
   */
  com.google.protobuf.ByteString
      getRealFileNameBytes();
}