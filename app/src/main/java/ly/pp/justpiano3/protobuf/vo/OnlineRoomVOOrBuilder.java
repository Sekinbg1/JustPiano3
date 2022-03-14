// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

public interface OnlineRoomVOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.vo.OnlineRoomVO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 房间id
   * </pre>
   *
   * <code>uint32 room_id = 1;</code>
   * @return The roomId.
   */
  int getRoomId();

  /**
   * <pre>
   * 房间名称
   * </pre>
   *
   * <code>string room_name = 2;</code>
   * @return The roomName.
   */
  java.lang.String getRoomName();
  /**
   * <pre>
   * 房间名称
   * </pre>
   *
   * <code>string room_name = 2;</code>
   * @return The bytes for roomName.
   */
  com.google.protobuf.ByteString
      getRoomNameBytes();

  /**
   * <pre>
   * 房名颜色
   * </pre>
   *
   * <code>uint32 color = 3;</code>
   * @return The color.
   */
  int getColor();

  /**
   * <pre>
   * 房间模式
   * </pre>
   *
   * <code>uint32 room_mode = 4;</code>
   * @return The roomMode.
   */
  int getRoomMode();

  /**
   * <pre>
   * 房间是否处于弹奏中状态
   * </pre>
   *
   * <code>bool is_playing = 5;</code>
   * @return The isPlaying.
   */
  boolean getIsPlaying();

  /**
   * <pre>
   * 房间是否有密码
   * </pre>
   *
   * <code>bool is_encrypt = 6;</code>
   * @return The isEncrypt.
   */
  boolean getIsEncrypt();

  /**
   * <pre>
   * 房间女生人数
   * </pre>
   *
   * <code>uint32 female_num = 7;</code>
   * @return The femaleNum.
   */
  int getFemaleNum();

  /**
   * <pre>
   * 房间男生人数
   * </pre>
   *
   * <code>uint32 male_num = 8;</code>
   * @return The maleNum.
   */
  int getMaleNum();

  /**
   * <pre>
   * 房间关闭空位人数
   * </pre>
   *
   * <code>uint32 close_num = 9;</code>
   * @return The closeNum.
   */
  int getCloseNum();
}