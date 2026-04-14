package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订阅创建
 *
 * @author auto create
 * @since 1.0, 2026-04-14 12:25:48
 */
public class AlipayTradeSubscriptionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5312243547516642424L;

	/**
	 * 支付宝客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("subscription_item")
	private List<SubscriptionItem> items;

	/**
	 * 订单标题
	 */
	@ApiField("subscribe_title")
	private String subscribeTitle;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<SubscriptionItem> getItems() {
		return this.items;
	}
	public void setItems(List<SubscriptionItem> items) {
		this.items = items;
	}

	public String getSubscribeTitle() {
		return this.subscribeTitle;
	}
	public void setSubscribeTitle(String subscribeTitle) {
		this.subscribeTitle = subscribeTitle;
	}

}
