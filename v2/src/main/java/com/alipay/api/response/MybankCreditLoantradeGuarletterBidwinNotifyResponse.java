package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.bidwin.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:44:55
 */
public class MybankCreditLoantradeGuarletterBidwinNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1138778126834621654L;

	/** 
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
