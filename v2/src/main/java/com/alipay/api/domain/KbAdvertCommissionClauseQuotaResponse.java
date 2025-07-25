package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则（定额）
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:12
 */
public class KbAdvertCommissionClauseQuotaResponse extends AlipayObject {

	private static final long serialVersionUID = 5372219516987964824L;

	/**
	 * 分佣定额(精度2位的非负小数)
	 */
	@ApiField("quota_amount")
	private String quotaAmount;

	public String getQuotaAmount() {
		return this.quotaAmount;
	}
	public void setQuotaAmount(String quotaAmount) {
		this.quotaAmount = quotaAmount;
	}

}
