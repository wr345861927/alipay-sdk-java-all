package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleWorkResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtask.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:03:40
 */
public class AlipayDataAiserviceCloudbusSchedualtaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6639762371115865798L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleWorkResult result;

	public void setResult(ScheduleWorkResult result) {
		this.result = result;
	}
	public ScheduleWorkResult getResult( ) {
		return this.result;
	}

}
