package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订阅创建
 *
 * @author auto create
 * @since 1.0, 2026-04-14 23:17:44
 */
public class AlipayTradeSubscriptionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8589167733623564298L;

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
	 * 保存在订阅里的元数据
	 */
	@ApiField("metadata")
	private String metadata;

	/**
	 * 支付金额，单位分；
仅用于商户自定义金额，若传了该值，用户实际支付金额会以该值为准
	 */
	@ApiField("pay_amount")
	private Long payAmount;

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

	public String getMetadata() {
		return this.metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getSubscribeTitle() {
		return this.subscribeTitle;
	}
	public void setSubscribeTitle(String subscribeTitle) {
		this.subscribeTitle = subscribeTitle;
	}

}
