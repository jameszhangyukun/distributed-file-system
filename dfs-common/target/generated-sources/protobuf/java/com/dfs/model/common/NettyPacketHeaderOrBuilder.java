// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commons.proto

package com.dfs.model.common;

public interface NettyPacketHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dfs.common.proto.NettyPacketHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; headers = 1;</code>
   */
  int getHeadersCount();
  /**
   * <code>map&lt;string, string&gt; headers = 1;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeaders();
  /**
   * <code>map&lt;string, string&gt; headers = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <code>map&lt;string, string&gt; headers = 1;</code>
   */

  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; headers = 1;</code>
   */

  java.lang.String getHeadersOrThrow(
      java.lang.String key);
}
