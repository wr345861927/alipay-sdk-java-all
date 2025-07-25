package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商品扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-06-17 10:07:50
 */
public class RentGoodsInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8112688963268262953L;

	/**
	 * 商品总价值，单位：元，精确到小数点后两位。
	 */
	@ApiField("item_value")
	private String itemValue;

	/**
	 * 租赁模式
	 */
	@ApiField("rent_model")
	private String rentModel;

	/**
	 * 是否监管机
	 */
	@ApiField("supervised")
	private Boolean supervised;

	public String getItemValue() {
		return this.itemValue;
	}
	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}

	public String getRentModel() {
		return this.rentModel;
	}
	public void setRentModel(String rentModel) {
		this.rentModel = rentModel;
	}

	public Boolean getSupervised() {
		return this.supervised;
	}
	public void setSupervised(Boolean supervised) {
		this.supervised = supervised;
	}

}
