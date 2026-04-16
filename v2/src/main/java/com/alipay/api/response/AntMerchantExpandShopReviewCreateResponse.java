package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.review.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-16 11:14:20
 */
public class AntMerchantExpandShopReviewCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5145125946459757853L;

	/** 
	 * 同步时间
	 */
	@ApiField("sync_time")
	private Date syncTime;

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}
	public Date getSyncTime( ) {
		return this.syncTime;
	}

}
