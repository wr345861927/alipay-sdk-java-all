package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfleadsmember.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 14:32:45
 */
public class AnttechOceanbaseObglobalSfleadsmemberModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8215726717317588998L;

	/** 
	 * 响应结果
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
