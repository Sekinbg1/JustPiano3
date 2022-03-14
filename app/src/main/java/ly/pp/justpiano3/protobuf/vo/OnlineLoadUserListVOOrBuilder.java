// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

public interface OnlineLoadUserListVOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.vo.OnlineLoadUserListVO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineUserVO user = 1;</code>
   */
  java.util.List<ly.pp.justpiano3.protobuf.vo.OnlineUserVO> 
      getUserList();
  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineUserVO user = 1;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineUserVO getUser(int index);
  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineUserVO user = 1;</code>
   */
  int getUserCount();
  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineUserVO user = 1;</code>
   */
  java.util.List<? extends ly.pp.justpiano3.protobuf.vo.OnlineUserVOOrBuilder> 
      getUserOrBuilderList();
  /**
   * <pre>
   * 用户列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineUserVO user = 1;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineUserVOOrBuilder getUserOrBuilder(
      int index);

  /**
   * <pre>
   * 用户是否在房间中
   * </pre>
   *
   * <code>bool is_in_room = 2;</code>
   * @return The isInRoom.
   */
  boolean getIsInRoom();
}