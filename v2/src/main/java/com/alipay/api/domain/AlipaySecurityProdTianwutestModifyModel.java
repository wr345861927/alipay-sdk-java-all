package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tianwutest
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:19:49
 */
public class AlipaySecurityProdTianwutestModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4694868254222549219L;

	/**
	 * 测试
	 */
	@ApiField("tianwutest")
	private String tianwutest;

	public String getTianwutest() {
		return this.tianwutest;
	}
	public void setTianwutest(String tianwutest) {
		this.tianwutest = tianwutest;
	}

}
