package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:11:42
 */
public class AntMerchantExpandShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4417257463816517848L;

	/** 
	 * 申请单id
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
