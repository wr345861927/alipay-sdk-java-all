package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * prodpay
 *
 * @author auto create
 * @since 1.0, 2020-07-03 10:59:55
 */
public class AlipaySecurityProdFacePayModel extends AlipayObject {

	private static final long serialVersionUID = 3835811337278115632L;

	/**
	 * 1
	 */
	@ApiField("a")
	private String a;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

}
