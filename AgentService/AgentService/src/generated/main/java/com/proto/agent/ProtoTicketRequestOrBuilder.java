// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent/agent.proto

package com.proto.agent;

public interface ProtoTicketRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:agent.ProtoTicketRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string barcode = 1;</code>
   * @return The barcode.
   */
  java.lang.String getBarcode();
  /**
   * <code>string barcode = 1;</code>
   * @return The bytes for barcode.
   */
  com.google.protobuf.ByteString
      getBarcodeBytes();

  /**
   * <code>string cashierCode = 2;</code>
   * @return The cashierCode.
   */
  java.lang.String getCashierCode();
  /**
   * <code>string cashierCode = 2;</code>
   * @return The bytes for cashierCode.
   */
  com.google.protobuf.ByteString
      getCashierCodeBytes();

  /**
   * <code>string betType = 3;</code>
   * @return The betType.
   */
  java.lang.String getBetType();
  /**
   * <code>string betType = 3;</code>
   * @return The bytes for betType.
   */
  com.google.protobuf.ByteString
      getBetTypeBytes();

  /**
   * <code>double stakeAmount = 4;</code>
   * @return The stakeAmount.
   */
  double getStakeAmount();

  /**
   * <code>double totalWinAmount = 5;</code>
   * @return The totalWinAmount.
   */
  double getTotalWinAmount();

  /**
   * <code>double totalPayAmount = 6;</code>
   * @return The totalPayAmount.
   */
  double getTotalPayAmount();

  /**
   * <code>int64 betTime = 7;</code>
   * @return The betTime.
   */
  long getBetTime();

  /**
   * <code>string ticketStatus = 8;</code>
   * @return The ticketStatus.
   */
  java.lang.String getTicketStatus();
  /**
   * <code>string ticketStatus = 8;</code>
   * @return The bytes for ticketStatus.
   */
  com.google.protobuf.ByteString
      getTicketStatusBytes();

  /**
   * <code>double odd = 9;</code>
   * @return The odd.
   */
  double getOdd();

  /**
   * <code>repeated .agent.ProtoTicketBetlineRequest protoTicketBetlineRequest = 10;</code>
   */
  java.util.List<com.proto.agent.ProtoTicketBetlineRequest> 
      getProtoTicketBetlineRequestList();
  /**
   * <code>repeated .agent.ProtoTicketBetlineRequest protoTicketBetlineRequest = 10;</code>
   */
  com.proto.agent.ProtoTicketBetlineRequest getProtoTicketBetlineRequest(int index);
  /**
   * <code>repeated .agent.ProtoTicketBetlineRequest protoTicketBetlineRequest = 10;</code>
   */
  int getProtoTicketBetlineRequestCount();
  /**
   * <code>repeated .agent.ProtoTicketBetlineRequest protoTicketBetlineRequest = 10;</code>
   */
  java.util.List<? extends com.proto.agent.ProtoTicketBetlineRequestOrBuilder> 
      getProtoTicketBetlineRequestOrBuilderList();
  /**
   * <code>repeated .agent.ProtoTicketBetlineRequest protoTicketBetlineRequest = 10;</code>
   */
  com.proto.agent.ProtoTicketBetlineRequestOrBuilder getProtoTicketBetlineRequestOrBuilder(
      int index);
}
