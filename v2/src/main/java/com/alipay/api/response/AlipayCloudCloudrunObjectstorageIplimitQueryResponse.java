package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IPLimit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.iplimit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 16:02:01
 */
public class AlipayCloudCloudrunObjectstorageIplimitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4798969514816563545L;

	/** 
	 * IP黑白名单配置
	 */
	@ApiField("ip_limit")
	private IPLimit ipLimit;

	public void setIpLimit(IPLimit ipLimit) {
		this.ipLimit = ipLimit;
	}
	public IPLimit getIpLimit( ) {
		return this.ipLimit;
	}

}
