package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.activity.appitemvoucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-19 21:22:06
 */
public class AlipayMarketingToolActivityAppitemvoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6419867296799864743L;

	/** 
	 * 活动ID
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
