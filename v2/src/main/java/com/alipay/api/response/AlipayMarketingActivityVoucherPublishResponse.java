package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 17:42:00
 */
public class AlipayMarketingActivityVoucherPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 6682556818495544758L;

	/** 
	 * 预充值链接
	 */
	@ApiField("recharge_url")
	private String rechargeUrl;

	public void setRechargeUrl(String rechargeUrl) {
		this.rechargeUrl = rechargeUrl;
	}
	public String getRechargeUrl( ) {
		return this.rechargeUrl;
	}

}
