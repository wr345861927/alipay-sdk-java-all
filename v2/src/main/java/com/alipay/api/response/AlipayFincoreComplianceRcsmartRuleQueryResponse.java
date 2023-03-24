package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RuleQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcsmart.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:36:44
 */
public class AlipayFincoreComplianceRcsmartRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4815394144629416525L;

	/** 
	 * 规则查询结果
	 */
	@ApiField("data")
	private RuleQueryResult data;

	public void setData(RuleQueryResult data) {
		this.data = data;
	}
	public RuleQueryResult getData( ) {
		return this.data;
	}

}
