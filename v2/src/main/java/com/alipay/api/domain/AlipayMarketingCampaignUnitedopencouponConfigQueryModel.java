package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联合营销消费券开放券包配置查询
 *
 * @author auto create
 * @since 1.0, 2023-05-06 18:11:26
 */
public class AlipayMarketingCampaignUnitedopencouponConfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8217391759948564188L;

	/**
	 * 用户支付宝绑定手机号。user_id、login_id、bind_mobile三个参数至少有一个非空。
	 */
	@ApiField("bind_mobile")
	private String bindMobile;

	/**
	 * 活动id（对应活动详情页面的活动编号）
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 渠道来源参数
	 */
	@ApiField("channel_info")
	private String channelInfo;

	/**
	 * 客户端ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 用户登录账号名：邮箱或手机号。该参数用于已知支付宝账号的活动查询与触发。user_id、login_id、bind_mobile三个参数至少有一个非空。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 终端id
	 */
	@ApiField("term_id")
	private String termId;

	/**
	 * 支付宝用户uid：支付宝用户唯一标识。该参数用于已知支付宝账号的活动查询与触发。user_id、login_id、bind_mobile三个参数至少有一个非空。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBindMobile() {
		return this.bindMobile;
	}
	public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getChannelInfo() {
		return this.channelInfo;
	}
	public void setChannelInfo(String channelInfo) {
		this.channelInfo = channelInfo;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTermId() {
		return this.termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
