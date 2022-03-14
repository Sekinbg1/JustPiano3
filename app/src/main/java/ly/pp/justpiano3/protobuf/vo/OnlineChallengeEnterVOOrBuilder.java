// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

public interface OnlineChallengeEnterVOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.vo.OnlineChallengeEnterVO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 排名列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineChallengeUserVO user_score = 1;</code>
   */
  java.util.List<ly.pp.justpiano3.protobuf.vo.OnlineChallengeUserVO> 
      getUserScoreList();
  /**
   * <pre>
   * 排名列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineChallengeUserVO user_score = 1;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengeUserVO getUserScore(int index);
  /**
   * <pre>
   * 排名列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineChallengeUserVO user_score = 1;</code>
   */
  int getUserScoreCount();
  /**
   * <pre>
   * 排名列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineChallengeUserVO user_score = 1;</code>
   */
  java.util.List<? extends ly.pp.justpiano3.protobuf.vo.OnlineChallengeUserVOOrBuilder> 
      getUserScoreOrBuilderList();
  /**
   * <pre>
   * 排名列表
   * </pre>
   *
   * <code>repeated .ly.pp.justpiano3.protobuf.vo.OnlineChallengeUserVO user_score = 1;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengeUserVOOrBuilder getUserScoreOrBuilder(
      int index);

  /**
   * <pre>
   * 当前用户今日排名
   * </pre>
   *
   * <code>string position = 2;</code>
   * @return The position.
   */
  java.lang.String getPosition();
  /**
   * <pre>
   * 当前用户今日排名
   * </pre>
   *
   * <code>string position = 2;</code>
   * @return The bytes for position.
   */
  com.google.protobuf.ByteString
      getPositionBytes();

  /**
   * <pre>
   * 当前用户昨日排名
   * </pre>
   *
   * <code>string yesterday_position = 3;</code>
   * @return The yesterdayPosition.
   */
  java.lang.String getYesterdayPosition();
  /**
   * <pre>
   * 当前用户昨日排名
   * </pre>
   *
   * <code>string yesterday_position = 3;</code>
   * @return The bytes for yesterdayPosition.
   */
  com.google.protobuf.ByteString
      getYesterdayPositionBytes();

  /**
   * <pre>
   * 当前用户今日挑战最高分数
   * </pre>
   *
   * <code>uint32 score = 4;</code>
   * @return The score.
   */
  int getScore();

  /**
   * <pre>
   * 当前用户今日剩余挑战次数
   * </pre>
   *
   * <code>uint32 challenge_num = 5;</code>
   * @return The challengeNum.
   */
  int getChallengeNum();
}