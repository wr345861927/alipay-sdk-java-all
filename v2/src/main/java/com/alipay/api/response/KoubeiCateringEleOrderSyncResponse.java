package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.ele.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:53:26
 */
public class KoubeiCateringEleOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8543646181754156154L;

	/** 
	 * 原始的订单id编号
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
