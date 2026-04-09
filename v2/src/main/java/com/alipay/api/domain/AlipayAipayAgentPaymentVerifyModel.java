package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * A2A商户支付凭证验证
 *
 * @author auto create
 * @since 1.0, 2026-04-09 11:07:45
 */
public class AlipayAipayAgentPaymentVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3681248314415919774L;

	/**
	 * 支付凭证
	 */
	@ApiField("payment_proof")
	private String paymentProof;

	/**
	 * 支付宝交易号，交易的唯一标识
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getPaymentProof() {
		return this.paymentProof;
	}
	public void setPaymentProof(String paymentProof) {
		this.paymentProof = paymentProof;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
