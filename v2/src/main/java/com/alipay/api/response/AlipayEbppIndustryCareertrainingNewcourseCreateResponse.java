package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.newcourse.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-12 10:15:24
 */
public class AlipayEbppIndustryCareertrainingNewcourseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4789659917512773998L;

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
