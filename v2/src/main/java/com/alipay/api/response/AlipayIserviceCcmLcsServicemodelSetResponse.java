package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.lcs.servicemodel.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:31:46
 */
public class AlipayIserviceCcmLcsServicemodelSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3595923969382822683L;

	/** 
	 * 操作返回结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
