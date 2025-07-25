package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.house.rental.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-08 19:52:30
 */
public class AlipayCommerceHousingHouseRentalAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5785555274385929659L;

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
