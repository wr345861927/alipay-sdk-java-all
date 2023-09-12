package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.onepass.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:56:43
 */
public class DatadigitalFincloudGeneralsaasOnepassInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5286618945212291484L;

	/** 
	 * 本机校验流水ID，请保留方便排查问题
	 */
	@ApiField("certify_id")
	private String certifyId;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

}
