// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

/**
 * <pre>
 * 搭档证书对话框-用户信息
 * </pre>
 *
 * Protobuf type {@code ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO}
 */
public final class OnlineCoupleDialogUserVO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO)
    OnlineCoupleDialogUserVOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnlineCoupleDialogUserVO.newBuilder() to construct.
  private OnlineCoupleDialogUserVO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnlineCoupleDialogUserVO() {
    name_ = "";
    gender_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OnlineCoupleDialogUserVO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OnlineCoupleDialogUserVO(
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
          case 10: {
            ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.Builder subBuilder = null;
            if (clothes_ != null) {
              subBuilder = clothes_.toBuilder();
            }
            clothes_ = input.readMessage(ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clothes_);
              clothes_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            lv_ = input.readUInt32();
            break;
          }
          case 32: {

            cl_ = input.readUInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            gender_ = s;
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
    return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineCoupleDialogUserVO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineCoupleDialogUserVO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO.class, ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO.Builder.class);
  }

  public static final int CLOTHES_FIELD_NUMBER = 1;
  private ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes_;
  /**
   * <pre>
   * 用户服装
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
   * @return Whether the clothes field is set.
   */
  @java.lang.Override
  public boolean hasClothes() {
    return clothes_ != null;
  }
  /**
   * <pre>
   * 用户服装
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
   * @return The clothes.
   */
  @java.lang.Override
  public ly.pp.justpiano3.protobuf.vo.OnlineClothesVO getClothes() {
    return clothes_ == null ? ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.getDefaultInstance() : clothes_;
  }
  /**
   * <pre>
   * 用户服装
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
   */
  @java.lang.Override
  public ly.pp.justpiano3.protobuf.vo.OnlineClothesVOOrBuilder getClothesOrBuilder() {
    return getClothes();
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * 用户名称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 用户名称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LV_FIELD_NUMBER = 3;
  private int lv_;
  /**
   * <pre>
   * 用户等级
   * </pre>
   *
   * <code>uint32 lv = 3;</code>
   * @return The lv.
   */
  @java.lang.Override
  public int getLv() {
    return lv_;
  }

  public static final int CL_FIELD_NUMBER = 4;
  private int cl_;
  /**
   * <pre>
   * 用户考级
   * </pre>
   *
   * <code>uint32 cl = 4;</code>
   * @return The cl.
   */
  @java.lang.Override
  public int getCl() {
    return cl_;
  }

  public static final int GENDER_FIELD_NUMBER = 5;
  private volatile java.lang.Object gender_;
  /**
   * <pre>
   * 用户性别
   * </pre>
   *
   * <code>string gender = 5;</code>
   * @return The gender.
   */
  @java.lang.Override
  public java.lang.String getGender() {
    java.lang.Object ref = gender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gender_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 用户性别
   * </pre>
   *
   * <code>string gender = 5;</code>
   * @return The bytes for gender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGenderBytes() {
    java.lang.Object ref = gender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gender_ = b;
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
    if (clothes_ != null) {
      output.writeMessage(1, getClothes());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (lv_ != 0) {
      output.writeUInt32(3, lv_);
    }
    if (cl_ != 0) {
      output.writeUInt32(4, cl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, gender_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clothes_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClothes());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (lv_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, lv_);
    }
    if (cl_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, cl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gender_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, gender_);
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
    if (!(obj instanceof ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO)) {
      return super.equals(obj);
    }
    ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO other = (ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO) obj;

    if (hasClothes() != other.hasClothes()) return false;
    if (hasClothes()) {
      if (!getClothes()
          .equals(other.getClothes())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
    if (getLv()
        != other.getLv()) return false;
    if (getCl()
        != other.getCl()) return false;
    if (!getGender()
        .equals(other.getGender())) return false;
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
    if (hasClothes()) {
      hash = (37 * hash) + CLOTHES_FIELD_NUMBER;
      hash = (53 * hash) + getClothes().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + LV_FIELD_NUMBER;
    hash = (53 * hash) + getLv();
    hash = (37 * hash) + CL_FIELD_NUMBER;
    hash = (53 * hash) + getCl();
    hash = (37 * hash) + GENDER_FIELD_NUMBER;
    hash = (53 * hash) + getGender().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parseFrom(
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
  public static Builder newBuilder(ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO prototype) {
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
   * 搭档证书对话框-用户信息
   * </pre>
   *
   * Protobuf type {@code ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO)
      ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineCoupleDialogUserVO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineCoupleDialogUserVO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO.class, ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO.Builder.class);
    }

    // Construct using ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO.newBuilder()
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
      if (clothesBuilder_ == null) {
        clothes_ = null;
      } else {
        clothes_ = null;
        clothesBuilder_ = null;
      }
      name_ = "";

      lv_ = 0;

      cl_ = 0;

      gender_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ly.pp.justpiano3.protobuf.vo.OnlineResponse.internal_static_ly_pp_justpiano3_protobuf_vo_OnlineCoupleDialogUserVO_descriptor;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO getDefaultInstanceForType() {
      return ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO.getDefaultInstance();
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO build() {
      ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO buildPartial() {
      ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO result = new ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO(this);
      if (clothesBuilder_ == null) {
        result.clothes_ = clothes_;
      } else {
        result.clothes_ = clothesBuilder_.build();
      }
      result.name_ = name_;
      result.lv_ = lv_;
      result.cl_ = cl_;
      result.gender_ = gender_;
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
      if (other instanceof ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO) {
        return mergeFrom((ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO other) {
      if (other == ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO.getDefaultInstance()) return this;
      if (other.hasClothes()) {
        mergeClothes(other.getClothes());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getLv() != 0) {
        setLv(other.getLv());
      }
      if (other.getCl() != 0) {
        setCl(other.getCl());
      }
      if (!other.getGender().isEmpty()) {
        gender_ = other.gender_;
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
      ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ly.pp.justpiano3.protobuf.vo.OnlineClothesVO, ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.Builder, ly.pp.justpiano3.protobuf.vo.OnlineClothesVOOrBuilder> clothesBuilder_;
    /**
     * <pre>
     * 用户服装
     * </pre>
     *
     * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
     * @return Whether the clothes field is set.
     */
    public boolean hasClothes() {
      return clothesBuilder_ != null || clothes_ != null;
    }
    /**
     * <pre>
     * 用户服装
     * </pre>
     *
     * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
     * @return The clothes.
     */
    public ly.pp.justpiano3.protobuf.vo.OnlineClothesVO getClothes() {
      if (clothesBuilder_ == null) {
        return clothes_ == null ? ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.getDefaultInstance() : clothes_;
      } else {
        return clothesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 用户服装
     * </pre>
     *
     * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
     */
    public Builder setClothes(ly.pp.justpiano3.protobuf.vo.OnlineClothesVO value) {
      if (clothesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clothes_ = value;
        onChanged();
      } else {
        clothesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 用户服装
     * </pre>
     *
     * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
     */
    public Builder setClothes(
        ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.Builder builderForValue) {
      if (clothesBuilder_ == null) {
        clothes_ = builderForValue.build();
        onChanged();
      } else {
        clothesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 用户服装
     * </pre>
     *
     * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
     */
    public Builder mergeClothes(ly.pp.justpiano3.protobuf.vo.OnlineClothesVO value) {
      if (clothesBuilder_ == null) {
        if (clothes_ != null) {
          clothes_ =
            ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.newBuilder(clothes_).mergeFrom(value).buildPartial();
        } else {
          clothes_ = value;
        }
        onChanged();
      } else {
        clothesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 用户服装
     * </pre>
     *
     * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
     */
    public Builder clearClothes() {
      if (clothesBuilder_ == null) {
        clothes_ = null;
        onChanged();
      } else {
        clothes_ = null;
        clothesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 用户服装
     * </pre>
     *
     * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
     */
    public ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.Builder getClothesBuilder() {
      
      onChanged();
      return getClothesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 用户服装
     * </pre>
     *
     * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
     */
    public ly.pp.justpiano3.protobuf.vo.OnlineClothesVOOrBuilder getClothesOrBuilder() {
      if (clothesBuilder_ != null) {
        return clothesBuilder_.getMessageOrBuilder();
      } else {
        return clothes_ == null ?
            ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.getDefaultInstance() : clothes_;
      }
    }
    /**
     * <pre>
     * 用户服装
     * </pre>
     *
     * <code>.ly.pp.justpiano3.protobuf.vo.OnlineClothesVO clothes = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ly.pp.justpiano3.protobuf.vo.OnlineClothesVO, ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.Builder, ly.pp.justpiano3.protobuf.vo.OnlineClothesVOOrBuilder> 
        getClothesFieldBuilder() {
      if (clothesBuilder_ == null) {
        clothesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ly.pp.justpiano3.protobuf.vo.OnlineClothesVO, ly.pp.justpiano3.protobuf.vo.OnlineClothesVO.Builder, ly.pp.justpiano3.protobuf.vo.OnlineClothesVOOrBuilder>(
                getClothes(),
                getParentForChildren(),
                isClean());
        clothes_ = null;
      }
      return clothesBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * 用户名称
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 用户名称
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 用户名称
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户名称
     * </pre>
     *
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户名称
     * </pre>
     *
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int lv_ ;
    /**
     * <pre>
     * 用户等级
     * </pre>
     *
     * <code>uint32 lv = 3;</code>
     * @return The lv.
     */
    @java.lang.Override
    public int getLv() {
      return lv_;
    }
    /**
     * <pre>
     * 用户等级
     * </pre>
     *
     * <code>uint32 lv = 3;</code>
     * @param value The lv to set.
     * @return This builder for chaining.
     */
    public Builder setLv(int value) {
      
      lv_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户等级
     * </pre>
     *
     * <code>uint32 lv = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLv() {
      
      lv_ = 0;
      onChanged();
      return this;
    }

    private int cl_ ;
    /**
     * <pre>
     * 用户考级
     * </pre>
     *
     * <code>uint32 cl = 4;</code>
     * @return The cl.
     */
    @java.lang.Override
    public int getCl() {
      return cl_;
    }
    /**
     * <pre>
     * 用户考级
     * </pre>
     *
     * <code>uint32 cl = 4;</code>
     * @param value The cl to set.
     * @return This builder for chaining.
     */
    public Builder setCl(int value) {
      
      cl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户考级
     * </pre>
     *
     * <code>uint32 cl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCl() {
      
      cl_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object gender_ = "";
    /**
     * <pre>
     * 用户性别
     * </pre>
     *
     * <code>string gender = 5;</code>
     * @return The gender.
     */
    public java.lang.String getGender() {
      java.lang.Object ref = gender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 用户性别
     * </pre>
     *
     * <code>string gender = 5;</code>
     * @return The bytes for gender.
     */
    public com.google.protobuf.ByteString
        getGenderBytes() {
      java.lang.Object ref = gender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 用户性别
     * </pre>
     *
     * <code>string gender = 5;</code>
     * @param value The gender to set.
     * @return This builder for chaining.
     */
    public Builder setGender(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gender_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户性别
     * </pre>
     *
     * <code>string gender = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGender() {
      
      gender_ = getDefaultInstance().getGender();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户性别
     * </pre>
     *
     * <code>string gender = 5;</code>
     * @param value The bytes for gender to set.
     * @return This builder for chaining.
     */
    public Builder setGenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gender_ = value;
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


    // @@protoc_insertion_point(builder_scope:ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO)
  }

  // @@protoc_insertion_point(class_scope:ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO)
  private static final ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO();
  }

  public static ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnlineCoupleDialogUserVO>
      PARSER = new com.google.protobuf.AbstractParser<OnlineCoupleDialogUserVO>() {
    @java.lang.Override
    public OnlineCoupleDialogUserVO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OnlineCoupleDialogUserVO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OnlineCoupleDialogUserVO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnlineCoupleDialogUserVO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ly.pp.justpiano3.protobuf.vo.OnlineCoupleDialogUserVO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
