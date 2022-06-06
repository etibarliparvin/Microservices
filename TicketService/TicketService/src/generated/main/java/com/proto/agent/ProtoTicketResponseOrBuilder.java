// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent/agent.proto

package com.proto.agent;

public interface ProtoTicketResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:agent.ProtoTicketResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string barcode = 2;</code>
   * @return The barcode.
   */
  java.lang.String getBarcode();
  /**
   * <code>string barcode = 2;</code>
   * @return The bytes for barcode.
   */
  com.google.protobuf.ByteString
      getBarcodeBytes();

  /**
   * <code>string cashierCode = 3;</code>
   * @return The cashierCode.
   */
  java.lang.String getCashierCode();
  /**
   * <code>string cashierCode = 3;</code>
   * @return The bytes for cashierCode.
   */
  com.google.protobuf.ByteString
      getCashierCodeBytes();

  /**
   * <code>string betType = 4;</code>
   * @return The betType.
   */
  java.lang.String getBetType();
  /**
   * <code>string betType = 4;</code>
   * @return The bytes for betType.
   */
  com.google.protobuf.ByteString
      getBetTypeBytes();

  /**
   * <code>double stakeAmount = 5;</code>
   * @return The stakeAmount.
   */
  double getStakeAmount();

  /**
   * <code>double totalWinAmount = 6;</code>
   * @return The totalWinAmount.
   */
  double getTotalWinAmount();

  /**
   * <code>double totalPayAmount = 7;</code>
   * @return The totalPayAmount.
   */
  double getTotalPayAmount();

  /**
   * <code>float betTime = 8;</code>
   * @return The betTime.
   */
  float getBetTime();

  /**
   * <code>string ticketStatus = 9;</code>
   * @return The ticketStatus.
   */
  java.lang.String getTicketStatus();
  /**
   * <code>string ticketStatus = 9;</code>
   * @return The bytes for ticketStatus.
   */
  com.google.protobuf.ByteString
      getTicketStatusBytes();

  /**
   * <code>double odd = 10;</code>
   * @return The odd.
   */
  double getOdd();

  /**
   * <code>repeated .agent.ProtoTicketBetlineResponse protoTicketBetlineResponse = 11;</code>
   */
  java.util.List<com.proto.agent.ProtoTicketBetlineResponse> 
      getProtoTicketBetlineResponseList();
  /**
   * <code>repeated .agent.ProtoTicketBetlineResponse protoTicketBetlineResponse = 11;</code>
   */
  com.proto.agent.ProtoTicketBetlineResponse getProtoTicketBetlineResponse(int index);
  /**
   * <code>repeated .agent.ProtoTicketBetlineResponse protoTicketBetlineResponse = 11;</code>
   */
  int getProtoTicketBetlineResponseCount();
  /**
   * <code>repeated .agent.ProtoTicketBetlineResponse protoTicketBetlineResponse = 11;</code>
   */
  java.util.List<? extends com.proto.agent.ProtoTicketBetlineResponseOrBuilder> 
      getProtoTicketBetlineResponseOrBuilderList();
  /**
   * <code>repeated .agent.ProtoTicketBetlineResponse protoTicketBetlineResponse = 11;</code>
   */
  com.proto.agent.ProtoTicketBetlineResponseOrBuilder getProtoTicketBetlineResponseOrBuilder(
      int index);
}
