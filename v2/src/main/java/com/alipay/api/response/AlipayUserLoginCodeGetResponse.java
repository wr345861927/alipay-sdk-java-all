package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.login.code.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 20:17:02
 */
public class AlipayUserLoginCodeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5265714748767521643L;

	/** 
	 * 用户登录凭证（有效期五分钟）。开发者需要在开发者服务器后台调用 alipay.user.session.get，使用 loginCode 换取 openid、unionid等信息。
	 */
	@ApiField("login_code")
	private String loginCode;

	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}
	public String getLoginCode( ) {
		return this.loginCode;
	}

}
