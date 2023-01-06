package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:24:41
 */
public class AlipayBusinessRelationShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2685119132916635164L;

	/** 
	 * 基于商业关系的代运营门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}
	public String getRealShopId( ) {
		return this.realShopId;
	}

}
