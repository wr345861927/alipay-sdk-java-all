package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.license.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-17 10:41:50
 */
public class AntMerchantExpandShopLicenseModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8263362868597197262L;

	/** 
	 * 2018011900502000000005124744
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
