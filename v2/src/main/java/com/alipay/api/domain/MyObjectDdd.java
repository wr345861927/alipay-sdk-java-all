package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ddd
 *
 * @author auto create
 * @since 1.0, 2018-08-08 21:56:22
 */
public class MyObjectDdd extends AlipayObject {

	private static final long serialVersionUID = 7524469216826498956L;

	/**
	 * xx
	 */
	@ApiField("item")
	private String item;

	/**
	 * xxx
	 */
	@ApiField("param")
	private String param;

	public String getItem() {
		return this.item;
	}
	public void setItem(String item) {
		this.item = item;
	}

	public String getParam() {
		return this.param;
	}
	public void setParam(String param) {
		this.param = param;
	}

}
