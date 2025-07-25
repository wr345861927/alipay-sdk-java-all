package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CorsSetting;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.oss.cors.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-03 11:17:03
 */
public class AlipayCloudCloudrunOssCorsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2862211385883749856L;

	/** 
	 * 跨域配置
	 */
	@ApiField("cors")
	private CorsSetting cors;

	public void setCors(CorsSetting cors) {
		this.cors = cors;
	}
	public CorsSetting getCors( ) {
		return this.cors;
	}

}
