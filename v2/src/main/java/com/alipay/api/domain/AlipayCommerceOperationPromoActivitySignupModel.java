package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动报名
 *
 * @author auto create
 * @since 1.0, 2026-02-10 15:12:44
 */
public class AlipayCommerceOperationPromoActivitySignupModel extends AlipayObject {

	private static final long serialVersionUID = 1691322272376722917L;

	/**
	 * 活动唯一编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 报名信息
	 */
	@ApiField("sign_up_info")
	private String signUpInfo;

	/**
	 * 主体ID
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 报名主体类型
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSignUpInfo() {
		return this.signUpInfo;
	}
	public void setSignUpInfo(String signUpInfo) {
		this.signUpInfo = signUpInfo;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
