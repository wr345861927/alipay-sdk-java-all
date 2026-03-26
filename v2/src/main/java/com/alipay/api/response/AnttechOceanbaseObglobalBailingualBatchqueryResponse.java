package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FindTextResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.bailingual.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-24 14:12:44
 */
public class AnttechOceanbaseObglobalBailingualBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1164443394873975268L;

	/** 
	 * 响应对象
	 */
	@ApiField("result")
	private FindTextResponse result;

	public void setResult(FindTextResponse result) {
		this.result = result;
	}
	public FindTextResponse getResult( ) {
		return this.result;
	}

}
