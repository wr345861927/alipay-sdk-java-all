package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusPredictResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.predictresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 13:26:08
 */
public class AlipayDataAiserviceCloudbusPredictresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7527658363755199987L;

	/** 
	 * 预测线路结果
	 */
	@ApiField("result")
	private CloudbusPredictResult result;

	public void setResult(CloudbusPredictResult result) {
		this.result = result;
	}
	public CloudbusPredictResult getResult( ) {
		return this.result;
	}

}
