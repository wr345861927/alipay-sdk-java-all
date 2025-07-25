package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.status.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-27 10:42:31
 */
public class AlipayOpenAppServiceStatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3249123425959519686L;

	/** 
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
