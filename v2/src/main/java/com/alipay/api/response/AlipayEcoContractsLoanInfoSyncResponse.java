package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.contracts.loan.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-10 15:26:59
 */
public class AlipayEcoContractsLoanInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4145821484929776858L;

	/** 
	 * true代表同步成功,false代表同步失败
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
