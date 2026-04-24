package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.im.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 17:42:44
 */
public class AlipayCommerceMedicalImInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7711119428842982824L;

	/** 
	 * 结果数据
true，false
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
