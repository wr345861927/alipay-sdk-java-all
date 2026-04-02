package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.service.product.buy response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-31 19:07:43
 */
public class AlipayCommerceEcServiceProductBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1292712168987625151L;

	/** 
	 * 服务订购单号
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
