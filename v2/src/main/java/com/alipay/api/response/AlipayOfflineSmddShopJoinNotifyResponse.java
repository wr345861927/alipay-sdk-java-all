package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.shop.join.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-08 16:27:27
 */
public class AlipayOfflineSmddShopJoinNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5695316474833313269L;

	/** 
	 * 店铺id，进件通过后返回
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
