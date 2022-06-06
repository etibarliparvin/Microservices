// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agent/agent.proto

package com.proto.agent;

/**
 * Protobuf type {@code agent.ProtoTicketBetlineResponse}
 */
public final class ProtoTicketBetlineResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:agent.ProtoTicketBetlineResponse)
    ProtoTicketBetlineResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProtoTicketBetlineResponse.newBuilder() to construct.
  private ProtoTicketBetlineResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProtoTicketBetlineResponse() {
    event_ = "";
    sportName_ = "";
    languageName_ = "";
    categoryName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProtoTicketBetlineResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProtoTicketBetlineResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 16: {

            ticketId_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            event_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            sportName_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            languageName_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            categoryName_ = s;
            break;
          }
          case 56: {

            eventStartTime_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.agent.Agent.internal_static_agent_ProtoTicketBetlineResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.agent.Agent.internal_static_agent_ProtoTicketBetlineResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.agent.ProtoTicketBetlineResponse.class, com.proto.agent.ProtoTicketBetlineResponse.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int TICKETID_FIELD_NUMBER = 2;
  private long ticketId_;
  /**
   * <code>int64 ticketId = 2;</code>
   * @return The ticketId.
   */
  @java.lang.Override
  public long getTicketId() {
    return ticketId_;
  }

  public static final int EVENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object event_;
  /**
   * <code>string event = 3;</code>
   * @return The event.
   */
  @java.lang.Override
  public java.lang.String getEvent() {
    java.lang.Object ref = event_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      event_ = s;
      return s;
    }
  }
  /**
   * <code>string event = 3;</code>
   * @return The bytes for event.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventBytes() {
    java.lang.Object ref = event_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      event_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPORTNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object sportName_;
  /**
   * <code>string sportName = 4;</code>
   * @return The sportName.
   */
  @java.lang.Override
  public java.lang.String getSportName() {
    java.lang.Object ref = sportName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sportName_ = s;
      return s;
    }
  }
  /**
   * <code>string sportName = 4;</code>
   * @return The bytes for sportName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSportNameBytes() {
    java.lang.Object ref = sportName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sportName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGENAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object languageName_;
  /**
   * <code>string languageName = 5;</code>
   * @return The languageName.
   */
  @java.lang.Override
  public java.lang.String getLanguageName() {
    java.lang.Object ref = languageName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageName_ = s;
      return s;
    }
  }
  /**
   * <code>string languageName = 5;</code>
   * @return The bytes for languageName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageNameBytes() {
    java.lang.Object ref = languageName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CATEGORYNAME_FIELD_NUMBER = 6;
  private volatile java.lang.Object categoryName_;
  /**
   * <code>string categoryName = 6;</code>
   * @return The categoryName.
   */
  @java.lang.Override
  public java.lang.String getCategoryName() {
    java.lang.Object ref = categoryName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      categoryName_ = s;
      return s;
    }
  }
  /**
   * <code>string categoryName = 6;</code>
   * @return The bytes for categoryName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCategoryNameBytes() {
    java.lang.Object ref = categoryName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      categoryName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENTSTARTTIME_FIELD_NUMBER = 7;
  private long eventStartTime_;
  /**
   * <code>int64 eventStartTime = 7;</code>
   * @return The eventStartTime.
   */
  @java.lang.Override
  public long getEventStartTime() {
    return eventStartTime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (ticketId_ != 0L) {
      output.writeInt64(2, ticketId_);
    }
    if (!getEventBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, event_);
    }
    if (!getSportNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sportName_);
    }
    if (!getLanguageNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, languageName_);
    }
    if (!getCategoryNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, categoryName_);
    }
    if (eventStartTime_ != 0L) {
      output.writeInt64(7, eventStartTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (ticketId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, ticketId_);
    }
    if (!getEventBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, event_);
    }
    if (!getSportNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sportName_);
    }
    if (!getLanguageNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, languageName_);
    }
    if (!getCategoryNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, categoryName_);
    }
    if (eventStartTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, eventStartTime_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.agent.ProtoTicketBetlineResponse)) {
      return super.equals(obj);
    }
    com.proto.agent.ProtoTicketBetlineResponse other = (com.proto.agent.ProtoTicketBetlineResponse) obj;

    if (getId()
        != other.getId()) return false;
    if (getTicketId()
        != other.getTicketId()) return false;
    if (!getEvent()
        .equals(other.getEvent())) return false;
    if (!getSportName()
        .equals(other.getSportName())) return false;
    if (!getLanguageName()
        .equals(other.getLanguageName())) return false;
    if (!getCategoryName()
        .equals(other.getCategoryName())) return false;
    if (getEventStartTime()
        != other.getEventStartTime()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + TICKETID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTicketId());
    hash = (37 * hash) + EVENT_FIELD_NUMBER;
    hash = (53 * hash) + getEvent().hashCode();
    hash = (37 * hash) + SPORTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getSportName().hashCode();
    hash = (37 * hash) + LANGUAGENAME_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageName().hashCode();
    hash = (37 * hash) + CATEGORYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCategoryName().hashCode();
    hash = (37 * hash) + EVENTSTARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEventStartTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.agent.ProtoTicketBetlineResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.agent.ProtoTicketBetlineResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code agent.ProtoTicketBetlineResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:agent.ProtoTicketBetlineResponse)
      com.proto.agent.ProtoTicketBetlineResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.agent.Agent.internal_static_agent_ProtoTicketBetlineResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.agent.Agent.internal_static_agent_ProtoTicketBetlineResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.agent.ProtoTicketBetlineResponse.class, com.proto.agent.ProtoTicketBetlineResponse.Builder.class);
    }

    // Construct using com.proto.agent.ProtoTicketBetlineResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      ticketId_ = 0L;

      event_ = "";

      sportName_ = "";

      languageName_ = "";

      categoryName_ = "";

      eventStartTime_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.agent.Agent.internal_static_agent_ProtoTicketBetlineResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.agent.ProtoTicketBetlineResponse getDefaultInstanceForType() {
      return com.proto.agent.ProtoTicketBetlineResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.agent.ProtoTicketBetlineResponse build() {
      com.proto.agent.ProtoTicketBetlineResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.agent.ProtoTicketBetlineResponse buildPartial() {
      com.proto.agent.ProtoTicketBetlineResponse result = new com.proto.agent.ProtoTicketBetlineResponse(this);
      result.id_ = id_;
      result.ticketId_ = ticketId_;
      result.event_ = event_;
      result.sportName_ = sportName_;
      result.languageName_ = languageName_;
      result.categoryName_ = categoryName_;
      result.eventStartTime_ = eventStartTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.agent.ProtoTicketBetlineResponse) {
        return mergeFrom((com.proto.agent.ProtoTicketBetlineResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.agent.ProtoTicketBetlineResponse other) {
      if (other == com.proto.agent.ProtoTicketBetlineResponse.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getTicketId() != 0L) {
        setTicketId(other.getTicketId());
      }
      if (!other.getEvent().isEmpty()) {
        event_ = other.event_;
        onChanged();
      }
      if (!other.getSportName().isEmpty()) {
        sportName_ = other.sportName_;
        onChanged();
      }
      if (!other.getLanguageName().isEmpty()) {
        languageName_ = other.languageName_;
        onChanged();
      }
      if (!other.getCategoryName().isEmpty()) {
        categoryName_ = other.categoryName_;
        onChanged();
      }
      if (other.getEventStartTime() != 0L) {
        setEventStartTime(other.getEventStartTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.agent.ProtoTicketBetlineResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.agent.ProtoTicketBetlineResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private long ticketId_ ;
    /**
     * <code>int64 ticketId = 2;</code>
     * @return The ticketId.
     */
    @java.lang.Override
    public long getTicketId() {
      return ticketId_;
    }
    /**
     * <code>int64 ticketId = 2;</code>
     * @param value The ticketId to set.
     * @return This builder for chaining.
     */
    public Builder setTicketId(long value) {
      
      ticketId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ticketId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketId() {
      
      ticketId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object event_ = "";
    /**
     * <code>string event = 3;</code>
     * @return The event.
     */
    public java.lang.String getEvent() {
      java.lang.Object ref = event_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        event_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event = 3;</code>
     * @return The bytes for event.
     */
    public com.google.protobuf.ByteString
        getEventBytes() {
      java.lang.Object ref = event_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        event_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event = 3;</code>
     * @param value The event to set.
     * @return This builder for chaining.
     */
    public Builder setEvent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      event_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string event = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvent() {
      
      event_ = getDefaultInstance().getEvent();
      onChanged();
      return this;
    }
    /**
     * <code>string event = 3;</code>
     * @param value The bytes for event to set.
     * @return This builder for chaining.
     */
    public Builder setEventBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      event_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sportName_ = "";
    /**
     * <code>string sportName = 4;</code>
     * @return The sportName.
     */
    public java.lang.String getSportName() {
      java.lang.Object ref = sportName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sportName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sportName = 4;</code>
     * @return The bytes for sportName.
     */
    public com.google.protobuf.ByteString
        getSportNameBytes() {
      java.lang.Object ref = sportName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sportName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sportName = 4;</code>
     * @param value The sportName to set.
     * @return This builder for chaining.
     */
    public Builder setSportName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sportName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sportName = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSportName() {
      
      sportName_ = getDefaultInstance().getSportName();
      onChanged();
      return this;
    }
    /**
     * <code>string sportName = 4;</code>
     * @param value The bytes for sportName to set.
     * @return This builder for chaining.
     */
    public Builder setSportNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sportName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object languageName_ = "";
    /**
     * <code>string languageName = 5;</code>
     * @return The languageName.
     */
    public java.lang.String getLanguageName() {
      java.lang.Object ref = languageName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string languageName = 5;</code>
     * @return The bytes for languageName.
     */
    public com.google.protobuf.ByteString
        getLanguageNameBytes() {
      java.lang.Object ref = languageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string languageName = 5;</code>
     * @param value The languageName to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      languageName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string languageName = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageName() {
      
      languageName_ = getDefaultInstance().getLanguageName();
      onChanged();
      return this;
    }
    /**
     * <code>string languageName = 5;</code>
     * @param value The bytes for languageName to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      languageName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object categoryName_ = "";
    /**
     * <code>string categoryName = 6;</code>
     * @return The categoryName.
     */
    public java.lang.String getCategoryName() {
      java.lang.Object ref = categoryName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        categoryName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string categoryName = 6;</code>
     * @return The bytes for categoryName.
     */
    public com.google.protobuf.ByteString
        getCategoryNameBytes() {
      java.lang.Object ref = categoryName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        categoryName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string categoryName = 6;</code>
     * @param value The categoryName to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      categoryName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string categoryName = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategoryName() {
      
      categoryName_ = getDefaultInstance().getCategoryName();
      onChanged();
      return this;
    }
    /**
     * <code>string categoryName = 6;</code>
     * @param value The bytes for categoryName to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      categoryName_ = value;
      onChanged();
      return this;
    }

    private long eventStartTime_ ;
    /**
     * <code>int64 eventStartTime = 7;</code>
     * @return The eventStartTime.
     */
    @java.lang.Override
    public long getEventStartTime() {
      return eventStartTime_;
    }
    /**
     * <code>int64 eventStartTime = 7;</code>
     * @param value The eventStartTime to set.
     * @return This builder for chaining.
     */
    public Builder setEventStartTime(long value) {
      
      eventStartTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 eventStartTime = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventStartTime() {
      
      eventStartTime_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:agent.ProtoTicketBetlineResponse)
  }

  // @@protoc_insertion_point(class_scope:agent.ProtoTicketBetlineResponse)
  private static final com.proto.agent.ProtoTicketBetlineResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.agent.ProtoTicketBetlineResponse();
  }

  public static com.proto.agent.ProtoTicketBetlineResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProtoTicketBetlineResponse>
      PARSER = new com.google.protobuf.AbstractParser<ProtoTicketBetlineResponse>() {
    @java.lang.Override
    public ProtoTicketBetlineResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProtoTicketBetlineResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProtoTicketBetlineResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProtoTicketBetlineResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.agent.ProtoTicketBetlineResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

