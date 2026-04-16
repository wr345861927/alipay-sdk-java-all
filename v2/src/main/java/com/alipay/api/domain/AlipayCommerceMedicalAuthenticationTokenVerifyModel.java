package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISVH5页面鉴权token校验
 *
 * @author auto create
 * @since 1.0, 2026-04-10 17:42:45
 */
public class AlipayCommerceMedicalAuthenticationTokenVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2628479821814961123L;

	/**
	 * token数据
	 */
	@ApiField("token_data")
	private String tokenData;

	/**
	 * 跳转链接
	 */
	@ApiField("url")
	private String url;

	public String getTokenData() {
		return this.tokenData;
	}
	public void setTokenData(String tokenData) {
		this.tokenData = tokenData;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
