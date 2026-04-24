package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-22 11:52:45
 */
public class ResaleOrderItemVO extends AlipayObject {

	private static final long serialVersionUID = 6459464877874919313L;

	/**
	 * 小程序商品库的itemId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 单位：元
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 商品数量
	 */
	@ApiField("item_quantity")
	private String itemQuantity;

	/**
	 * 若商家没有走小程序商品库，则回传商家自己的外部商品id（公域要去必须走小程序商品库）
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部商户商品名称
	 */
	@ApiField("out_item_name")
	private String outItemName;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutItemName() {
		return this.outItemName;
	}
	public void setOutItemName(String outItemName) {
		this.outItemName = outItemName;
	}

}
