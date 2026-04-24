package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.aftersale.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-22 18:05:36
 */
public class AlipayCommerceRentOrderAftersaleConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5434192444512649465L;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
