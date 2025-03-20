package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.supervisortask.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-13 15:12:09
 */
public class AlipayCommerceYuntaskSupervisortaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1134217919835717231L;

	/** 
	 * 结果
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
