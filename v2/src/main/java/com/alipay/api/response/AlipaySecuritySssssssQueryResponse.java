package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.sssssss.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:49:15
 */
public class AlipaySecuritySssssssQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4722874754551665785L;

	/** 
	 * af
	 */
	@ApiField("adfad")
	private String adfad;

	public void setAdfad(String adfad) {
		this.adfad = adfad;
	}
	public String getAdfad( ) {
		return this.adfad;
	}

}
