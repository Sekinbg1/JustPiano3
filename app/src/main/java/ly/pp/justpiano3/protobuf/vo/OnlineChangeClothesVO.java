// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

/**
 * <pre>
 * 更换服装
 * </pre>
 *
 * Protobuf type {@code ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO}
 */
public final class OnlineChangeClothesVO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO)
    OnlineChangeClothesVOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnlineChangeClothesVO.newBuilder() to construct.
  private OnlineChangeClothesVO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnlineChangeClothesVO() {
    message_ = "";
    unlock_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OnlineChangeClothesVO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OnlineChangeClothesVO(
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
          case 8: {

            type_ = input.readUInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            message_ = s;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000002;
            gold_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            unlock_ = s;
            break;
          }
          case 40: {
            bitField0_ |= 0x00000008;
            buyClothesType_ = input.readUInt32();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000010;
            buyClothesId_ = input.readUInt32();
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
    return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeClothesVO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeClothesVO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO.class, ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * 消息类型
   * </pre>
   *
   * <code>uint32 type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <pre>
   * 消息
   * </pre>
   *
   * <code>optional string message = 2;</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * 消息
   * </pre>
   *
   * <code>optional string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 消息
   * </pre>
   *
   * <code>optional string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GOLD_FIELD_NUMBER = 3;
  private int gold_;
  /**
   * <pre>
   * 音符个数
   * </pre>
   *
   * <code>optional uint32 gold = 3;</code>
   * @return Whether the gold field is set.
   */
  @java.lang.Override
  public boolean hasGold() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * 音符个数
   * </pre>
   *
   * <code>optional uint32 gold = 3;</code>
   * @return The gold.
   */
  @java.lang.Override
  public int getGold() {
    return gold_;
  }

  public static final int UNLOCK_FIELD_NUMBER = 4;
  private volatile java.lang.Object unlock_;
  /**
   * <pre>
   * 服装解锁情况
   * </pre>
   *
   * <code>optional string unlock = 4;</code>
   * @return Whether the unlock field is set.
   */
  @java.lang.Override
  public boolean hasUnlock() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * 服装解锁情况
   * </pre>
   *
   * <code>optional string unlock = 4;</code>
   * @return The unlock.
   */
  @java.lang.Override
  public java.lang.String getUnlock() {
    java.lang.Object ref = unlock_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unlock_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 服装解锁情况
   * </pre>
   *
   * <code>optional string unlock = 4;</code>
   * @return The bytes for unlock.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUnlockBytes() {
    java.lang.Object ref = unlock_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      unlock_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUY_CLOTHES_TYPE_FIELD_NUMBER = 5;
  private int buyClothesType_;
  /**
   * <pre>
   * 新购买解锁的服装分类编号
   * </pre>
   *
   * <code>optional uint32 buy_clothes_type = 5;</code>
   * @return Whether the buyClothesType field is set.
   */
  @java.lang.Override
  public boolean hasBuyClothesType() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * 新购买解锁的服装分类编号
   * </pre>
   *
   * <code>optional uint32 buy_clothes_type = 5;</code>
   * @return The buyClothesType.
   */
  @java.lang.Override
  public int getBuyClothesType() {
    return buyClothesType_;
  }

  public static final int BUY_CLOTHES_ID_FIELD_NUMBER = 6;
  private int buyClothesId_;
  /**
   * <pre>
   * 新购买解锁的服装编号
   * </pre>
   *
   * <code>optional uint32 buy_clothes_id = 6;</code>
   * @return Whether the buyClothesId field is set.
   */
  @java.lang.Override
  public boolean hasBuyClothesId() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * 新购买解锁的服装编号
   * </pre>
   *
   * <code>optional uint32 buy_clothes_id = 6;</code>
   * @return The buyClothesId.
   */
  @java.lang.Override
  public int getBuyClothesId() {
    return buyClothesId_;
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
    if (type_ != 0) {
      output.writeUInt32(1, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(3, gold_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, unlock_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(5, buyClothesType_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeUInt32(6, buyClothesId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, gold_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, unlock_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, buyClothesType_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, buyClothesId_);
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
    if (!(obj instanceof ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO)) {
      return super.equals(obj);
    }
    ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO other = (ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO) obj;

    if (getType()
        != other.getType()) return false;
    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
    }
    if (hasGold() != other.hasGold()) return false;
    if (hasGold()) {
      if (getGold()
          != other.getGold()) return false;
    }
    if (hasUnlock() != other.hasUnlock()) return false;
    if (hasUnlock()) {
      if (!getUnlock()
          .equals(other.getUnlock())) return false;
    }
    if (hasBuyClothesType() != other.hasBuyClothesType()) return false;
    if (hasBuyClothesType()) {
      if (getBuyClothesType()
          != other.getBuyClothesType()) return false;
    }
    if (hasBuyClothesId() != other.hasBuyClothesId()) return false;
    if (hasBuyClothesId()) {
      if (getBuyClothesId()
          != other.getBuyClothesId()) return false;
    }
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    if (hasGold()) {
      hash = (37 * hash) + GOLD_FIELD_NUMBER;
      hash = (53 * hash) + getGold();
    }
    if (hasUnlock()) {
      hash = (37 * hash) + UNLOCK_FIELD_NUMBER;
      hash = (53 * hash) + getUnlock().hashCode();
    }
    if (hasBuyClothesType()) {
      hash = (37 * hash) + BUY_CLOTHES_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getBuyClothesType();
    }
    if (hasBuyClothesId()) {
      hash = (37 * hash) + BUY_CLOTHES_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuyClothesId();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parseFrom(
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
  public static Builder newBuilder(ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO prototype) {
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
   * 更换服装
   * </pre>
   *
   * Protobuf type {@code ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO)
      ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeClothesVO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeClothesVO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO.class, ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO.Builder.class);
    }

    // Construct using ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO.newBuilder()
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
      type_ = 0;

      message_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      gold_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      unlock_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      buyClothesType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      buyClothesId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChangeClothesVO_descriptor;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO getDefaultInstanceForType() {
      return ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO.getDefaultInstance();
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO build() {
      ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO buildPartial() {
      ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO result = new ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.type_ = type_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.message_ = message_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gold_ = gold_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.unlock_ = unlock_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.buyClothesType_ = buyClothesType_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.buyClothesId_ = buyClothesId_;
        to_bitField0_ |= 0x00000010;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO) {
        return mergeFrom((ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO other) {
      if (other == ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.hasMessage()) {
        bitField0_ |= 0x00000001;
        message_ = other.message_;
        onChanged();
      }
      if (other.hasGold()) {
        setGold(other.getGold());
      }
      if (other.hasUnlock()) {
        bitField0_ |= 0x00000004;
        unlock_ = other.unlock_;
        onChanged();
      }
      if (other.hasBuyClothesType()) {
        setBuyClothesType(other.getBuyClothesType());
      }
      if (other.hasBuyClothesId()) {
        setBuyClothesId(other.getBuyClothesId());
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
      ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ ;
    /**
     * <pre>
     * 消息类型
     * </pre>
     *
     * <code>uint32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * 消息类型
     * </pre>
     *
     * <code>uint32 type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息类型
     * </pre>
     *
     * <code>uint32 type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * 消息
     * </pre>
     *
     * <code>optional string message = 2;</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 消息
     * </pre>
     *
     * <code>optional string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 消息
     * </pre>
     *
     * <code>optional string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 消息
     * </pre>
     *
     * <code>optional string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息
     * </pre>
     *
     * <code>optional string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息
     * </pre>
     *
     * <code>optional string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      message_ = value;
      onChanged();
      return this;
    }

    private int gold_ ;
    /**
     * <pre>
     * 音符个数
     * </pre>
     *
     * <code>optional uint32 gold = 3;</code>
     * @return Whether the gold field is set.
     */
    @java.lang.Override
    public boolean hasGold() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 音符个数
     * </pre>
     *
     * <code>optional uint32 gold = 3;</code>
     * @return The gold.
     */
    @java.lang.Override
    public int getGold() {
      return gold_;
    }
    /**
     * <pre>
     * 音符个数
     * </pre>
     *
     * <code>optional uint32 gold = 3;</code>
     * @param value The gold to set.
     * @return This builder for chaining.
     */
    public Builder setGold(int value) {
      bitField0_ |= 0x00000002;
      gold_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 音符个数
     * </pre>
     *
     * <code>optional uint32 gold = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGold() {
      bitField0_ = (bitField0_ & ~0x00000002);
      gold_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object unlock_ = "";
    /**
     * <pre>
     * 服装解锁情况
     * </pre>
     *
     * <code>optional string unlock = 4;</code>
     * @return Whether the unlock field is set.
     */
    public boolean hasUnlock() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * 服装解锁情况
     * </pre>
     *
     * <code>optional string unlock = 4;</code>
     * @return The unlock.
     */
    public java.lang.String getUnlock() {
      java.lang.Object ref = unlock_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unlock_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 服装解锁情况
     * </pre>
     *
     * <code>optional string unlock = 4;</code>
     * @return The bytes for unlock.
     */
    public com.google.protobuf.ByteString
        getUnlockBytes() {
      java.lang.Object ref = unlock_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unlock_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 服装解锁情况
     * </pre>
     *
     * <code>optional string unlock = 4;</code>
     * @param value The unlock to set.
     * @return This builder for chaining.
     */
    public Builder setUnlock(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      unlock_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 服装解锁情况
     * </pre>
     *
     * <code>optional string unlock = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnlock() {
      bitField0_ = (bitField0_ & ~0x00000004);
      unlock_ = getDefaultInstance().getUnlock();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 服装解锁情况
     * </pre>
     *
     * <code>optional string unlock = 4;</code>
     * @param value The bytes for unlock to set.
     * @return This builder for chaining.
     */
    public Builder setUnlockBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      unlock_ = value;
      onChanged();
      return this;
    }

    private int buyClothesType_ ;
    /**
     * <pre>
     * 新购买解锁的服装分类编号
     * </pre>
     *
     * <code>optional uint32 buy_clothes_type = 5;</code>
     * @return Whether the buyClothesType field is set.
     */
    @java.lang.Override
    public boolean hasBuyClothesType() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * 新购买解锁的服装分类编号
     * </pre>
     *
     * <code>optional uint32 buy_clothes_type = 5;</code>
     * @return The buyClothesType.
     */
    @java.lang.Override
    public int getBuyClothesType() {
      return buyClothesType_;
    }
    /**
     * <pre>
     * 新购买解锁的服装分类编号
     * </pre>
     *
     * <code>optional uint32 buy_clothes_type = 5;</code>
     * @param value The buyClothesType to set.
     * @return This builder for chaining.
     */
    public Builder setBuyClothesType(int value) {
      bitField0_ |= 0x00000008;
      buyClothesType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 新购买解锁的服装分类编号
     * </pre>
     *
     * <code>optional uint32 buy_clothes_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuyClothesType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      buyClothesType_ = 0;
      onChanged();
      return this;
    }

    private int buyClothesId_ ;
    /**
     * <pre>
     * 新购买解锁的服装编号
     * </pre>
     *
     * <code>optional uint32 buy_clothes_id = 6;</code>
     * @return Whether the buyClothesId field is set.
     */
    @java.lang.Override
    public boolean hasBuyClothesId() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * 新购买解锁的服装编号
     * </pre>
     *
     * <code>optional uint32 buy_clothes_id = 6;</code>
     * @return The buyClothesId.
     */
    @java.lang.Override
    public int getBuyClothesId() {
      return buyClothesId_;
    }
    /**
     * <pre>
     * 新购买解锁的服装编号
     * </pre>
     *
     * <code>optional uint32 buy_clothes_id = 6;</code>
     * @param value The buyClothesId to set.
     * @return This builder for chaining.
     */
    public Builder setBuyClothesId(int value) {
      bitField0_ |= 0x00000010;
      buyClothesId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 新购买解锁的服装编号
     * </pre>
     *
     * <code>optional uint32 buy_clothes_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuyClothesId() {
      bitField0_ = (bitField0_ & ~0x00000010);
      buyClothesId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO)
  }

  // @@protoc_insertion_point(class_scope:ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO)
  private static final ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO();
  }

  public static ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnlineChangeClothesVO>
      PARSER = new com.google.protobuf.AbstractParser<OnlineChangeClothesVO>() {
    @java.lang.Override
    public OnlineChangeClothesVO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OnlineChangeClothesVO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OnlineChangeClothesVO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnlineChangeClothesVO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ly.pp.justpiano3.protobuf.vo.OnlineChangeClothesVO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
