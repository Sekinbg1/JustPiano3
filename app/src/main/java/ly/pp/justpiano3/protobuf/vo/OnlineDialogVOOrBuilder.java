// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

public interface OnlineDialogVOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.vo.OnlineDialogVO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 对话框类型（0为找Ta，1为邀请）
   * </pre>
   *
   * <code>uint32 type = 1;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   * 相关用户名称（找Ta时为被找人名称，邀请时为发出邀请的用户）
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 相关用户名称（找Ta时为被找人名称，邀请时为发出邀请的用户）
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 对话框标题
   * </pre>
   *
   * <code>string title = 3;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 对话框标题
   * </pre>
   *
   * <code>string title = 3;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 对话框内容
   * </pre>
   *
   * <code>string message = 4;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * 对话框内容
   * </pre>
   *
   * <code>string message = 4;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * 用户所在位置（0为在房间，1为在大厅，2为在选择大厅初始界面等）
   * </pre>
   *
   * <code>uint32 location = 5;</code>
   * @return The location.
   */
  int getLocation();

  /**
   * <pre>
   * 相关用户大厅序号
   * </pre>
   *
   * <code>uint32 hall_id = 6;</code>
   * @return The hallId.
   */
  int getHallId();

  /**
   * <pre>
   * 相关用户房号
   * </pre>
   *
   * <code>uint32 room_id = 7;</code>
   * @return The roomId.
   */
  int getRoomId();

  /**
   * <pre>
   * 相关房间密码
   * </pre>
   *
   * <code>string password = 8;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * 相关房间密码
   * </pre>
   *
   * <code>string password = 8;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * 是否可进入大厅
   * </pre>
   *
   * <code>bool can_enter = 9;</code>
   * @return The canEnter.
   */
  boolean getCanEnter();
}