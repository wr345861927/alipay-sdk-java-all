package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.fractal.ragsearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-10 17:02:30
 */
public class AlipayCommerceMedicalFractalRagsearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3551615912778658391L;

	/** 
	 * 请求信息，包含query, results, responseTime
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
