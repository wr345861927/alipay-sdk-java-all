package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.update response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 10:28:46
 */
public class AlipayMarketingCampaignDrawcampUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6745612459965477449L;

	/** 
	 * 操作结果状态，true表示修改成功立即生效，false表示修改失败
	 */
	@ApiField("camp_result")
	private Boolean campResult;

	public void setCampResult(Boolean campResult) {
		this.campResult = campResult;
	}
	public Boolean getCampResult( ) {
		return this.campResult;
	}

}
