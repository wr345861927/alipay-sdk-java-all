package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authentication.token.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 17:42:45
 */
public class AlipayCommerceMedicalAuthenticationTokenVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7254429344361964192L;

	/** 
	 * 响应结果数据
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
