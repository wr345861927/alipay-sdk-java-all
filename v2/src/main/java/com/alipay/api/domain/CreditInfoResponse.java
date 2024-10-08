package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用创单相关参数
 *
 * @author auto create
 * @since 1.0, 2024-09-01 22:13:15
 */
public class CreditInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 8626592414379688413L;

	/**
	 * 芝麻信用下单页面地址
	 */
	@ApiField("credit_page_link")
	private String creditPageLink;

	public String getCreditPageLink() {
		return this.creditPageLink;
	}
	public void setCreditPageLink(String creditPageLink) {
		this.creditPageLink = creditPageLink;
	}

}
