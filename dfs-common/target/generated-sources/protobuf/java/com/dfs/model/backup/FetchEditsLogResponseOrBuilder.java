// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backupnode.proto

package com.dfs.model.backup;

public interface FetchEditsLogResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dfs.common.proto.FetchEditsLogResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.dfs.common.proto.EditLog editLogs = 1;</code>
   */
  java.util.List<com.dfs.model.backup.EditLog> 
      getEditLogsList();
  /**
   * <code>repeated .com.dfs.common.proto.EditLog editLogs = 1;</code>
   */
  com.dfs.model.backup.EditLog getEditLogs(int index);
  /**
   * <code>repeated .com.dfs.common.proto.EditLog editLogs = 1;</code>
   */
  int getEditLogsCount();
  /**
   * <code>repeated .com.dfs.common.proto.EditLog editLogs = 1;</code>
   */
  java.util.List<? extends com.dfs.model.backup.EditLogOrBuilder> 
      getEditLogsOrBuilderList();
  /**
   * <code>repeated .com.dfs.common.proto.EditLog editLogs = 1;</code>
   */
  com.dfs.model.backup.EditLogOrBuilder getEditLogsOrBuilder(
      int index);

  /**
   * <code>repeated .com.dfs.common.proto.UserEntity users = 2;</code>
   */
  java.util.List<com.dfs.model.namenode.UserEntity> 
      getUsersList();
  /**
   * <code>repeated .com.dfs.common.proto.UserEntity users = 2;</code>
   */
  com.dfs.model.namenode.UserEntity getUsers(int index);
  /**
   * <code>repeated .com.dfs.common.proto.UserEntity users = 2;</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .com.dfs.common.proto.UserEntity users = 2;</code>
   */
  java.util.List<? extends com.dfs.model.namenode.UserEntityOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .com.dfs.common.proto.UserEntity users = 2;</code>
   */
  com.dfs.model.namenode.UserEntityOrBuilder getUsersOrBuilder(
      int index);
}
