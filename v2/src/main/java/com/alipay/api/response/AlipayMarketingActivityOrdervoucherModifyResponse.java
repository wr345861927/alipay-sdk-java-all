package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VoucherAvailableScopeResultInfo;
import com.alipay.api.domain.OrderVoucherUseRuleResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-30 22:12:29
 */
public class AlipayMarketingActivityOrdervoucherModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3464538756623979574L;

	/** 
	 * 可用范围结果
	 */
	@ApiField("voucher_available_scope_result_info")
	private VoucherAvailableScopeResultInfo voucherAvailableScopeResultInfo;

	/** 
	 * 核销规则请求结果
	 */
	@ApiField("voucher_use_rule_result")
	private OrderVoucherUseRuleResult voucherUseRuleResult;

	public void setVoucherAvailableScopeResultInfo(VoucherAvailableScopeResultInfo voucherAvailableScopeResultInfo) {
		this.voucherAvailableScopeResultInfo = voucherAvailableScopeResultInfo;
	}
	public VoucherAvailableScopeResultInfo getVoucherAvailableScopeResultInfo( ) {
		return this.voucherAvailableScopeResultInfo;
	}

	public void setVoucherUseRuleResult(OrderVoucherUseRuleResult voucherUseRuleResult) {
		this.voucherUseRuleResult = voucherUseRuleResult;
	}
	public OrderVoucherUseRuleResult getVoucherUseRuleResult( ) {
		return this.voucherUseRuleResult;
	}

}
