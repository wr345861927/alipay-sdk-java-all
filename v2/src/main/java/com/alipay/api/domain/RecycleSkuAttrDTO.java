package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-02 10:52:24
 */
public class RecycleSkuAttrDTO extends AlipayObject {

	private static final long serialVersionUID = 7771796798421216439L;

	/**
	 * 回收商品销售属性code值，对应回收问券的问题code值
	 */
	@ApiField("attr_code")
	private String attrCode;

	/**
	 * 回收商品的销售属性值，对应回收问券的选项code值
	 */
	@ApiField("attr_value")
	private String attrValue;

	public String getAttrCode() {
		return this.attrCode;
	}
	public void setAttrCode(String attrCode) {
		this.attrCode = attrCode;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

}
