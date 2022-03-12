// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineRequestProtocol.proto

package ly.pp.justpiano3.protobuf.dto;

public interface OnlineFamilyDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.dto.OnlineFamilyDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 消息类型
   * </pre>
   *
   * <code>uint32 type = 1;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   * 家族id
   * </pre>
   *
   * <code>optional uint32 family_id = 2;</code>
   * @return Whether the familyId field is set.
   */
  boolean hasFamilyId();
  /**
   * <pre>
   * 家族id
   * </pre>
   *
   * <code>optional uint32 family_id = 2;</code>
   * @return The familyId.
   */
  int getFamilyId();

  /**
   * <pre>
   * 家族宣言
   * </pre>
   *
   * <code>optional string message = 3;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * 家族宣言
   * </pre>
   *
   * <code>optional string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * 家族宣言
   * </pre>
   *
   * <code>optional string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * 列表当前页数
   * </pre>
   *
   * <code>optional uint32 page = 4;</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <pre>
   * 列表当前页数
   * </pre>
   *
   * <code>optional uint32 page = 4;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <pre>
   * 家族名称
   * </pre>
   *
   * <code>optional string family_name = 5;</code>
   * @return Whether the familyName field is set.
   */
  boolean hasFamilyName();
  /**
   * <pre>
   * 家族名称
   * </pre>
   *
   * <code>optional string family_name = 5;</code>
   * @return The familyName.
   */
  java.lang.String getFamilyName();
  /**
   * <pre>
   * 家族名称
   * </pre>
   *
   * <code>optional string family_name = 5;</code>
   * @return The bytes for familyName.
   */
  com.google.protobuf.ByteString
      getFamilyNameBytes();

  /**
   * <pre>
   * 相关用户名称
   * </pre>
   *
   * <code>optional string user_name = 6;</code>
   * @return Whether the userName field is set.
   */
  boolean hasUserName();
  /**
   * <pre>
   * 相关用户名称
   * </pre>
   *
   * <code>optional string user_name = 6;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <pre>
   * 相关用户名称
   * </pre>
   *
   * <code>optional string user_name = 6;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <pre>
   * 相关状态
   * </pre>
   *
   * <code>optional uint32 status = 7;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * 相关状态
   * </pre>
   *
   * <code>optional uint32 status = 7;</code>
   * @return The status.
   */
  int getStatus();
}
