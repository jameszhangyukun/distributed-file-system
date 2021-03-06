// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dfs-client.proto

package com.dfs.model.client;

/**
 * Protobuf type {@code com.dfs.common.proto.GetAllFilenameResponse}
 */
public  final class GetAllFilenameResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dfs.common.proto.GetAllFilenameResponse)
    GetAllFilenameResponseOrBuilder {
  // Use GetAllFilenameResponse.newBuilder() to construct.
  private GetAllFilenameResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAllFilenameResponse() {
    filename_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetAllFilenameResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              filename_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            filename_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        filename_ = filename_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_GetAllFilenameResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_GetAllFilenameResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dfs.model.client.GetAllFilenameResponse.class, com.dfs.model.client.GetAllFilenameResponse.Builder.class);
  }

  public static final int FILENAME_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList filename_;
  /**
   * <code>repeated string filename = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getFilenameList() {
    return filename_;
  }
  /**
   * <code>repeated string filename = 1;</code>
   */
  public int getFilenameCount() {
    return filename_.size();
  }
  /**
   * <code>repeated string filename = 1;</code>
   */
  public java.lang.String getFilename(int index) {
    return filename_.get(index);
  }
  /**
   * <code>repeated string filename = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFilenameBytes(int index) {
    return filename_.getByteString(index);
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
    for (int i = 0; i < filename_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filename_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < filename_.size(); i++) {
        dataSize += computeStringSizeNoTag(filename_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFilenameList().size();
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
    if (!(obj instanceof com.dfs.model.client.GetAllFilenameResponse)) {
      return super.equals(obj);
    }
    com.dfs.model.client.GetAllFilenameResponse other = (com.dfs.model.client.GetAllFilenameResponse) obj;

    boolean result = true;
    result = result && getFilenameList()
        .equals(other.getFilenameList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFilenameCount() > 0) {
      hash = (37 * hash) + FILENAME_FIELD_NUMBER;
      hash = (53 * hash) + getFilenameList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dfs.model.client.GetAllFilenameResponse parseFrom(
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
  public static Builder newBuilder(com.dfs.model.client.GetAllFilenameResponse prototype) {
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
   * Protobuf type {@code com.dfs.common.proto.GetAllFilenameResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dfs.common.proto.GetAllFilenameResponse)
      com.dfs.model.client.GetAllFilenameResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_GetAllFilenameResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_GetAllFilenameResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dfs.model.client.GetAllFilenameResponse.class, com.dfs.model.client.GetAllFilenameResponse.Builder.class);
    }

    // Construct using com.dfs.model.client.GetAllFilenameResponse.newBuilder()
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
      filename_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dfs.model.client.DfsClient.internal_static_com_dfs_common_proto_GetAllFilenameResponse_descriptor;
    }

    public com.dfs.model.client.GetAllFilenameResponse getDefaultInstanceForType() {
      return com.dfs.model.client.GetAllFilenameResponse.getDefaultInstance();
    }

    public com.dfs.model.client.GetAllFilenameResponse build() {
      com.dfs.model.client.GetAllFilenameResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.dfs.model.client.GetAllFilenameResponse buildPartial() {
      com.dfs.model.client.GetAllFilenameResponse result = new com.dfs.model.client.GetAllFilenameResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        filename_ = filename_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.filename_ = filename_;
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
      if (other instanceof com.dfs.model.client.GetAllFilenameResponse) {
        return mergeFrom((com.dfs.model.client.GetAllFilenameResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dfs.model.client.GetAllFilenameResponse other) {
      if (other == com.dfs.model.client.GetAllFilenameResponse.getDefaultInstance()) return this;
      if (!other.filename_.isEmpty()) {
        if (filename_.isEmpty()) {
          filename_ = other.filename_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFilenameIsMutable();
          filename_.addAll(other.filename_);
        }
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
      com.dfs.model.client.GetAllFilenameResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dfs.model.client.GetAllFilenameResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList filename_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFilenameIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        filename_ = new com.google.protobuf.LazyStringArrayList(filename_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string filename = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getFilenameList() {
      return filename_.getUnmodifiableView();
    }
    /**
     * <code>repeated string filename = 1;</code>
     */
    public int getFilenameCount() {
      return filename_.size();
    }
    /**
     * <code>repeated string filename = 1;</code>
     */
    public java.lang.String getFilename(int index) {
      return filename_.get(index);
    }
    /**
     * <code>repeated string filename = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFilenameBytes(int index) {
      return filename_.getByteString(index);
    }
    /**
     * <code>repeated string filename = 1;</code>
     */
    public Builder setFilename(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFilenameIsMutable();
      filename_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string filename = 1;</code>
     */
    public Builder addFilename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFilenameIsMutable();
      filename_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string filename = 1;</code>
     */
    public Builder addAllFilename(
        java.lang.Iterable<java.lang.String> values) {
      ensureFilenameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, filename_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string filename = 1;</code>
     */
    public Builder clearFilename() {
      filename_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string filename = 1;</code>
     */
    public Builder addFilenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureFilenameIsMutable();
      filename_.add(value);
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


    // @@protoc_insertion_point(builder_scope:com.dfs.common.proto.GetAllFilenameResponse)
  }

  // @@protoc_insertion_point(class_scope:com.dfs.common.proto.GetAllFilenameResponse)
  private static final com.dfs.model.client.GetAllFilenameResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dfs.model.client.GetAllFilenameResponse();
  }

  public static com.dfs.model.client.GetAllFilenameResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAllFilenameResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAllFilenameResponse>() {
    public GetAllFilenameResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAllFilenameResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAllFilenameResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAllFilenameResponse> getParserForType() {
    return PARSER;
  }

  public com.dfs.model.client.GetAllFilenameResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

