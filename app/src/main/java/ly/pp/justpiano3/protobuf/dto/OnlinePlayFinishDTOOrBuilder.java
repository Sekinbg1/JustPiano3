// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineRequestProtocol.proto

package ly.pp.justpiano3.protobuf.dto;

public interface OnlinePlayFinishDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.dto.OnlinePlayFinishDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 加密时间戳
   * </pre>
   *
   * <code>uint64 code = 1;</code>
   * @return The code.
   */
  long getCode();

  /**
   * <pre>
   * 弹奏状态数组
   * </pre>
   *
   * <code>string status_array = 2;</code>
   * @return The statusArray.
   */
  java.lang.String getStatusArray();
  /**
   * <pre>
   * 弹奏状态数组
   * </pre>
   *
   * <code>string status_array = 2;</code>
   * @return The bytes for statusArray.
   */
  com.google.protobuf.ByteString
      getStatusArrayBytes();
}