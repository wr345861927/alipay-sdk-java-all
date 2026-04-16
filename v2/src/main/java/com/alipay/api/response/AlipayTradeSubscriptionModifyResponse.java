package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 00:27:45
 */
public class AlipayTradeSubscriptionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8811612188125988834L;

	/** 
	 * 长链，适用于跳转拉起支付宝端
	 */
	@ApiField("alipay_jump_schema")
	private String alipayJumpSchema;

	/** 
	 * 短链，适用于生成二维码
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

	public void setAlipayJumpSchema(String alipayJumpSchema) {
		this.alipayJumpSchema = alipayJumpSchema;
	}
	public String getAlipayJumpSchema( ) {
		return this.alipayJumpSchema;
	}

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
