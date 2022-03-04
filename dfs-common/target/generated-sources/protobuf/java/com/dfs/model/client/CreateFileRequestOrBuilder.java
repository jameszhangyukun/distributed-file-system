// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dfs-client.proto

package com.dfs.model.client;

public interface CreateFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dfs.common.proto.CreateFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string filename = 1;</code>
   */
  java.lang.String getFilename();
  /**
   * <code>string filename = 1;</code>
   */
  com.google.protobuf.ByteString
      getFilenameBytes();

  /**
   * <code>string fileSize = 2;</code>
   */
  java.lang.String getFileSize();
  /**
   * <code>string fileSize = 2;</code>
   */
  com.google.protobuf.ByteString
      getFileSizeBytes();

  /**
   * <code>map&lt;string, string&gt; attr = 3;</code>
   */
  int getAttrCount();
  /**
   * <code>map&lt;string, string&gt; attr = 3;</code>
   */
  boolean containsAttr(
      java.lang.String key);
  /**
   * Use {@link #getAttrMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttr();
  /**
   * <code>map&lt;string, string&gt; attr = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttrMap();
  /**
   * <code>map&lt;string, string&gt; attr = 3;</code>
   */

  java.lang.String getAttrOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attr = 3;</code>
   */

  java.lang.String getAttrOrThrow(
      java.lang.String key);
}