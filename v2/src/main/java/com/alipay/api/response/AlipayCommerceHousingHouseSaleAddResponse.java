package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.house.sale.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-04 13:43:29
 */
public class AlipayCommerceHousingHouseSaleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3832236915232977318L;

	/** 
	 * 房源id
	 */
	@ApiField("housing_id")
	private String housingId;

	public void setHousingId(String housingId) {
		this.housingId = housingId;
	}
	public String getHousingId( ) {
		return this.housingId;
	}

}
