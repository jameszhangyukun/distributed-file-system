// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backupnode.proto

package com.dfs.model.backup;

public final class Backupnode {
  private Backupnode() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_FetchEditsLogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_FetchEditsLogResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_FetchEditsLogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_FetchEditsLogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_EditLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_EditLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_EditLog_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_EditLog_AttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_INode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_INode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_INode_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_INode_AttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_BackupNodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_BackupNodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_NameNodeConf_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_NameNodeConf_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_NameNodeConf_ValuesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_NameNodeConf_ValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_BackupNodeSlots_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_BackupNodeSlots_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_dfs_common_proto_BackupNodeSlots_SlotsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_dfs_common_proto_BackupNodeSlots_SlotsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020backupnode.proto\022\024com.dfs.common.proto" +
      "\032\016namenode.proto\"y\n\025FetchEditsLogRespons" +
      "e\022/\n\010editLogs\030\001 \003(\0132\035.com.dfs.common.pro" +
      "to.EditLog\022/\n\005users\030\002 \003(\0132 .com.dfs.comm" +
      "on.proto.UserEntity\"7\n\024FetchEditsLogRequ" +
      "est\022\014\n\004txId\030\001 \001(\003\022\021\n\tneedSlots\030\002 \001(\010\"\231\001\n" +
      "\007EditLog\022\014\n\004txId\030\001 \001(\003\022\016\n\006opType\030\002 \001(\005\022\014" +
      "\n\004path\030\003 \001(\t\0225\n\004attr\030\004 \003(\0132\'.com.dfs.com" +
      "mon.proto.EditLog.AttrEntry\032+\n\tAttrEntry" +
      "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\264\001\n\005INo",
      "de\022\014\n\004path\030\001 \001(\t\022\014\n\004type\030\002 \001(\005\022-\n\010childr" +
      "en\030\003 \003(\0132\033.com.dfs.common.proto.INode\0223\n" +
      "\004attr\030\004 \003(\0132%.com.dfs.common.proto.INode" +
      ".AttrEntry\032+\n\tAttrEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001\"0\n\016BackupNodeInfo\022\020\n\010hos" +
      "tname\030\001 \001(\t\022\014\n\004port\030\002 \001(\005\"}\n\014NameNodeCon" +
      "f\022>\n\006values\030\001 \003(\0132..com.dfs.common.proto" +
      ".NameNodeConf.ValuesEntry\032-\n\013ValuesEntry" +
      "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\200\001\n\017Bac" +
      "kupNodeSlots\022?\n\005slots\030\001 \003(\01320.com.dfs.co",
      "mmon.proto.BackupNodeSlots.SlotsEntry\032,\n" +
      "\nSlotsEntry\022\013\n\003key\030\001 \001(\005\022\r\n\005value\030\002 \001(\005:" +
      "\0028\001B\030\n\024com.dfs.model.backupP\001b\006proto3"
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
          com.dfs.model.namenode.Namenode.getDescriptor(),
        }, assigner);
    internal_static_com_dfs_common_proto_FetchEditsLogResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_dfs_common_proto_FetchEditsLogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_FetchEditsLogResponse_descriptor,
        new java.lang.String[] { "EditLogs", "Users", });
    internal_static_com_dfs_common_proto_FetchEditsLogRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_dfs_common_proto_FetchEditsLogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_FetchEditsLogRequest_descriptor,
        new java.lang.String[] { "TxId", "NeedSlots", });
    internal_static_com_dfs_common_proto_EditLog_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_dfs_common_proto_EditLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_EditLog_descriptor,
        new java.lang.String[] { "TxId", "OpType", "Path", "Attr", });
    internal_static_com_dfs_common_proto_EditLog_AttrEntry_descriptor =
      internal_static_com_dfs_common_proto_EditLog_descriptor.getNestedTypes().get(0);
    internal_static_com_dfs_common_proto_EditLog_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_EditLog_AttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_dfs_common_proto_INode_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_dfs_common_proto_INode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_INode_descriptor,
        new java.lang.String[] { "Path", "Type", "Children", "Attr", });
    internal_static_com_dfs_common_proto_INode_AttrEntry_descriptor =
      internal_static_com_dfs_common_proto_INode_descriptor.getNestedTypes().get(0);
    internal_static_com_dfs_common_proto_INode_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_INode_AttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_dfs_common_proto_BackupNodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_dfs_common_proto_BackupNodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_BackupNodeInfo_descriptor,
        new java.lang.String[] { "Hostname", "Port", });
    internal_static_com_dfs_common_proto_NameNodeConf_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_dfs_common_proto_NameNodeConf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_NameNodeConf_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_com_dfs_common_proto_NameNodeConf_ValuesEntry_descriptor =
      internal_static_com_dfs_common_proto_NameNodeConf_descriptor.getNestedTypes().get(0);
    internal_static_com_dfs_common_proto_NameNodeConf_ValuesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_NameNodeConf_ValuesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_dfs_common_proto_BackupNodeSlots_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_dfs_common_proto_BackupNodeSlots_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_BackupNodeSlots_descriptor,
        new java.lang.String[] { "Slots", });
    internal_static_com_dfs_common_proto_BackupNodeSlots_SlotsEntry_descriptor =
      internal_static_com_dfs_common_proto_BackupNodeSlots_descriptor.getNestedTypes().get(0);
    internal_static_com_dfs_common_proto_BackupNodeSlots_SlotsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_dfs_common_proto_BackupNodeSlots_SlotsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.dfs.model.namenode.Namenode.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
