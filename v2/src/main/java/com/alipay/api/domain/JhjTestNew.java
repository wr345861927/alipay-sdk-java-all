package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * JhjTestNew
 *
 * @author auto create
 * @since 1.0, 2023-12-08 17:39:18
 */
public class JhjTestNew extends AlipayObject {

	private static final long serialVersionUID = 5518455649671326663L;

	/**
	 * 2
	 */
	@ApiField("aaa")
	private String aaa;

	public String getAaa() {
		return this.aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

}
