// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dfs-client.proto

package com.dfs.model.client;

public final class DfsClient {
  private DfsClient() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_MkdirRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_MkdirRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_MkdirRequest_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_MkdirRequest_AttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_GetDataNodeForFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_GetDataNodeForFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_GetDataNodeForFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_GetDataNodeForFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_CreateFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_CreateFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_CreateFileRequest_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_CreateFileRequest_AttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_CreateFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_CreateFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_AuthenticateInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_AuthenticateInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_AuthenticateInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_AuthenticateInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_RemoveFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_RemoveFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_ReadAttrRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_ReadAttrRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_ReadAttrResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_ReadAttrResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_ReadAttrResponse_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_ReadAttrResponse_AttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_ReadStorageInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_ReadStorageInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_ReadStorageInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_ReadStorageInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_PreCalculateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_PreCalculateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_PreCalculateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_PreCalculateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_GetAllFilenameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_GetAllFilenameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_GetAllFilenameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_GetAllFilenameResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020dfs-client.proto\022\024com.dfs.common.proto" +
      "\032\rcommons.proto\"\205\001\n\014MkdirRequest\022\014\n\004path" +
      "\030\001 \001(\t\022:\n\004attr\030\002 \003(\0132,.com.dfs.common.pr" +
      "oto.MkdirRequest.AttrEntry\032+\n\tAttrEntry\022" +
      "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"-\n\031GetDa" +
      "taNodeForFileRequest\022\020\n\010filename\030\001 \001(\t\"d" +
      "\n\032GetDataNodeForFileResponse\0220\n\010dataNode" +
      "\030\001 \001(\0132\036.com.dfs.common.proto.DataNode\022\024" +
      "\n\014realFileName\030\002 \001(\t\"\245\001\n\021CreateFileReque" +
      "st\022\020\n\010filename\030\001 \001(\t\022\020\n\010fileSize\030\002 \001(\t\022?",
      "\n\004attr\030\003 \003(\01321.com.dfs.common.proto.Crea" +
      "teFileRequest.AttrEntry\032+\n\tAttrEntry\022\013\n\003" +
      "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"]\n\022CreateFi" +
      "leResponse\0221\n\tdataNodes\030\001 \003(\0132\036.com.dfs." +
      "common.proto.DataNode\022\024\n\014realFileName\030\002 " +
      "\001(\t\"3\n\027AuthenticateInfoRequest\022\030\n\020authen" +
      "ticateInfo\030\001 \001(\t\")\n\030AuthenticateInfoResp" +
      "onse\022\r\n\005token\030\001 \001(\t\"%\n\021RemoveFileRequest" +
      "\022\020\n\010filename\030\001 \001(\t\"#\n\017ReadAttrRequest\022\020\n" +
      "\010filename\030\001 \001(\t\"\177\n\020ReadAttrResponse\022>\n\004a",
      "ttr\030\001 \003(\01320.com.dfs.common.proto.ReadAtt" +
      "rResponse.AttrEntry\032+\n\tAttrEntry\022\013\n\003key\030" +
      "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"*\n\026ReadStorageI" +
      "nfoRequest\022\020\n\010filename\030\001 \001(\t\"=\n\027ReadStor" +
      "ageInfoResponse\022\017\n\007replica\030\001 \001(\005\022\021\n\tdata" +
      "nodes\030\002 \001(\t\"#\n\023PreCalculateRequest\022\014\n\004pa" +
      "th\030\001 \001(\t\"<\n\024PreCalculateResponse\022\021\n\tfile" +
      "Count\030\001 \001(\005\022\021\n\ttotalSize\030\002 \001(\003\"%\n\025GetAll" +
      "FilenameRequest\022\014\n\004path\030\001 \001(\t\"*\n\026GetAllF" +
      "ilenameResponse\022\020\n\010filename\030\001 \003(\tB\030\n\024com",
      ".dfs.model.clientP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dfs.model.common.Commons.getDescriptor(),
        }, assigner);
    internal_static_com_dfs_common_proto_MkdirRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_dfs_common_proto_MkdirRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_MkdirRequest_descriptor,
        new java.lang.String[] { "Path", "Attr", });
    internal_static_com_dfs_common_proto_MkdirRequest_AttrEntry_descriptor =
      internal_static_com_dfs_common_proto_MkdirRequest_descriptor.getNestedTypes().get(0);
    internal_static_com_dfs_common_proto_MkdirRequest_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_MkdirRequest_AttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_dfs_common_proto_GetDataNodeForFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_dfs_common_proto_GetDataNodeForFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_GetDataNodeForFileRequest_descriptor,
        new java.lang.String[] { "Filename", });
    internal_static_com_dfs_common_proto_GetDataNodeForFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_dfs_common_proto_GetDataNodeForFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_GetDataNodeForFileResponse_descriptor,
        new java.lang.String[] { "DataNode", "RealFileName", });
    internal_static_com_dfs_common_proto_CreateFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_dfs_common_proto_CreateFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_CreateFileRequest_descriptor,
        new java.lang.String[] { "Filename", "FileSize", "Attr", });
    internal_static_com_dfs_common_proto_CreateFileRequest_AttrEntry_descriptor =
      internal_static_com_dfs_common_proto_CreateFileRequest_descriptor.getNestedTypes().get(0);
    internal_static_com_dfs_common_proto_CreateFileRequest_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_CreateFileRequest_AttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_dfs_common_proto_CreateFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_dfs_common_proto_CreateFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_CreateFileResponse_descriptor,
        new java.lang.String[] { "DataNodes", "RealFileName", });
    internal_static_com_dfs_common_proto_AuthenticateInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_dfs_common_proto_AuthenticateInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_AuthenticateInfoRequest_descriptor,
        new java.lang.String[] { "AuthenticateInfo", });
    internal_static_com_dfs_common_proto_AuthenticateInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_dfs_common_proto_AuthenticateInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_AuthenticateInfoResponse_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_com_dfs_common_proto_RemoveFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_dfs_common_proto_RemoveFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_RemoveFileRequest_descriptor,
        new java.lang.String[] { "Filename", });
    internal_static_com_dfs_common_proto_ReadAttrRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_dfs_common_proto_ReadAttrRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_ReadAttrRequest_descriptor,
        new java.lang.String[] { "Filename", });
    internal_static_com_dfs_common_proto_ReadAttrResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_dfs_common_proto_ReadAttrResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_ReadAttrResponse_descriptor,
        new java.lang.String[] { "Attr", });
    internal_static_com_dfs_common_proto_ReadAttrResponse_AttrEntry_descriptor =
      internal_static_com_dfs_common_proto_ReadAttrResponse_descriptor.getNestedTypes().get(0);
    internal_static_com_dfs_common_proto_ReadAttrResponse_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_ReadAttrResponse_AttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_dfs_common_proto_ReadStorageInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_dfs_common_proto_ReadStorageInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_ReadStorageInfoRequest_descriptor,
        new java.lang.String[] { "Filename", });
    internal_static_com_dfs_common_proto_ReadStorageInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_dfs_common_proto_ReadStorageInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_ReadStorageInfoResponse_descriptor,
        new java.lang.String[] { "Replica", "Datanodes", });
    internal_static_com_dfs_common_proto_PreCalculateRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_dfs_common_proto_PreCalculateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_PreCalculateRequest_descriptor,
        new java.lang.String[] { "Path", });
    internal_static_com_dfs_common_proto_PreCalculateResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_dfs_common_proto_PreCalculateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_PreCalculateResponse_descriptor,
        new java.lang.String[] { "FileCount", "TotalSize", });
    internal_static_com_dfs_common_proto_GetAllFilenameRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_com_dfs_common_proto_GetAllFilenameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_GetAllFilenameRequest_descriptor,
        new java.lang.String[] { "Path", });
    internal_static_com_dfs_common_proto_GetAllFilenameResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_com_dfs_common_proto_GetAllFilenameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_GetAllFilenameResponse_descriptor,
        new java.lang.String[] { "Filename", });
    com.dfs.model.common.Commons.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
