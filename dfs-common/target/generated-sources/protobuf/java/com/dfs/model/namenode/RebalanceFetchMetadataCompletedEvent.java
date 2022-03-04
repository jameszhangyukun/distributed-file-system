// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: namenode.proto

package com.dfs.model.namenode;

/**
 * Protobuf type {@code com.dfs.common.proto.RebalanceFetchMetadataCompletedEvent}
 */
public  final class RebalanceFetchMetadataCompletedEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dfs.common.proto.RebalanceFetchMetadataCompletedEvent)
    RebalanceFetchMetadataCompletedEventOrBuilder {
  // Use RebalanceFetchMetadataCompletedEvent.newBuilder() to construct.
  private RebalanceFetchMetadataCompletedEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RebalanceFetchMetadataCompletedEvent() {
    rebalanceNodeId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RebalanceFetchMetadataCompletedEvent(
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

            rebalanceNodeId_ = input.readInt32();
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
    return com.dfs.model.namenode.Namenode.internal_static_com_dfs_common_proto_RebalanceFetchMetadataCompletedEvent_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dfs.model.namenode.Namenode.internal_static_com_dfs_common_proto_RebalanceFetchMetadataCompletedEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent.class, com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent.Builder.class);
  }

  public static final int REBALANCENODEID_FIELD_NUMBER = 1;
  private int rebalanceNodeId_;
  /**
   * <code>int32 rebalanceNodeId = 1;</code>
   */
  public int getRebalanceNodeId() {
    return rebalanceNodeId_;
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
    if (rebalanceNodeId_ != 0) {
      output.writeInt32(1, rebalanceNodeId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rebalanceNodeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, rebalanceNodeId_);
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
    if (!(obj instanceof com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent)) {
      return super.equals(obj);
    }
    com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent other = (com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent) obj;

    boolean result = true;
    result = result && (getRebalanceNodeId()
        == other.getRebalanceNodeId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REBALANCENODEID_FIELD_NUMBER;
    hash = (53 * hash) + getRebalanceNodeId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parseFrom(
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
  public static Builder newBuilder(com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent prototype) {
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
   * Protobuf type {@code com.dfs.common.proto.RebalanceFetchMetadataCompletedEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dfs.common.proto.RebalanceFetchMetadataCompletedEvent)
      com.dfs.model.namenode.RebalanceFetchMetadataCompletedEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dfs.model.namenode.Namenode.internal_static_com_dfs_common_proto_RebalanceFetchMetadataCompletedEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dfs.model.namenode.Namenode.internal_static_com_dfs_common_proto_RebalanceFetchMetadataCompletedEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent.class, com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent.Builder.class);
    }

    // Construct using com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent.newBuilder()
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
      rebalanceNodeId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dfs.model.namenode.Namenode.internal_static_com_dfs_common_proto_RebalanceFetchMetadataCompletedEvent_descriptor;
    }

    public com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent getDefaultInstanceForType() {
      return com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent.getDefaultInstance();
    }

    public com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent build() {
      com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent buildPartial() {
      com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent result = new com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent(this);
      result.rebalanceNodeId_ = rebalanceNodeId_;
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
      if (other instanceof com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent) {
        return mergeFrom((com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent other) {
      if (other == com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent.getDefaultInstance()) return this;
      if (other.getRebalanceNodeId() != 0) {
        setRebalanceNodeId(other.getRebalanceNodeId());
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
      com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int rebalanceNodeId_ ;
    /**
     * <code>int32 rebalanceNodeId = 1;</code>
     */
    public int getRebalanceNodeId() {
      return rebalanceNodeId_;
    }
    /**
     * <code>int32 rebalanceNodeId = 1;</code>
     */
    public Builder setRebalanceNodeId(int value) {
      
      rebalanceNodeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 rebalanceNodeId = 1;</code>
     */
    public Builder clearRebalanceNodeId() {
      
      rebalanceNodeId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.dfs.common.proto.RebalanceFetchMetadataCompletedEvent)
  }

  // @@protoc_insertion_point(class_scope:com.dfs.common.proto.RebalanceFetchMetadataCompletedEvent)
  private static final com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent();
  }

  public static com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RebalanceFetchMetadataCompletedEvent>
      PARSER = new com.google.protobuf.AbstractParser<RebalanceFetchMetadataCompletedEvent>() {
    public RebalanceFetchMetadataCompletedEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RebalanceFetchMetadataCompletedEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RebalanceFetchMetadataCompletedEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RebalanceFetchMetadataCompletedEvent> getParserForType() {
    return PARSER;
  }

  public com.dfs.model.namenode.RebalanceFetchMetadataCompletedEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

