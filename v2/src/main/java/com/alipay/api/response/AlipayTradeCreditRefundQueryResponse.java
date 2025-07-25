package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 16:02:35
 */
public class AlipayTradeCreditRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3213769683751367318L;

	/** 
	 * 信用单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 本笔请求退款成功的时间
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/** 
	 * 信用订单总金额，单位：元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/** 
	 * 查询的退款请求中退款成功的金额，单位：元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}
	public String getGmtRefund( ) {
		return this.gmtRefund;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderAmount( ) {
		return this.orderAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

}
