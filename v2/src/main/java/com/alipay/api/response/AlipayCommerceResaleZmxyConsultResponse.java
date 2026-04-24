package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.resale.zmxy.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-24 09:52:45
 */
public class AlipayCommerceResaleZmxyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5349186358267737926L;

	/** 
	 * 是否准入
	 */
	@ApiField("permit")
	private Boolean permit;

	public void setPermit(Boolean permit) {
		this.permit = permit;
	}
	public Boolean getPermit( ) {
		return this.permit;
	}

}
