package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.order.settle response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-28 16:47:25
 */
public class AlipayTradeOrderSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 7865435155287896273L;

	/** 
	 * 支付宝分账单号，可以根据该单号查询单次分账请求执行结果
	 */
	@ApiField("settle_no")
	private String settleNo;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
