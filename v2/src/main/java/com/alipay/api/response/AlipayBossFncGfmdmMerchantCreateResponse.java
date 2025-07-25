package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfmdm.merchant.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-15 10:32:07
 */
public class AlipayBossFncGfmdmMerchantCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5787812298388934443L;

	/** 
	 * 客商主数据ID
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
