package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iot.clerkinspire.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:22:40
 */
public class AlipayOpenIotClerkinspireQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5116651484632941594L;

	/** 
	 * 时间毫秒数
	 */
	@ApiField("begin_time")
	private String beginTime;

	/** 
	 * 单收银员每日最多同时打卡设备数
	 */
	@ApiField("checkin_device_limit")
	private String checkinDeviceLimit;

	/** 
	 * 单设备每日最多打卡人数
	 */
	@ApiField("clerk_limit")
	private String clerkLimit;

	/** 
	 * 日激励笔数上线
	 */
	@ApiField("daily_max_trade_threshold")
	private String dailyMaxTradeThreshold;

	/** 
	 * 时间毫秒数
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 未报名：UN_SIGN_UP
 、已报名，未打卡：UN_CHECK_IN
 、已打卡：CHECKED_IN
	 */
	@ApiField("join_status")
	private String joinStatus;

	/** 
	 * 单笔返奖金额
	 */
	@ApiField("single_reward_amount")
	private String singleRewardAmount;

	/** 
	 * 交易门槛数
	 */
	@ApiField("trade_threshold")
	private String tradeThreshold;

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getBeginTime( ) {
		return this.beginTime;
	}

	public void setCheckinDeviceLimit(String checkinDeviceLimit) {
		this.checkinDeviceLimit = checkinDeviceLimit;
	}
	public String getCheckinDeviceLimit( ) {
		return this.checkinDeviceLimit;
	}

	public void setClerkLimit(String clerkLimit) {
		this.clerkLimit = clerkLimit;
	}
	public String getClerkLimit( ) {
		return this.clerkLimit;
	}

	public void setDailyMaxTradeThreshold(String dailyMaxTradeThreshold) {
		this.dailyMaxTradeThreshold = dailyMaxTradeThreshold;
	}
	public String getDailyMaxTradeThreshold( ) {
		return this.dailyMaxTradeThreshold;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setJoinStatus(String joinStatus) {
		this.joinStatus = joinStatus;
	}
	public String getJoinStatus( ) {
		return this.joinStatus;
	}

	public void setSingleRewardAmount(String singleRewardAmount) {
		this.singleRewardAmount = singleRewardAmount;
	}
	public String getSingleRewardAmount( ) {
		return this.singleRewardAmount;
	}

	public void setTradeThreshold(String tradeThreshold) {
		this.tradeThreshold = tradeThreshold;
	}
	public String getTradeThreshold( ) {
		return this.tradeThreshold;
	}

}
