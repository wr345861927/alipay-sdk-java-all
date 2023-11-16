package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.interbank.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:28:27
 */
public class AnttechBlockchainDefinFinanceInterbankQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4361127621886842963L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private BizResult bizResult;

	public void setBizResult(BizResult bizResult) {
		this.bizResult = bizResult;
	}
	public BizResult getBizResult( ) {
		return this.bizResult;
	}

}
