package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.astoreshop.settle.add response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 11:52:05
 */
public class AntMerchantExpandAstoreshopSettleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5165483229288975575L;

	/** 
	 * 单据id
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
