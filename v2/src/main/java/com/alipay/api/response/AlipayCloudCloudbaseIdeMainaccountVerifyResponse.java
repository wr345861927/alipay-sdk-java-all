package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.ide.mainaccount.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 09:21:36
 */
public class AlipayCloudCloudbaseIdeMainaccountVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1419599972274921449L;

	/** 
	 * 校验结果
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
