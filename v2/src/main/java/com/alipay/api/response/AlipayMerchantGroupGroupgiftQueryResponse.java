package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MultiChannelJoinGiftVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupgift.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-30 14:47:02
 */
public class AlipayMerchantGroupGroupgiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4463718815562857966L;

	/** 
	 * 多渠道入群有礼
	 */
	@ApiField("multi_channel_join_gift")
	private MultiChannelJoinGiftVO multiChannelJoinGift;

	public void setMultiChannelJoinGift(MultiChannelJoinGiftVO multiChannelJoinGift) {
		this.multiChannelJoinGift = multiChannelJoinGift;
	}
	public MultiChannelJoinGiftVO getMultiChannelJoinGift( ) {
		return this.multiChannelJoinGift;
	}

}
