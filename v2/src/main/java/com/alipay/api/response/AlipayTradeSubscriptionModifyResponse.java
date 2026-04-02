package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 10:27:44
 */
public class AlipayTradeSubscriptionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5526616933851339227L;

	/** 
	 * alipay_schema
	 */
	@ApiField("alipay_schema")
	private String alipaySchema;

	/** 
	 * 支付金额，单位分
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/** 
	 * 订阅id
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	public void setAlipaySchema(String alipaySchema) {
		this.alipaySchema = alipaySchema;
	}
	public String getAlipaySchema( ) {
		return this.alipaySchema;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}
	public Long getPayAmount( ) {
		return this.payAmount;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionId( ) {
		return this.subscriptionId;
	}

}
