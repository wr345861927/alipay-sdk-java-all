package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authorize.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-13 15:02:03
 */
public class AlipayCommerceMedicalAuthorizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1197141696557748427L;

	/** 
	 * 一码付签约状态
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
