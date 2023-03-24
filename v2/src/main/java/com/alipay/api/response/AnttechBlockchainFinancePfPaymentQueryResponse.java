package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.pf.payment.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:58:37
 */
public class AnttechBlockchainFinancePfPaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7259241124483217742L;

	/** 
	 * 入账状态
	 */
	@ApiField("account_in_status")
	private String accountInStatus;

	/** 
	 * 个性化参数
	 */
	@ApiField("parm")
	private String parm;

	public void setAccountInStatus(String accountInStatus) {
		this.accountInStatus = accountInStatus;
	}
	public String getAccountInStatus( ) {
		return this.accountInStatus;
	}

	public void setParm(String parm) {
		this.parm = parm;
	}
	public String getParm( ) {
		return this.parm;
	}

}
