package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilepay.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-15 14:37:51
 */
public class ZolozAuthenticationCustomerSmilepayInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6122253195241366318L;

	/** 
	 * 返回值
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
