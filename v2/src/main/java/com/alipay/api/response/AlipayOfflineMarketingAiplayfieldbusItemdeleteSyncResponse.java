package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.aiplayfieldbus.itemdelete.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 15:04:45
 */
public class AlipayOfflineMarketingAiplayfieldbusItemdeleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4759955725618125777L;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
