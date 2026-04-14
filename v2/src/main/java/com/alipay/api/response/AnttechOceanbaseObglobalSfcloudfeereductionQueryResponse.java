package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SaleForceQueryCouponResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcloudfeereduction.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 14:25:24
 */
public class AnttechOceanbaseObglobalSfcloudfeereductionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4212499161665824551L;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private SaleForceQueryCouponResponseDTO result;

	public void setResult(SaleForceQueryCouponResponseDTO result) {
		this.result = result;
	}
	public SaleForceQueryCouponResponseDTO getResult( ) {
		return this.result;
	}

}
