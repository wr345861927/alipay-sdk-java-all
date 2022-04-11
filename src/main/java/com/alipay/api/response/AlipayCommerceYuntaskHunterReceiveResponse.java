package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.hunter.receive response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-25 10:56:38
 */
public class AlipayCommerceYuntaskHunterReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2518852245633564748L;

	/** 
	 * 任务id
	 */
	@ApiField("task_instance_id")
	private String taskInstanceId;

	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	public String getTaskInstanceId( ) {
		return this.taskInstanceId;
	}

}