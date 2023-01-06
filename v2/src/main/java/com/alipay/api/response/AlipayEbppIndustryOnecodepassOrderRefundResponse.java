package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.onecodepass.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-20 19:51:40
 */
public class AlipayEbppIndustryOnecodepassOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8149765111218245484L;

	/** 
	 * 本次退款是否发生了资金变化，Y 为发生变化
	 */
	@ApiField("fund_status")
	private String fundStatus;

	/** 
	 * 当前退款金额。
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}
	public String getFundStatus( ) {
		return this.fundStatus;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}
	public String getRefundFee( ) {
		return this.refundFee;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
