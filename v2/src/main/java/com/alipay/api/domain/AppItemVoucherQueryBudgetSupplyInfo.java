package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算查询信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemVoucherQueryBudgetSupplyInfo extends AlipayObject {

	private static final long serialVersionUID = 2852144916983287762L;

	/**
	 * 出资方式
	 */
	@ApiField("budget_type")
	private String budgetType;

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

}
