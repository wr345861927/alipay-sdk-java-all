package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.sku.cast.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-11 15:46:28
 */
public class AnttechNftSkuCastSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7761747626239855986L;

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
