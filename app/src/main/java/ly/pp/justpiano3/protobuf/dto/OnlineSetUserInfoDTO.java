// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineRequestProtocol.proto

package ly.pp.justpiano3.protobuf.dto;

/**
 * <pre>
 * 增删好友、解除搭档、设置祝语
 * </pre>
 *
 * Protobuf type {@code ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO}
 */
public final class OnlineSetUserInfoDTO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO)
    OnlineSetUserInfoDTOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnlineSetUserInfoDTO.newBuilder() to construct.
  private OnlineSetUserInfoDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnlineSetUserInfoDTO() {
    name_ = "";
    declaration_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OnlineSetUserInfoDTO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OnlineSetUserInfoDTO(
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

            name_ = s;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000001;
            reject_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            declaration_ = s;
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
    return ly.pp.justpiano3.protobuf.dto.OnlineRequest.internal_static_ly_pp_justpiano3_protobuf_dto_OnlineSetUserInfoDTO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ly.pp.justpiano3.protobuf.dto.OnlineRequest.internal_static_ly_pp_justpiano3_protobuf_dto_OnlineSetUserInfoDTO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO.class, ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO.Builder.class);
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

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * 相关用户名
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
   * 相关用户名
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

  public static final int REJECT_FIELD_NUMBER = 3;
  private boolean reject_;
  /**
   * <pre>
   * 是否拒绝好友请求
   * </pre>
   *
   * <code>optional bool reject = 3;</code>
   * @return Whether the reject field is set.
   */
  @java.lang.Override
  public boolean hasReject() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * 是否拒绝好友请求
   * </pre>
   *
   * <code>optional bool reject = 3;</code>
   * @return The reject.
   */
  @java.lang.Override
  public boolean getReject() {
    return reject_;
  }

  public static final int DECLARATION_FIELD_NUMBER = 4;
  private volatile java.lang.Object declaration_;
  /**
   * <pre>
   * 祝语
   * </pre>
   *
   * <code>optional string declaration = 4;</code>
   * @return Whether the declaration field is set.
   */
  @java.lang.Override
  public boolean hasDeclaration() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * 祝语
   * </pre>
   *
   * <code>optional string declaration = 4;</code>
   * @return The declaration.
   */
  @java.lang.Override
  public java.lang.String getDeclaration() {
    java.lang.Object ref = declaration_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      declaration_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 祝语
   * </pre>
   *
   * <code>optional string declaration = 4;</code>
   * @return The bytes for declaration.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeclarationBytes() {
    java.lang.Object ref = declaration_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      declaration_ = b;
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
    if (type_ != 0) {
      output.writeUInt32(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(3, reject_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, declaration_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, reject_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, declaration_);
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
    if (!(obj instanceof ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO)) {
      return super.equals(obj);
    }
    ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO other = (ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO) obj;

    if (getType()
        != other.getType()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasReject() != other.hasReject()) return false;
    if (hasReject()) {
      if (getReject()
          != other.getReject()) return false;
    }
    if (hasDeclaration() != other.hasDeclaration()) return false;
    if (hasDeclaration()) {
      if (!getDeclaration()
          .equals(other.getDeclaration())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasReject()) {
      hash = (37 * hash) + REJECT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getReject());
    }
    if (hasDeclaration()) {
      hash = (37 * hash) + DECLARATION_FIELD_NUMBER;
      hash = (53 * hash) + getDeclaration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parseFrom(
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
  public static Builder newBuilder(ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO prototype) {
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
   * 增删好友、解除搭档、设置祝语
   * </pre>
   *
   * Protobuf type {@code ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO)
      ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ly.pp.justpiano3.protobuf.dto.OnlineRequest.internal_static_ly_pp_justpiano3_protobuf_dto_OnlineSetUserInfoDTO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ly.pp.justpiano3.protobuf.dto.OnlineRequest.internal_static_ly_pp_justpiano3_protobuf_dto_OnlineSetUserInfoDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO.class, ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO.Builder.class);
    }

    // Construct using ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO.newBuilder()
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

      name_ = "";

      reject_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      declaration_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ly.pp.justpiano3.protobuf.dto.OnlineRequest.internal_static_ly_pp_justpiano3_protobuf_dto_OnlineSetUserInfoDTO_descriptor;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO getDefaultInstanceForType() {
      return ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO.getDefaultInstance();
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO build() {
      ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO buildPartial() {
      ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO result = new ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.type_ = type_;
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reject_ = reject_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.declaration_ = declaration_;
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
      if (other instanceof ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO) {
        return mergeFrom((ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO other) {
      if (other == ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasReject()) {
        setReject(other.getReject());
      }
      if (other.hasDeclaration()) {
        bitField0_ |= 0x00000002;
        declaration_ = other.declaration_;
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
      ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO) e.getUnfinishedMessage();
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * 相关用户名
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
     * 相关用户名
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
     * 相关用户名
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
     * 相关用户名
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
     * 相关用户名
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

    private boolean reject_ ;
    /**
     * <pre>
     * 是否拒绝好友请求
     * </pre>
     *
     * <code>optional bool reject = 3;</code>
     * @return Whether the reject field is set.
     */
    @java.lang.Override
    public boolean hasReject() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 是否拒绝好友请求
     * </pre>
     *
     * <code>optional bool reject = 3;</code>
     * @return The reject.
     */
    @java.lang.Override
    public boolean getReject() {
      return reject_;
    }
    /**
     * <pre>
     * 是否拒绝好友请求
     * </pre>
     *
     * <code>optional bool reject = 3;</code>
     * @param value The reject to set.
     * @return This builder for chaining.
     */
    public Builder setReject(boolean value) {
      bitField0_ |= 0x00000001;
      reject_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否拒绝好友请求
     * </pre>
     *
     * <code>optional bool reject = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReject() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reject_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object declaration_ = "";
    /**
     * <pre>
     * 祝语
     * </pre>
     *
     * <code>optional string declaration = 4;</code>
     * @return Whether the declaration field is set.
     */
    public boolean hasDeclaration() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * 祝语
     * </pre>
     *
     * <code>optional string declaration = 4;</code>
     * @return The declaration.
     */
    public java.lang.String getDeclaration() {
      java.lang.Object ref = declaration_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        declaration_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 祝语
     * </pre>
     *
     * <code>optional string declaration = 4;</code>
     * @return The bytes for declaration.
     */
    public com.google.protobuf.ByteString
        getDeclarationBytes() {
      java.lang.Object ref = declaration_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        declaration_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 祝语
     * </pre>
     *
     * <code>optional string declaration = 4;</code>
     * @param value The declaration to set.
     * @return This builder for chaining.
     */
    public Builder setDeclaration(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      declaration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 祝语
     * </pre>
     *
     * <code>optional string declaration = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeclaration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      declaration_ = getDefaultInstance().getDeclaration();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 祝语
     * </pre>
     *
     * <code>optional string declaration = 4;</code>
     * @param value The bytes for declaration to set.
     * @return This builder for chaining.
     */
    public Builder setDeclarationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      declaration_ = value;
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


    // @@protoc_insertion_point(builder_scope:ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO)
  }

  // @@protoc_insertion_point(class_scope:ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO)
  private static final ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO();
  }

  public static ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnlineSetUserInfoDTO>
      PARSER = new com.google.protobuf.AbstractParser<OnlineSetUserInfoDTO>() {
    @java.lang.Override
    public OnlineSetUserInfoDTO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OnlineSetUserInfoDTO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OnlineSetUserInfoDTO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnlineSetUserInfoDTO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ly.pp.justpiano3.protobuf.dto.OnlineSetUserInfoDTO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
