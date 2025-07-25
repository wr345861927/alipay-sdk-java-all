package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-18 11:58:41
 */
public class AnttechOceanbaseInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2864513458818154929L;

	/** 
	 * 申请单业务主键
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
