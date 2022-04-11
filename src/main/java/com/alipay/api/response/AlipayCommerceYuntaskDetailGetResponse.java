package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.YunTaskTemplateInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-24 09:51:38
 */
public class AlipayCommerceYuntaskDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3771123148955657385L;

	/** 
	 * 任务详情
	 */
	@ApiField("task")
	private YunTaskTemplateInfoDTO task;

	public void setTask(YunTaskTemplateInfoDTO task) {
		this.task = task;
	}
	public YunTaskTemplateInfoDTO getTask( ) {
		return this.task;
	}

}