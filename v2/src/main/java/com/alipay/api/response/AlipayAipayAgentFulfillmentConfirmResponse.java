package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.agent.fulfillment.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-02 15:17:43
 */
public class AlipayAipayAgentFulfillmentConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1392954362345232446L;

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
