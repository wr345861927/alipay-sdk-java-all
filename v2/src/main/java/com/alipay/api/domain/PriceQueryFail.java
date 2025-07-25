package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * PriceQueryModel，结果不通过
 *
 * @author auto create
 * @since 1.0, 2023-07-12 17:03:46
 */
public class PriceQueryFail extends AlipayObject {

	private static final long serialVersionUID = 1198456791177264127L;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 11
	 */
	@ApiField("unit")
	private String unit;

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
