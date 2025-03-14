package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WatchPromoPrizeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.pocketmoney.promo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-25 11:30:09
 */
public class AlipayPayAppPocketmoneyPromoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5562976759924598741L;

	/** 
	 * 奖品列表
	 */
	@ApiListField("prize_list")
	@ApiField("watch_promo_prize_detail")
	private List<WatchPromoPrizeDetail> prizeList;

	public void setPrizeList(List<WatchPromoPrizeDetail> prizeList) {
		this.prizeList = prizeList;
	}
	public List<WatchPromoPrizeDetail> getPrizeList( ) {
		return this.prizeList;
	}

}
