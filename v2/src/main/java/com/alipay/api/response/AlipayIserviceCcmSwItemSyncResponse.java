package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.item.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-06 20:21:56
 */
public class AlipayIserviceCcmSwItemSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4846475225994293451L;

	/** 
	 * 返回的外部批次id
	 */
	@ApiField("syn_id")
	private String synId;

	public void setSynId(String synId) {
		this.synId = synId;
	}
	public String getSynId( ) {
		return this.synId;
	}

}
