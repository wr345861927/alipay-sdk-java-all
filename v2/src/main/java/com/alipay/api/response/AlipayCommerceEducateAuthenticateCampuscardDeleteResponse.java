package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.authenticate.campuscard.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 19:30:13
 */
public class AlipayCommerceEducateAuthenticateCampuscardDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7545286931367764696L;

	/** 
	 * 如果学生学籍更新成功，则返回SUCCESS ， 失败返回FAIL。
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
