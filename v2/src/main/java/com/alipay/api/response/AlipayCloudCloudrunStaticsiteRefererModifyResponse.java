package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RefererSetting;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.referer.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 11:26:43
 */
public class AlipayCloudCloudrunStaticsiteRefererModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7286857779272356236L;

	/** 
	 * referer配置
	 */
	@ApiField("referer")
	private RefererSetting referer;

	public void setReferer(RefererSetting referer) {
		this.referer = referer;
	}
	public RefererSetting getReferer( ) {
		return this.referer;
	}

}
