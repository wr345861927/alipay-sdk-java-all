package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.quotacontrol.switch.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-19 14:41:43
 */
public class AlipayCloudCloudbaseQuotacontrolSwitchGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7313259552411552279L;

	/** 
	 * 额度防控开关状态
	 */
	@ApiField("enable")
	private Boolean enable;

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	public Boolean getEnable( ) {
		return this.enable;
	}

}
