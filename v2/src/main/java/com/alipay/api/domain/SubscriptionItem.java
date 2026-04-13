package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-11 19:17:59
 */
public class SubscriptionItem extends AlipayObject {

	private static final long serialVersionUID = 5476128947948751598L;

	/**
	 * 订阅场景下项目id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 订阅场景下支付宝侧的项目id
	 */
	@ApiField("price_id")
	private String priceId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPriceId() {
		return this.priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}

}
