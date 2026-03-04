package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shop.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 17:52:44
 */
public class AlipayCommerceLifeserviceShopSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5783227234347618616L;

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
