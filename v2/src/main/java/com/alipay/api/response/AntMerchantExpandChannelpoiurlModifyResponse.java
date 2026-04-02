package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.channelpoiurl.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-26 19:37:44
 */
public class AntMerchantExpandChannelpoiurlModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6336367813835884443L;

	/** 
	 * 小程序同步情况
	 */
	@ApiField("progress")
	private String progress;

	/** 
	 * 小程序appId
	 */
	@ApiField("shop_app_id")
	private String shopAppId;

	public void setProgress(String progress) {
		this.progress = progress;
	}
	public String getProgress( ) {
		return this.progress;
	}

	public void setShopAppId(String shopAppId) {
		this.shopAppId = shopAppId;
	}
	public String getShopAppId( ) {
		return this.shopAppId;
	}

}
