package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 融资租赁业务单交易撤销
 *
 * @author auto create
 * @since 1.0, 2024-11-21 15:32:00
 */
public class AlipayCommerceWithholdrepayorderTradeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2241599796695425821L;

	/**
	 * 原支付请求的商户订单号,和支付宝交易号不能同时为空
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝交易号，和商户订单号不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
