package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MarketActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.promotionactivity.consumerview.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:03:42
 */
public class AlipayMarketingCampaignPromotionactivityConsumerviewBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2286598975484977893L;

	/** 
	 * 可领券的活动列表
	 */
	@ApiListField("activities")
	@ApiField("market_activity_info")
	private List<MarketActivityInfo> activities;

	public void setActivities(List<MarketActivityInfo> activities) {
		this.activities = activities;
	}
	public List<MarketActivityInfo> getActivities( ) {
		return this.activities;
	}

}
