package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电行业绿色能量发放接口
 *
 * @author auto create
 * @since 1.0, 2023-10-22 11:21:00
 */
public class AlipayEbppChargerGreenenergyPublishModel extends AlipayObject {

	private static final long serialVersionUID = 2876652354891592914L;

	/**
	 * 充电单据信息
	 */
	@ApiField("charge_order_info")
	private ChargeOrderInfo chargeOrderInfo;

	/**
	 * 充电度数，单位 瓦时，即度*1000，如果电量为12.34度则填写12340
	 */
	@ApiField("charge_power")
	private Long chargePower;

	/**
	 * 支付宝用户open_id
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 运营商组织机构代码
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 订单类型：ENERGY_TYPE(能量订单)
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 充电订单号，用于幂等控制，一笔外部充电订单号只可消费一次
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付模式	prePaidModel  预充值
 creditPayModel  先充后付
	 */
	@ApiField("pay_mode")
	private String payMode;

	/**
	 * 支付宝支付交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public ChargeOrderInfo getChargeOrderInfo() {
		return this.chargeOrderInfo;
	}
	public void setChargeOrderInfo(ChargeOrderInfo chargeOrderInfo) {
		this.chargeOrderInfo = chargeOrderInfo;
	}

	public Long getChargePower() {
		return this.chargePower;
	}
	public void setChargePower(Long chargePower) {
		this.chargePower = chargePower;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayMode() {
		return this.payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
