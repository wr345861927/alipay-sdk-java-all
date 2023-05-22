package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.merchant.enterstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:06:25
 */
public class AlipayEbppInvoiceMerchantEnterstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6173557725196528495L;

	/** 
	 * 工单状态，审核中：AUDITING，验收中：ACCEPTING，成功：SUCCESS，失败：FAIL
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
