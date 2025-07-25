package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yiyiyiwu.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOpenAppYiyiyiwuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3843647172569632122L;

	/** 
	 * 12
	 */
	@ApiField("chucan")
	private String chucan;

	public void setChucan(String chucan) {
		this.chucan = chucan;
	}
	public String getChucan( ) {
		return this.chucan;
	}

}
