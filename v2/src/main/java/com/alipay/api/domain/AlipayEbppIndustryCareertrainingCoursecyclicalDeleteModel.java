package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除课程班次
 *
 * @author auto create
 * @since 1.0, 2026-03-25 16:04:50
 */
public class AlipayEbppIndustryCareertrainingCoursecyclicalDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2622937946385276731L;

	/**
	 * 业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

}
