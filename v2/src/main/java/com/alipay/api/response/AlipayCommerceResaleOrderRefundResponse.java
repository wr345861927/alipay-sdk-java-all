package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.resale.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-22 11:47:45
 */
public class AlipayCommerceResaleOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7523728632792651725L;

	/** 
	 * 退款编码
	 */
	@ApiField("refund_id")
	private String refundId;

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getRefundId( ) {
		return this.refundId;
	}

}
