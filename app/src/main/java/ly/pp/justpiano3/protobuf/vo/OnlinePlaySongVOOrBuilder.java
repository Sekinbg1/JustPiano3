// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

public interface OnlinePlaySongVOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.vo.OnlinePlaySongVO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 曲谱路径
   * </pre>
   *
   * <code>string song_path = 1;</code>
   * @return The songPath.
   */
  java.lang.String getSongPath();
  /**
   * <pre>
   * 曲谱路径
   * </pre>
   *
   * <code>string song_path = 1;</code>
   * @return The bytes for songPath.
   */
  com.google.protobuf.ByteString
      getSongPathBytes();

  /**
   * <pre>
   * 曲谱移调值
   * </pre>
   *
   * <code>int32 tune = 2;</code>
   * @return The tune.
   */
  int getTune();
}