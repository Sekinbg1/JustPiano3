// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

public interface OnlineChallengeVOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.vo.OnlineChallengeVO)
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
   * 每日挑战返回排名信息和个人信息
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengeEnterVO challenge_enter = 2;</code>
   * @return Whether the challengeEnter field is set.
   */
  boolean hasChallengeEnter();
  /**
   * <pre>
   * 每日挑战返回排名信息和个人信息
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengeEnterVO challenge_enter = 2;</code>
   * @return The challengeEnter.
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengeEnterVO getChallengeEnter();
  /**
   * <pre>
   * 每日挑战返回排名信息和个人信息
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengeEnterVO challenge_enter = 2;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengeEnterVOOrBuilder getChallengeEnterOrBuilder();

  /**
   * <pre>
   * 每日挑战返回曲目和对话框
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengeDialogVO challenge_dialog = 3;</code>
   * @return Whether the challengeDialog field is set.
   */
  boolean hasChallengeDialog();
  /**
   * <pre>
   * 每日挑战返回曲目和对话框
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengeDialogVO challenge_dialog = 3;</code>
   * @return The challengeDialog.
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengeDialogVO getChallengeDialog();
  /**
   * <pre>
   * 每日挑战返回曲目和对话框
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengeDialogVO challenge_dialog = 3;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengeDialogVOOrBuilder getChallengeDialogOrBuilder();

  /**
   * <pre>
   * 每日挑战结束弹奏时返回结果
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengeFinishVO challenge_finish = 4;</code>
   * @return Whether the challengeFinish field is set.
   */
  boolean hasChallengeFinish();
  /**
   * <pre>
   * 每日挑战结束弹奏时返回结果
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengeFinishVO challenge_finish = 4;</code>
   * @return The challengeFinish.
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengeFinishVO getChallengeFinish();
  /**
   * <pre>
   * 每日挑战结束弹奏时返回结果
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengeFinishVO challenge_finish = 4;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengeFinishVOOrBuilder getChallengeFinishOrBuilder();

  /**
   * <pre>
   * 每日挑战抽奖
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO challenge_prize = 5;</code>
   * @return Whether the challengePrize field is set.
   */
  boolean hasChallengePrize();
  /**
   * <pre>
   * 每日挑战抽奖
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO challenge_prize = 5;</code>
   * @return The challengePrize.
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO getChallengePrize();
  /**
   * <pre>
   * 每日挑战抽奖
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVO challenge_prize = 5;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineChallengePrizeVOOrBuilder getChallengePrizeOrBuilder();

  public ly.pp.justpiano3.protobuf.vo.OnlineChallengeVO.ChallengeCase getChallengeCase();
}