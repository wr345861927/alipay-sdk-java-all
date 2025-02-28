package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fix.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 13:32:33
 */
public class AlipayCommerceFixTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1731472479531983533L;

	/** 
	 * 创建成功工单的唯一标识id。
	 */
	@ApiField("task_id")
	private Long taskId;

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public Long getTaskId( ) {
		return this.taskId;
	}

}
