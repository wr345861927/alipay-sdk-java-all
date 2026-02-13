package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shopdecoration.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-05 16:47:44
 */
public class AlipayCommerceLifeserviceShopdecorationSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3357952975595289193L;

	/** 
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
