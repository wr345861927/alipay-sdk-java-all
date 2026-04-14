package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SaleForceCouponCreateResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcloudfeereduction.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 14:27:46
 */
public class AnttechOceanbaseObglobalSfcloudfeereductionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7565548199398233219L;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private SaleForceCouponCreateResponseDTO result;

	public void setResult(SaleForceCouponCreateResponseDTO result) {
		this.result = result;
	}
	public SaleForceCouponCreateResponseDTO getResult( ) {
		return this.result;
	}

}
