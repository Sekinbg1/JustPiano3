// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

/**
 * <pre>
 * 改变房间位置状态
 * </pre>
 *
 * Protobuf type {@code ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO}
 */
public final class OnlineChangeRoomPositionVO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO)
    OnlineChangeRoomPositionVOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnlineChangeRoomPositionVO.newBuilder() to construct.
  private OnlineChangeRoomPositionVO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnlineChangeRoomPositionVO() {
    roomPositionUser_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OnlineChangeRoomPositionVO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OnlineChangeRoomPositionVO(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              roomPositionUser_ = new java.util.ArrayList<ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO>();
              mutable_bitField0_ |= 0x00000001;
            }
            roomPositionUser_.add(
                input.readMessage(ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        roomPositionUser_ = java.util.Collections.unmodifiableList(roomPositionUser_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeRoomPositionVO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeRoomPositionVO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO.class, ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO.Builder.class);
  }

  public static final int ROOM_POSITION_USER_FIELD_NUMBER = 4;
  private java.util.List<ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO> roomPositionUser_;
  /**
   * <pre>
   * 用户信息
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
   */
  @java.lang.Override
  public java.util.List<ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO> getRoomPositionUserList() {
    return roomPositionUser_;
  }
  /**
   * <pre>
   * 用户信息
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVOOrBuilder> 
      getRoomPositionUserOrBuilderList() {
    return roomPositionUser_;
  }
  /**
   * <pre>
   * 用户信息
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
   */
  @java.lang.Override
  public int getRoomPositionUserCount() {
    return roomPositionUser_.size();
  }
  /**
   * <pre>
   * 用户信息
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
   */
  @java.lang.Override
  public ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO getRoomPositionUser(int index) {
    return roomPositionUser_.get(index);
  }
  /**
   * <pre>
   * 用户信息
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
   */
  @java.lang.Override
  public ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVOOrBuilder getRoomPositionUserOrBuilder(
      int index) {
    return roomPositionUser_.get(index);
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
    for (int i = 0; i < roomPositionUser_.size(); i++) {
      output.writeMessage(4, roomPositionUser_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < roomPositionUser_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, roomPositionUser_.get(i));
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
    if (!(obj instanceof ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO)) {
      return super.equals(obj);
    }
    ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO other = (ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO) obj;

    if (!getRoomPositionUserList()
        .equals(other.getRoomPositionUserList())) return false;
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
    if (getRoomPositionUserCount() > 0) {
      hash = (37 * hash) + ROOM_POSITION_USER_FIELD_NUMBER;
      hash = (53 * hash) + getRoomPositionUserList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parseFrom(
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
  public static Builder newBuilder(ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO prototype) {
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
   * <pre>
   * 改变房间位置状态
   * </pre>
   *
   * Protobuf type {@code ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO)
      ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeRoomPositionVO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeRoomPositionVO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO.class, ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO.Builder.class);
    }

    // Construct using ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO.newBuilder()
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
        getRoomPositionUserFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (roomPositionUserBuilder_ == null) {
        roomPositionUser_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        roomPositionUserBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeRoomPositionVO_descriptor;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO getDefaultInstanceForType() {
      return ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO.getDefaultInstance();
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO build() {
      ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO buildPartial() {
      ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO result = new ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO(this);
      int from_bitField0_ = bitField0_;
      if (roomPositionUserBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          roomPositionUser_ = java.util.Collections.unmodifiableList(roomPositionUser_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.roomPositionUser_ = roomPositionUser_;
      } else {
        result.roomPositionUser_ = roomPositionUserBuilder_.build();
      }
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
      if (other instanceof ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO) {
        return mergeFrom((ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO other) {
      if (other == ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO.getDefaultInstance()) return this;
      if (roomPositionUserBuilder_ == null) {
        if (!other.roomPositionUser_.isEmpty()) {
          if (roomPositionUser_.isEmpty()) {
            roomPositionUser_ = other.roomPositionUser_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRoomPositionUserIsMutable();
            roomPositionUser_.addAll(other.roomPositionUser_);
          }
          onChanged();
        }
      } else {
        if (!other.roomPositionUser_.isEmpty()) {
          if (roomPositionUserBuilder_.isEmpty()) {
            roomPositionUserBuilder_.dispose();
            roomPositionUserBuilder_ = null;
            roomPositionUser_ = other.roomPositionUser_;
            bitField0_ = (bitField0_ & ~0x00000001);
            roomPositionUserBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRoomPositionUserFieldBuilder() : null;
          } else {
            roomPositionUserBuilder_.addAllMessages(other.roomPositionUser_);
          }
        }
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
      ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO> roomPositionUser_ =
      java.util.Collections.emptyList();
    private void ensureRoomPositionUserIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        roomPositionUser_ = new java.util.ArrayList<ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO>(roomPositionUser_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVOOrBuilder> roomPositionUserBuilder_;

    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public java.util.List<ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO> getRoomPositionUserList() {
      if (roomPositionUserBuilder_ == null) {
        return java.util.Collections.unmodifiableList(roomPositionUser_);
      } else {
        return roomPositionUserBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public int getRoomPositionUserCount() {
      if (roomPositionUserBuilder_ == null) {
        return roomPositionUser_.size();
      } else {
        return roomPositionUserBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO getRoomPositionUser(int index) {
      if (roomPositionUserBuilder_ == null) {
        return roomPositionUser_.get(index);
      } else {
        return roomPositionUserBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public Builder setRoomPositionUser(
        int index, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO value) {
      if (roomPositionUserBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoomPositionUserIsMutable();
        roomPositionUser_.set(index, value);
        onChanged();
      } else {
        roomPositionUserBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public Builder setRoomPositionUser(
        int index, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder builderForValue) {
      if (roomPositionUserBuilder_ == null) {
        ensureRoomPositionUserIsMutable();
        roomPositionUser_.set(index, builderForValue.build());
        onChanged();
      } else {
        roomPositionUserBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public Builder addRoomPositionUser(ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO value) {
      if (roomPositionUserBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoomPositionUserIsMutable();
        roomPositionUser_.add(value);
        onChanged();
      } else {
        roomPositionUserBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public Builder addRoomPositionUser(
        int index, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO value) {
      if (roomPositionUserBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoomPositionUserIsMutable();
        roomPositionUser_.add(index, value);
        onChanged();
      } else {
        roomPositionUserBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public Builder addRoomPositionUser(
        ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder builderForValue) {
      if (roomPositionUserBuilder_ == null) {
        ensureRoomPositionUserIsMutable();
        roomPositionUser_.add(builderForValue.build());
        onChanged();
      } else {
        roomPositionUserBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public Builder addRoomPositionUser(
        int index, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder builderForValue) {
      if (roomPositionUserBuilder_ == null) {
        ensureRoomPositionUserIsMutable();
        roomPositionUser_.add(index, builderForValue.build());
        onChanged();
      } else {
        roomPositionUserBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public Builder addAllRoomPositionUser(
        java.lang.Iterable<? extends ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO> values) {
      if (roomPositionUserBuilder_ == null) {
        ensureRoomPositionUserIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, roomPositionUser_);
        onChanged();
      } else {
        roomPositionUserBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public Builder clearRoomPositionUser() {
      if (roomPositionUserBuilder_ == null) {
        roomPositionUser_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        roomPositionUserBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public Builder removeRoomPositionUser(int index) {
      if (roomPositionUserBuilder_ == null) {
        ensureRoomPositionUserIsMutable();
        roomPositionUser_.remove(index);
        onChanged();
      } else {
        roomPositionUserBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder getRoomPositionUserBuilder(
        int index) {
      return getRoomPositionUserFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVOOrBuilder getRoomPositionUserOrBuilder(
        int index) {
      if (roomPositionUserBuilder_ == null) {
        return roomPositionUser_.get(index);  } else {
        return roomPositionUserBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public java.util.List<? extends ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVOOrBuilder> 
         getRoomPositionUserOrBuilderList() {
      if (roomPositionUserBuilder_ != null) {
        return roomPositionUserBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(roomPositionUser_);
      }
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder addRoomPositionUserBuilder() {
      return getRoomPositionUserFieldBuilder().addBuilder(
          ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.getDefaultInstance());
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder addRoomPositionUserBuilder(
        int index) {
      return getRoomPositionUserFieldBuilder().addBuilder(
          index, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.getDefaultInstance());
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO room_position_user = 4;</code>
     */
    public java.util.List<ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder> 
         getRoomPositionUserBuilderList() {
      return getRoomPositionUserFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVOOrBuilder> 
        getRoomPositionUserFieldBuilder() {
      if (roomPositionUserBuilder_ == null) {
        roomPositionUserBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVO.Builder, ly.pp.justpiano3.protobuf.vo.OnlineRoomPositionUserVOOrBuilder>(
                roomPositionUser_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        roomPositionUser_ = null;
      }
      return roomPositionUserBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO)
  }

  // @@protoc_insertion_point(class_scope:ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO)
  private static final ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO();
  }

  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnlineChangeRoomPositionVO>
      PARSER = new com.google.protobuf.AbstractParser<OnlineChangeRoomPositionVO>() {
    @java.lang.Override
    public OnlineChangeRoomPositionVO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OnlineChangeRoomPositionVO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OnlineChangeRoomPositionVO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnlineChangeRoomPositionVO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ly.pp.justpiano3.protobuf.vo.OnlineChangeRoomPositionVO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

