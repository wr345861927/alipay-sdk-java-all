package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certdoc.certverify.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-04 14:49:53
 */
public class AlipayUserCertdocCertverifyPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2733255774991179454L;

	/** 
	 * 申请验证ID。有效期为 2 小时，过期后在校验接口使用会报错 "校验信息已过期"。
	 */
	@ApiField("verify_id")
	private String verifyId;

	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}
	public String getVerifyId( ) {
		return this.verifyId;
	}

}
