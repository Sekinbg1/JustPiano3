// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

/**
 * <pre>
 * 每日挑战抽奖
 * </pre>
 *
 * Protobuf type {@code ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO}
 */
public final class OnlineChallengePrizeVO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO)
    OnlineChallengePrizeVOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnlineChallengePrizeVO.newBuilder() to construct.
  private OnlineChallengePrizeVO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnlineChallengePrizeVO() {
    prizeName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OnlineChallengePrizeVO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OnlineChallengePrizeVO(
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

            prizeType_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            prizeName_ = s;
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
    return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChallengePrizeVO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChallengePrizeVO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO.class, ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO.Builder.class);
  }

  public static final int PRIZE_TYPE_FIELD_NUMBER = 1;
  private int prizeType_;
  /**
   * <pre>
   * 奖励种类（-1表示无奖励）
   * </pre>
   *
   * <code>int32 prize_type = 1;</code>
   * @return The prizeType.
   */
  @java.lang.Override
  public int getPrizeType() {
    return prizeType_;
  }

  public static final int PRIZE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object prizeName_;
  /**
   * <pre>
   * 奖励名称
   * </pre>
   *
   * <code>string prize_name = 2;</code>
   * @return The prizeName.
   */
  @java.lang.Override
  public java.lang.String getPrizeName() {
    java.lang.Object ref = prizeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prizeName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 奖励名称
   * </pre>
   *
   * <code>string prize_name = 2;</code>
   * @return The bytes for prizeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrizeNameBytes() {
    java.lang.Object ref = prizeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prizeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (prizeType_ != 0) {
      output.writeInt32(1, prizeType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prizeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, prizeName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (prizeType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, prizeType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prizeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, prizeName_);
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
    if (!(obj instanceof ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO)) {
      return super.equals(obj);
    }
    ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO other = (ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO) obj;

    if (getPrizeType()
        != other.getPrizeType()) return false;
    if (!getPrizeName()
        .equals(other.getPrizeName())) return false;
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
    hash = (37 * hash) + PRIZE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPrizeType();
    hash = (37 * hash) + PRIZE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPrizeName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parseFrom(
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
  public static Builder newBuilder(ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO prototype) {
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
   * 每日挑战抽奖
   * </pre>
   *
   * Protobuf type {@code ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO)
      ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChallengePrizeVO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChallengePrizeVO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO.class, ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO.Builder.class);
    }

    // Construct using ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO.newBuilder()
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
      prizeType_ = 0;

      prizeName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineChallengePrizeVO_descriptor;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO getDefaultInstanceForType() {
      return ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO.getDefaultInstance();
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO build() {
      ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO buildPartial() {
      ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO result = new ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO(this);
      result.prizeType_ = prizeType_;
      result.prizeName_ = prizeName_;
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
      if (other instanceof ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO) {
        return mergeFrom((ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO other) {
      if (other == ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO.getDefaultInstance()) return this;
      if (other.getPrizeType() != 0) {
        setPrizeType(other.getPrizeType());
      }
      if (!other.getPrizeName().isEmpty()) {
        prizeName_ = other.prizeName_;
        onChanged();
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
      ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int prizeType_ ;
    /**
     * <pre>
     * 奖励种类（-1表示无奖励）
     * </pre>
     *
     * <code>int32 prize_type = 1;</code>
     * @return The prizeType.
     */
    @java.lang.Override
    public int getPrizeType() {
      return prizeType_;
    }
    /**
     * <pre>
     * 奖励种类（-1表示无奖励）
     * </pre>
     *
     * <code>int32 prize_type = 1;</code>
     * @param value The prizeType to set.
     * @return This builder for chaining.
     */
    public Builder setPrizeType(int value) {
      
      prizeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 奖励种类（-1表示无奖励）
     * </pre>
     *
     * <code>int32 prize_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrizeType() {
      
      prizeType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object prizeName_ = "";
    /**
     * <pre>
     * 奖励名称
     * </pre>
     *
     * <code>string prize_name = 2;</code>
     * @return The prizeName.
     */
    public java.lang.String getPrizeName() {
      java.lang.Object ref = prizeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prizeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 奖励名称
     * </pre>
     *
     * <code>string prize_name = 2;</code>
     * @return The bytes for prizeName.
     */
    public com.google.protobuf.ByteString
        getPrizeNameBytes() {
      java.lang.Object ref = prizeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prizeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 奖励名称
     * </pre>
     *
     * <code>string prize_name = 2;</code>
     * @param value The prizeName to set.
     * @return This builder for chaining.
     */
    public Builder setPrizeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      prizeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 奖励名称
     * </pre>
     *
     * <code>string prize_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrizeName() {
      
      prizeName_ = getDefaultInstance().getPrizeName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 奖励名称
     * </pre>
     *
     * <code>string prize_name = 2;</code>
     * @param value The bytes for prizeName to set.
     * @return This builder for chaining.
     */
    public Builder setPrizeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      prizeName_ = value;
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


    // @@protoc_insertion_point(builder_scope:ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO)
  }

  // @@protoc_insertion_point(class_scope:ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO)
  private static final ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO();
  }

  public static ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnlineChallengePrizeVO>
      PARSER = new com.google.protobuf.AbstractParser<OnlineChallengePrizeVO>() {
    @java.lang.Override
    public OnlineChallengePrizeVO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OnlineChallengePrizeVO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OnlineChallengePrizeVO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnlineChallengePrizeVO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
