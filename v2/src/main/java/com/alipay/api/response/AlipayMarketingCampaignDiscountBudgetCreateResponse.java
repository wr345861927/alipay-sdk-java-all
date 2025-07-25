package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.budget.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-30 11:52:41
 */
public class AlipayMarketingCampaignDiscountBudgetCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5165658535599357126L;

	/** 
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/** 
	 * 立减支付确认链接
	 */
	@ApiField("confirm_uri")
	private String confirmUri;

	/** 
	 * 资金订单号
	 */
	@ApiField("fund_order_no")
	private String fundOrderNo;

	public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}
	public String getBudgetId( ) {
		return this.budgetId;
	}

	public void setConfirmUri(String confirmUri) {
		this.confirmUri = confirmUri;
	}
	public String getConfirmUri( ) {
		return this.confirmUri;
	}

	public void setFundOrderNo(String fundOrderNo) {
		this.fundOrderNo = fundOrderNo;
	}
	public String getFundOrderNo( ) {
		return this.fundOrderNo;
	}

}
