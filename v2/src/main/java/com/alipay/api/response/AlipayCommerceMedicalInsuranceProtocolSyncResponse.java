package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.protocol.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-19 17:52:11
 */
public class AlipayCommerceMedicalInsuranceProtocolSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4381887753924724896L;

	/** 
	 * 返回结果
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
