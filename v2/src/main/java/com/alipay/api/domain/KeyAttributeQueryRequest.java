package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-07-10 11:28:11
 */
public class KeyAttributeQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 6175811587185452574L;

	/**
	 * 属性KEY
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 属性值
	 */
	@ApiField("attr_value")
	private String attrValue;

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

}
