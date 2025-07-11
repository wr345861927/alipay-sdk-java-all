package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.status.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:45
 */
public class AlipayCloudCloudbaseEnvStatusSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6619427914941995629L;

	/** 
	 * 设置结果
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
