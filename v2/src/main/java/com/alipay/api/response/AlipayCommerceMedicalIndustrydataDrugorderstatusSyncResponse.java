package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.drugorderstatus.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:14
 */
public class AlipayCommerceMedicalIndustrydataDrugorderstatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5594131667962751411L;

	/** 
	 * 支付宝药品订单号
	 */
	@ApiField("drug_order_id")
	private String drugOrderId;

	public void setDrugOrderId(String drugOrderId) {
		this.drugOrderId = drugOrderId;
	}
	public String getDrugOrderId( ) {
		return this.drugOrderId;
	}

}
