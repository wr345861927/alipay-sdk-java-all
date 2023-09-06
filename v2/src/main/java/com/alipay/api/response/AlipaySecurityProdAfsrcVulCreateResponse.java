package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.vul.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:32:23
 */
public class AlipaySecurityProdAfsrcVulCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4172611144646493983L;

	/** 
	 * 漏洞创建结果描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 漏洞创建是否成功标识
	 */
	@ApiField("result")
	private Boolean result;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
