package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.coursecyclical.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-12 10:15:23
 */
public class AlipayEbppIndustryCareertrainingCoursecyclicalCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5743217475532115933L;

	/** 
	 * 业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
