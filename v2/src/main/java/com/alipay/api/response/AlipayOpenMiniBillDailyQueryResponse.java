package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CertBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.bill.daily.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-03 19:22:00
 */
public class AlipayOpenMiniBillDailyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7781674816745132182L;

	/** 
	 * 查询返回的账单
	 */
	@ApiField("response")
	private CertBillDetail response;

	public void setResponse(CertBillDetail response) {
		this.response = response;
	}
	public CertBillDetail getResponse( ) {
		return this.response;
	}

}
