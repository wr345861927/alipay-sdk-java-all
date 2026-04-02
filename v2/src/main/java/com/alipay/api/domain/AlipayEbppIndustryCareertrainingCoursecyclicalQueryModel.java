package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询有效课程班次
 *
 * @author auto create
 * @since 1.0, 2026-03-25 16:07:33
 */
public class AlipayEbppIndustryCareertrainingCoursecyclicalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2849936115574597596L;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

}
