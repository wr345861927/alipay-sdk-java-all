package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 固定金额
 *
 * @author auto create
 * @since 1.0, 2017-03-02 11:28:27
 */
public class KbAdvertQuotaCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 1812819269757159265L;

	/**
	 * 固定金额
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
