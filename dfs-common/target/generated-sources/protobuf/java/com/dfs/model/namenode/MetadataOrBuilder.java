// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: namenode.proto

package com.dfs.model.namenode;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dfs.common.proto.Metadata)
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
   * <code>int32 type = 2;</code>
   */
  int getType();

  /**
   * <code>string hostname = 3;</code>
   */
  java.lang.String getHostname();
  /**
   * <code>string hostname = 3;</code>
   */
  com.google.protobuf.ByteString
      getHostnameBytes();

  /**
   * <code>int64 fileSize = 4;</code>
   */
  long getFileSize();

  /**
   * <code>map&lt;string, string&gt; attr = 5;</code>
   */
  int getAttrCount();
  /**
   * <code>map&lt;string, string&gt; attr = 5;</code>
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
   * <code>map&lt;string, string&gt; attr = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttrMap();
  /**
   * <code>map&lt;string, string&gt; attr = 5;</code>
   */

  java.lang.String getAttrOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attr = 5;</code>
   */

  java.lang.String getAttrOrThrow(
      java.lang.String key);
}