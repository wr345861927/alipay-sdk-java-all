package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.cashpool.allocaterule.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 01:30:03
 */
public class AlipayAccountCashpoolAllocateruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4843317941428229275L;

	/** 
	 * 新增规则ID
	 */
	@ApiField("rule_id")
	private Long ruleId;

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}
	public Long getRuleId( ) {
		return this.ruleId;
	}

}
