package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.membergrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:36:21
 */
public class AlipayUserMembergradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4175919688289874152L;

	/** 
	 * 支付宝用户的蚂蚁会员等级
	 */
	@ApiField("grade")
	private String grade;

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade( ) {
		return this.grade;
	}

}
