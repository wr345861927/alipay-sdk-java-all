package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果数据
 *
 * @author auto create
 * @since 1.0, 2026-04-10 17:37:44
 */
public class UserQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 5574929966613583829L;

	/**
	 * 支付宝登录账户的手机号,非患者手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
