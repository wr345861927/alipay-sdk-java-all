package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promo.activity.signup response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-13 21:12:45
 */
public class AlipayCommerceOperationPromoActivitySignupResponse extends AlipayResponse {

	private static final long serialVersionUID = 6539619192585656287L;

	/** 
	 * 报名返回
	 */
	@ApiField("sign_up_data")
	private String signUpData;

	public void setSignUpData(String signUpData) {
		this.signUpData = signUpData;
	}
	public String getSignUpData( ) {
		return this.signUpData;
	}

}
