package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.bkpromosceneorder.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:48:15
 */
public class MybankMarketingCampaignBkpromosceneorderPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1531454832617939633L;

	/** 
	 * 用户当前的可用积分
	 */
	@ApiField("point")
	private Long point;

	public void setPoint(Long point) {
		this.point = point;
	}
	public Long getPoint( ) {
		return this.point;
	}

}
