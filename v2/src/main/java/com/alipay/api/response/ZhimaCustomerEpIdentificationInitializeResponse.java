package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.ep.identification.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:23:37
 */
public class ZhimaCustomerEpIdentificationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4779734889979797388L;

	/** 
	 * 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
