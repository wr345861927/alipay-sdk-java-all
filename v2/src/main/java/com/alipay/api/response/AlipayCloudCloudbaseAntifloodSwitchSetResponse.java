package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.switch.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:46:44
 */
public class AlipayCloudCloudbaseAntifloodSwitchSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5145824734121683885L;

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
