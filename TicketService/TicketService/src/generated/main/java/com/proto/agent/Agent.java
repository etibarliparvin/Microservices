// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent/agent.proto

package com.proto.agent;

public final class Agent {
  private Agent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_agent_ProtoFindByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_agent_ProtoFindByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_agent_ProtoTicketRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_agent_ProtoTicketRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_agent_ProtoTicketBetlineRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_agent_ProtoTicketBetlineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_agent_ProtoTicketResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_agent_ProtoTicketResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_agent_ProtoTicketBetlineResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_agent_ProtoTicketBetlineResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021agent/agent.proto\022\005agent\032\037google/proto" +
      "buf/timestamp.proto\"\"\n\024ProtoFindByIdRequ" +
      "est\022\n\n\002id\030\001 \001(\003\"\211\002\n\022ProtoTicketRequest\022\017" +
      "\n\007barcode\030\001 \001(\t\022\023\n\013cashierCode\030\002 \001(\t\022\017\n\007" +
      "betType\030\003 \001(\t\022\023\n\013stakeAmound\030\004 \001(\t\022\026\n\016to" +
      "talWinAmount\030\005 \001(\t\022\026\n\016totalPayAmount\030\006 \001" +
      "(\t\022\017\n\007betTime\030\007 \001(\t\022\024\n\014ticketStatus\030\010 \001(" +
      "\t\022\013\n\003odd\030\t \001(\t\022C\n\031protoTicketBetlineRequ" +
      "est\030\n \003(\0132 .agent.ProtoTicketBetlineRequ" +
      "est\"\223\001\n\031ProtoTicketBetlineRequest\022\020\n\010tic" +
      "ketId\030\001 \001(\003\022\r\n\005event\030\002 \001(\t\022\021\n\tsportName\030" +
      "\003 \001(\t\022\024\n\014languageName\030\004 \001(\t\022\024\n\014categoryN" +
      "ame\030\005 \001(\t\022\026\n\016eventStartTime\030\006 \001(\t\"\230\002\n\023Pr" +
      "otoTicketResponse\022\n\n\002id\030\001 \001(\003\022\017\n\007barcode" +
      "\030\002 \001(\t\022\023\n\013cashierCode\030\003 \001(\t\022\017\n\007betType\030\004" +
      " \001(\t\022\023\n\013stakeAmount\030\005 \001(\t\022\026\n\016totalWinAmo" +
      "unt\030\006 \001(\t\022\026\n\016totalPayAmount\030\007 \001(\t\022\017\n\007bet" +
      "Time\030\010 \001(\t\022\024\n\014ticketStatus\030\t \001(\t\022\013\n\003odd\030" +
      "\n \001(\t\022E\n\032protoTicketBetlineResponse\030\013 \003(" +
      "\0132!.agent.ProtoTicketBetlineResponse\"\240\001\n" +
      "\032ProtoTicketBetlineResponse\022\n\n\002id\030\001 \001(\003\022" +
      "\020\n\010ticketId\030\002 \001(\003\022\r\n\005event\030\003 \001(\t\022\021\n\tspor" +
      "tName\030\004 \001(\t\022\024\n\014languageName\030\005 \001(\t\022\024\n\014cat" +
      "egoryName\030\006 \001(\t\022\026\n\016eventStartTime\030\007 \001(\t2" +
      "\240\001\n\022ProtoTicketService\022C\n\010findById\022\033.age" +
      "nt.ProtoFindByIdRequest\032\032.agent.ProtoTic" +
      "ketResponse\022E\n\014createTicket\022\031.agent.Prot" +
      "oTicketRequest\032\032.agent.ProtoTicketRespon" +
      "seB\023\n\017com.proto.agentP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_agent_ProtoFindByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_agent_ProtoFindByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_agent_ProtoFindByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_agent_ProtoTicketRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_agent_ProtoTicketRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_agent_ProtoTicketRequest_descriptor,
        new java.lang.String[] { "Barcode", "CashierCode", "BetType", "StakeAmound", "TotalWinAmount", "TotalPayAmount", "BetTime", "TicketStatus", "Odd", "ProtoTicketBetlineRequest", });
    internal_static_agent_ProtoTicketBetlineRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_agent_ProtoTicketBetlineRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_agent_ProtoTicketBetlineRequest_descriptor,
        new java.lang.String[] { "TicketId", "Event", "SportName", "LanguageName", "CategoryName", "EventStartTime", });
    internal_static_agent_ProtoTicketResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_agent_ProtoTicketResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_agent_ProtoTicketResponse_descriptor,
        new java.lang.String[] { "Id", "Barcode", "CashierCode", "BetType", "StakeAmount", "TotalWinAmount", "TotalPayAmount", "BetTime", "TicketStatus", "Odd", "ProtoTicketBetlineResponse", });
    internal_static_agent_ProtoTicketBetlineResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_agent_ProtoTicketBetlineResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_agent_ProtoTicketBetlineResponse_descriptor,
        new java.lang.String[] { "Id", "TicketId", "Event", "SportName", "LanguageName", "CategoryName", "EventStartTime", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
