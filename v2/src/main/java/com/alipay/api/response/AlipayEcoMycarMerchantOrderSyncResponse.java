package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.merchant.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-23 10:46:53
 */
public class AlipayEcoMycarMerchantOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5794874465858239623L;

	/** 
	 * 车生活订单号
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
