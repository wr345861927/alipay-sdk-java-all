package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.consume.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 16:36:29
 */
public class AlipayMarketingCardConsumeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8348646238971799547L;

	/** 
	 * 外部卡号
	 */
	@ApiField("external_card_no")
	private String externalCardNo;

	public void setExternalCardNo(String externalCardNo) {
		this.externalCardNo = externalCardNo;
	}
	public String getExternalCardNo( ) {
		return this.externalCardNo;
	}

}
