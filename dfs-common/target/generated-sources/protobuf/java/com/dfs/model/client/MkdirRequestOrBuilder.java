// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dfs-client.proto

package com.dfs.model.client;

public interface MkdirRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dfs.common.proto.MkdirRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <code>string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>map&lt;string, string&gt; attr = 2;</code>
   */
  int getAttrCount();
  /**
   * <code>map&lt;string, string&gt; attr = 2;</code>
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
   * <code>map&lt;string, string&gt; attr = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttrMap();
  /**
   * <code>map&lt;string, string&gt; attr = 2;</code>
   */

  java.lang.String getAttrOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attr = 2;</code>
   */

  java.lang.String getAttrOrThrow(
      java.lang.String key);
}
