package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.rarename.detect response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:15
 */
public class AlipayUserCertifyRarenameDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1625967288851749314L;

	/** 
	 * 业务结果码，取值: IS_RARE_NAME(是特殊名字), NOT_RARE_NAME(不是特殊名字), POSSIBLE_RARE_NAME(可能是特殊名字)。
	 */
	@ApiField("ret_code")
	private String retCode;

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetCode( ) {
		return this.retCode;
	}

}
