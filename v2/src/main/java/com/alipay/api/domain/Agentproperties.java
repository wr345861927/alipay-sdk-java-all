package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务属性
 *
 * @author auto create
 * @since 1.0, 2026-03-21 20:57:42
 */
public class Agentproperties extends AlipayObject {

	private static final long serialVersionUID = 3247556148949862526L;

	/**
	 * 属性值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 属性值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
