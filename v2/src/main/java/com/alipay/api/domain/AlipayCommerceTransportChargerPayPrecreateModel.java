package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即插即充预下单同步
 *
 * @author auto create
 * @since 1.0, 2025-04-10 12:00:48
 */
public class AlipayCommerceTransportChargerPayPrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 8361827679674658927L;

	/**
	 * 互联互通充电枪（设备）ID，用于关联用户充电使用的充电站
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单类型：PNC（即插即充订单）、NORMAL（普通订单）
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 商户订单号。 订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 互联互通充电站编码
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车架号
	 */
	@ApiField("vin")
	private String vin;

	public String getConnectorId() {
		return this.connectorId;
	}
	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
