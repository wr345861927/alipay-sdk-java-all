package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.apartment.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 15:12:27
 */
public class AlipayCommerceHousingApartmentAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8522828411989486988L;

	/** 
	 * 公寓id
	 */
	@ApiField("apartment_id")
	private String apartmentId;

	public void setApartmentId(String apartmentId) {
		this.apartmentId = apartmentId;
	}
	public String getApartmentId( ) {
		return this.apartmentId;
	}

}
