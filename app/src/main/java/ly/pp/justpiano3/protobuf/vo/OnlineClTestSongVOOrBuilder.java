// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

public interface OnlineClTestSongVOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.vo.OnlineClTestSongVO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 考级左右手
   * </pre>
   *
   * <code>uint32 hand = 1;</code>
   * @return The hand.
   */
  int getHand();

  /**
   * <pre>
   * 考级曲pm文件二进制内容
   * </pre>
   *
   * <code>string song_content = 2;</code>
   * @return The songContent.
   */
  java.lang.String getSongContent();
  /**
   * <pre>
   * 考级曲pm文件二进制内容
   * </pre>
   *
   * <code>string song_content = 2;</code>
   * @return The bytes for songContent.
   */
  com.google.protobuf.ByteString
      getSongContentBytes();

  /**
   * <pre>
   * 用户当前的考级
   * </pre>
   *
   * <code>uint32 cl = 3;</code>
   * @return The cl.
   */
  int getCl();
}
