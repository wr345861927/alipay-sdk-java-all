package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.alipay.security.prod.test response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:09
 */
public class AlipaySecurityProdAlipaySecurityProdTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 5241574779566431869L;

	/** 
	 * ddd
	 */
	@ApiField("admin")
	private String admin;

	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getAdmin( ) {
		return this.admin;
	}

}
