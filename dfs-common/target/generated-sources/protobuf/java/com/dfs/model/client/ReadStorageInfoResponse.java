// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dfs-client.proto

package com.dfs.model.client;

/**
 * Protobuf type {@code com.dfs.common.proto.ReadStorageInfoResponse}
 */
public  final class ReadStorageInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dfs.common.proto.ReadStorageInfoResponse)
    ReadStorageInfoResponseOrBuilder {
  // Use ReadStorageInfoResponse.newBuilder() to construct.
  private ReadStorageInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadStorageInfoResponse() {
    replica_ = 0;
    datanodes_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReadStorageInfoResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            replica_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            datanodes_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_ReadStorageInfoResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_ReadStorageInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dfs.model.client.ReadStorageInfoResponse.class, com.dfs.model.client.ReadStorageInfoResponse.Builder.class);
  }

  public static final int REPLICA_FIELD_NUMBER = 1;
  private int replica_;
  /**
   * <code>int32 replica = 1;</code>
   */
  public int getReplica() {
    return replica_;
  }

  public static final int DATANODES_FIELD_NUMBER = 2;
  private volatile java.lang.Object datanodes_;
  /**
   * <code>string datanodes = 2;</code>
   */
  public java.lang.String getDatanodes() {
    java.lang.Object ref = datanodes_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      datanodes_ = s;
      return s;
    }
  }
  /**
   * <code>string datanodes = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDatanodesBytes() {
    java.lang.Object ref = datanodes_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      datanodes_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (replica_ != 0) {
      output.writeInt32(1, replica_);
    }
    if (!getDatanodesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, datanodes_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (replica_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, replica_);
    }
    if (!getDatanodesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, datanodes_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.dfs.model.client.ReadStorageInfoResponse)) {
      return super.equals(obj);
    }
    com.dfs.model.client.ReadStorageInfoResponse other = (com.dfs.model.client.ReadStorageInfoResponse) obj;

    boolean result = true;
    result = result && (getReplica()
        == other.getReplica());
    result = result && getDatanodes()
        .equals(other.getDatanodes());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REPLICA_FIELD_NUMBER;
    hash = (53 * hash) + getReplica();
    hash = (37 * hash) + DATANODES_FIELD_NUMBER;
    hash = (53 * hash) + getDatanodes().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dfs.model.client.ReadStorageInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.dfs.model.client.ReadStorageInfoResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.dfs.common.proto.ReadStorageInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dfs.common.proto.ReadStorageInfoResponse)
      com.dfs.model.client.ReadStorageInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_ReadStorageInfoResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_ReadStorageInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dfs.model.client.ReadStorageInfoResponse.class, com.dfs.model.client.ReadStorageInfoResponse.Builder.class);
    }

    // Construct using com.dfs.model.client.ReadStorageInfoResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      replica_ = 0;

      datanodes_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_ReadStorageInfoResponse_descriptor;
    }

    public com.dfs.model.client.ReadStorageInfoResponse getDefaultInstanceForType() {
      return com.dfs.model.client.ReadStorageInfoResponse.getDefaultInstance();
    }

    public com.dfs.model.client.ReadStorageInfoResponse build() {
      com.dfs.model.client.ReadStorageInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.dfs.model.client.ReadStorageInfoResponse buildPartial() {
      com.dfs.model.client.ReadStorageInfoResponse result = new com.dfs.model.client.ReadStorageInfoResponse(this);
      result.replica_ = replica_;
      result.datanodes_ = datanodes_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dfs.model.client.ReadStorageInfoResponse) {
        return mergeFrom((com.dfs.model.client.ReadStorageInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dfs.model.client.ReadStorageInfoResponse other) {
      if (other == com.dfs.model.client.ReadStorageInfoResponse.getDefaultInstance()) return this;
      if (other.getReplica() != 0) {
        setReplica(other.getReplica());
      }
      if (!other.getDatanodes().isEmpty()) {
        datanodes_ = other.datanodes_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.dfs.model.client.ReadStorageInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dfs.model.client.ReadStorageInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int replica_ ;
    /**
     * <code>int32 replica = 1;</code>
     */
    public int getReplica() {
      return replica_;
    }
    /**
     * <code>int32 replica = 1;</code>
     */
    public Builder setReplica(int value) {
      
      replica_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 replica = 1;</code>
     */
    public Builder clearReplica() {
      
      replica_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object datanodes_ = "";
    /**
     * <code>string datanodes = 2;</code>
     */
    public java.lang.String getDatanodes() {
      java.lang.Object ref = datanodes_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        datanodes_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string datanodes = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDatanodesBytes() {
      java.lang.Object ref = datanodes_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        datanodes_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string datanodes = 2;</code>
     */
    public Builder setDatanodes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      datanodes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string datanodes = 2;</code>
     */
    public Builder clearDatanodes() {
      
      datanodes_ = getDefaultInstance().getDatanodes();
      onChanged();
      return this;
    }
    /**
     * <code>string datanodes = 2;</code>
     */
    public Builder setDatanodesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      datanodes_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.dfs.common.proto.ReadStorageInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:com.dfs.common.proto.ReadStorageInfoResponse)
  private static final com.dfs.model.client.ReadStorageInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dfs.model.client.ReadStorageInfoResponse();
  }

  public static com.dfs.model.client.ReadStorageInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadStorageInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReadStorageInfoResponse>() {
    public ReadStorageInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadStorageInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadStorageInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadStorageInfoResponse> getParserForType() {
    return PARSER;
  }

  public com.dfs.model.client.ReadStorageInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

