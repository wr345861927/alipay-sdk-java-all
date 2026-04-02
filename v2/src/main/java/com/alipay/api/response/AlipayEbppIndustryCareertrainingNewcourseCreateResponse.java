package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.newcourse.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-25 15:59:09
 */
public class AlipayEbppIndustryCareertrainingNewcourseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1832842521914879144L;

	/** 
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseId( ) {
		return this.courseId;
	}

}
