package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果数据
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:42:45
 */
public class RightsResult extends AlipayObject {

	private static final long serialVersionUID = 7563957725937247831L;

	/**
	 * 是否有权益
	 */
	@ApiField("rights")
	private String rights;

	public String getRights() {
		return this.rights;
	}
	public void setRights(String rights) {
		this.rights = rights;
	}

}
