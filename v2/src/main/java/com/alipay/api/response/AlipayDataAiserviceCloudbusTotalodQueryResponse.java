package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusTotalOdItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.totalod.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:12:31
 */
public class AlipayDataAiserviceCloudbusTotalodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5526548798198974186L;

	/** 
	 * 客流总量结果
	 */
	@ApiField("result")
	private CloudbusTotalOdItem result;

	public void setResult(CloudbusTotalOdItem result) {
		this.result = result;
	}
	public CloudbusTotalOdItem getResult( ) {
		return this.result;
	}

}
