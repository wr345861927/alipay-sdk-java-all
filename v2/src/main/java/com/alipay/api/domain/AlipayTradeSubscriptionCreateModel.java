package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订阅创建
 *
 * @author auto create
 * @since 1.0, 2026-04-08 00:32:44
 */
public class AlipayTradeSubscriptionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1214681294616477471L;

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
