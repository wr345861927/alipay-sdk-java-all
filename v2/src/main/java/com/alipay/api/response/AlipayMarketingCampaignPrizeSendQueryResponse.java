package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prize.send.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 10:28:46
 */
public class AlipayMarketingCampaignPrizeSendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3344665765516192512L;

	/** 
	 * 中奖信息列表
	 */
	@ApiListField("prize_detail_list")
	@ApiField("prize_detail")
	private List<PrizeDetail> prizeDetailList;

	public void setPrizeDetailList(List<PrizeDetail> prizeDetailList) {
		this.prizeDetailList = prizeDetailList;
	}
	public List<PrizeDetail> getPrizeDetailList( ) {
		return this.prizeDetailList;
	}

}
