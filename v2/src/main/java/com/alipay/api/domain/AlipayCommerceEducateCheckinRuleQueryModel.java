package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到规则详情查询
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:59:26
 */
public class AlipayCommerceEducateCheckinRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3898821467662418791L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 签到规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

}
