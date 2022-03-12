// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OnlineResponseProtocol.proto

package ly.pp.justpiano3.protobuf.vo;

public interface OnlineDailyVOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ly.pp.justpiano3.protobuf.vo.OnlineDailyVO)
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
   * 昨日在线时长列表
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineDailyTimeListVO daily_time_list = 2;</code>
   * @return Whether the dailyTimeList field is set.
   */
  boolean hasDailyTimeList();
  /**
   * <pre>
   * 昨日在线时长列表
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineDailyTimeListVO daily_time_list = 2;</code>
   * @return The dailyTimeList.
   */
  ly.pp.justpiano3.protobuf.vo.OnlineDailyTimeListVO getDailyTimeList();
  /**
   * <pre>
   * 昨日在线时长列表
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineDailyTimeListVO daily_time_list = 2;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineDailyTimeListVOOrBuilder getDailyTimeListOrBuilder();

  /**
   * <pre>
   * 领取每日奖励
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineDailyPrizeGetVO daily_prize_get = 3;</code>
   * @return Whether the dailyPrizeGet field is set.
   */
  boolean hasDailyPrizeGet();
  /**
   * <pre>
   * 领取每日奖励
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineDailyPrizeGetVO daily_prize_get = 3;</code>
   * @return The dailyPrizeGet.
   */
  ly.pp.justpiano3.protobuf.vo.OnlineDailyPrizeGetVO getDailyPrizeGet();
  /**
   * <pre>
   * 领取每日奖励
   * </pre>
   *
   * <code>.ly.pp.justpiano3.protobuf.vo.OnlineDailyPrizeGetVO daily_prize_get = 3;</code>
   */
  ly.pp.justpiano3.protobuf.vo.OnlineDailyPrizeGetVOOrBuilder getDailyPrizeGetOrBuilder();

  public ly.pp.justpiano3.protobuf.vo.OnlineDailyVO.DailyCase getDailyCase();
}
