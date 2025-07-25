package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业就医就医消息统一发送
 *
 * @author auto create
 * @since 1.0, 2025-05-22 10:45:19
 */
public class AlipayCommerceMedicalMsgUnifiedSendModel extends AlipayObject {

	private static final long serialVersionUID = 6353432978711849616L;

	/**
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝uid 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息;
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * api服务名
alipay.medical.nosubscribe.ordermsg.send 免订阅订单
alipay.medical.nosubscribe.msg.send 免订阅服务
	 */
	@ApiField("api_service")
	private String apiService;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 订单状态
	 */
	@ApiField("merchant_order_status")
	private String merchantOrderStatus;

	/**
	 * 消息渠道
	 */
	@ApiField("message_channel")
	private String messageChannel;

	/**
	 * 订单创建时间，时间格式为：yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单修改时间，时间格式为：yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 商户订单id，请保持唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部订单类型
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 模板码，支付宝侧定义
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 用户证件号
	 */
	@ApiField("user_card_no")
	private String userCardNo;

	/**
	 * 用户证件类型 目前仅支持身份证
	 */
	@ApiField("user_card_type")
	private String userCardType;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getApiService() {
		return this.apiService;
	}
	public void setApiService(String apiService) {
		this.apiService = apiService;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getMerchantOrderStatus() {
		return this.merchantOrderStatus;
	}
	public void setMerchantOrderStatus(String merchantOrderStatus) {
		this.merchantOrderStatus = merchantOrderStatus;
	}

	public String getMessageChannel() {
		return this.messageChannel;
	}
	public void setMessageChannel(String messageChannel) {
		this.messageChannel = messageChannel;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(Date orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getUserCardNo() {
		return this.userCardNo;
	}
	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getUserCardType() {
		return this.userCardType;
	}
	public void setUserCardType(String userCardType) {
		this.userCardType = userCardType;
	}

}
