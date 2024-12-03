package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.settleaccountused.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 17:07:20
 */
public class AlipayCommerceMerchantcardSettleaccountusedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8789158873336798229L;

	/** 
	 * 结算收款的支付宝账号，登录账号，非pid
	 */
	@ApiField("settle_alipay_logon_id")
	private String settleAlipayLogonId;

	/** 
	 * 是否支持代扣
	 */
	@ApiField("support_deduct")
	private Boolean supportDeduct;

	public void setSettleAlipayLogonId(String settleAlipayLogonId) {
		this.settleAlipayLogonId = settleAlipayLogonId;
	}
	public String getSettleAlipayLogonId( ) {
		return this.settleAlipayLogonId;
	}

	public void setSupportDeduct(Boolean supportDeduct) {
		this.supportDeduct = supportDeduct;
	}
	public Boolean getSupportDeduct( ) {
		return this.supportDeduct;
	}

}
