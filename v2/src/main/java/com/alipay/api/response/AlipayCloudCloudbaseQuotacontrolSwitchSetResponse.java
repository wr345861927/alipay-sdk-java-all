package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.quotacontrol.switch.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-19 14:31:43
 */
public class AlipayCloudCloudbaseQuotacontrolSwitchSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2382165367771852918L;

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
