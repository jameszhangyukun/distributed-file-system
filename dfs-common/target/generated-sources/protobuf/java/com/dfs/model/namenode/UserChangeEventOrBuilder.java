// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: namenode.proto

package com.dfs.model.namenode;

public interface UserChangeEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dfs.common.proto.UserChangeEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 eventType = 1;</code>
   */
  int getEventType();

  /**
   * <code>.com.dfs.common.proto.UserEntity userEntity = 2;</code>
   */
  boolean hasUserEntity();
  /**
   * <code>.com.dfs.common.proto.UserEntity userEntity = 2;</code>
   */
  com.dfs.model.namenode.UserEntity getUserEntity();
  /**
   * <code>.com.dfs.common.proto.UserEntity userEntity = 2;</code>
   */
  com.dfs.model.namenode.UserEntityOrBuilder getUserEntityOrBuilder();
}
