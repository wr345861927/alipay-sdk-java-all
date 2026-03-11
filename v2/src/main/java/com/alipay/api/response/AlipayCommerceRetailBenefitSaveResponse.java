package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefit.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-10 15:52:08
 */
public class AlipayCommerceRetailBenefitSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8763212197935425438L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

}
