package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChannelShop;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.channeldigitalpoi.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-26 19:37:44
 */
public class AntMerchantExpandChanneldigitalpoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8545495532696123144L;

	/** 
	 * null
	 */
	@ApiListField("shop_info")
	@ApiField("channel_shop")
	private List<ChannelShop> shopInfo;

	public void setShopInfo(List<ChannelShop> shopInfo) {
		this.shopInfo = shopInfo;
	}
	public List<ChannelShop> getShopInfo( ) {
		return this.shopInfo;
	}

}
