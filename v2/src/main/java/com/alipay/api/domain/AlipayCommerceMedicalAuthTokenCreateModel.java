package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁阿福用户授权令牌获取
 *
 * @author auto create
 * @since 1.0, 2026-03-03 14:27:43
 */
public class AlipayCommerceMedicalAuthTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5526119481362547976L;

	/**
	 * 授权码，用户对应用授权后得到
	 */
	@ApiField("auth_code")
	private String authCode;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

}
