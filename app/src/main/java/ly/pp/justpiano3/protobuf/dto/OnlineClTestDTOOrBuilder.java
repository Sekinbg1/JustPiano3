// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineRequestProtocol.proto

package ly.pp.justpiano3.protobuf.dto;

public interface OnlineClTestDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.dto.OnlineClTestDTO)
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
   * 加密时间戳
   * </pre>
   *
   * <code>optional uint64 code = 2;</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * 加密时间戳
   * </pre>
   *
   * <code>optional uint64 code = 2;</code>
   * @return The code.
   */
  long getCode();

  /**
   * <pre>
   * 用户选择的考级曲谱序号（当前等级对于用户的第几首）
   * </pre>
   *
   * <code>optional uint32 song_index = 3;</code>
   * @return Whether the songIndex field is set.
   */
  boolean hasSongIndex();
  /**
   * <pre>
   * 用户选择的考级曲谱序号（当前等级对于用户的第几首）
   * </pre>
   *
   * <code>optional uint32 song_index = 3;</code>
   * @return The songIndex.
   */
  int getSongIndex();

  /**
   * <pre>
   * 弹奏状态数组
   * </pre>
   *
   * <code>optional string status_array = 4;</code>
   * @return Whether the statusArray field is set.
   */
  boolean hasStatusArray();
  /**
   * <pre>
   * 弹奏状态数组
   * </pre>
   *
   * <code>optional string status_array = 4;</code>
   * @return The statusArray.
   */
  java.lang.String getStatusArray();
  /**
   * <pre>
   * 弹奏状态数组
   * </pre>
   *
   * <code>optional string status_array = 4;</code>
   * @return The bytes for statusArray.
   */
  com.google.protobuf.ByteString
      getStatusArrayBytes();
}
