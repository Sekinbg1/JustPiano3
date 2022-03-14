// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineRequestProtocol.proto

package ly.pp.justpiano3.protobuf.dto;

public interface OnlineEnterHallDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.dto.OnlineEnterHallDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 大厅id
   * </pre>
   *
   * <code>uint32 hall_id = 1;</code>
   * @return The hallId.
   */
  int getHallId();

  /**
   * <pre>
   * 大厅密码（若有）
   * </pre>
   *
   * <code>optional string password = 2;</code>
   * @return Whether the password field is set.
   */
  boolean hasPassword();
  /**
   * <pre>
   * 大厅密码（若有）
   * </pre>
   *
   * <code>optional string password = 2;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * 大厅密码（若有）
   * </pre>
   *
   * <code>optional string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}