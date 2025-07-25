package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditloan.overdueresult.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-21 16:47:22
 */
public class ZhimaCreditEpCreditloanOverdueresultNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5721781462519977977L;

	/** 
	 * 返回结果。结构视financial_code的不同而定
	 */
	@ApiField("result_content")
	private String resultContent;

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public String getResultContent( ) {
		return this.resultContent;
	}

}
