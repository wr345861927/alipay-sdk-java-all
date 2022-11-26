package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.accept.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-16 15:41:35
 */
public class ZhimaCustomerContractAcceptCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5578878198717573284L;

	/** 
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractNo( ) {
		return this.contractNo;
	}

}
