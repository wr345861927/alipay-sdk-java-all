package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.petinsure.signurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 16:32:06
 */
public class AlipayCommercePetinsureSignurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7367885611981361863L;

	/** 
	 * 商户签约地址
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
