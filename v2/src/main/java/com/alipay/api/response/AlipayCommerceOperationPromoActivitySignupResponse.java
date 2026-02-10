package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promo.activity.signup response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-10 15:12:44
 */
public class AlipayCommerceOperationPromoActivitySignupResponse extends AlipayResponse {

	private static final long serialVersionUID = 3568482966939599572L;

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
