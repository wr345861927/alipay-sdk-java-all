package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资明细
 *
 * @author auto create
 * @since 1.0, 2025-06-30 14:03:30
 */
public class FsFundRelationDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 4262756311368939641L;

	/**
	 * 出资金额是否允许上浮
	 */
	@ApiField("allowed_float_up")
	private Boolean allowedFloatUp;

	/**
	 * 当预算不足时允许跳过预算扣减
	 */
	@ApiField("allows_skip_budget_deduction")
	private Boolean allowsSkipBudgetDeduction;

	/**
	 * 封顶金额，单位元
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 优先级，按顺序出资时必填，值越小优先级越大
	 */
	@ApiField("fund_priority")
	private Long fundPriority;

	/**
	 * 平台出资
	 */
	@ApiField("fund_provider")
	private String fundProvider;

	/**
	 * 出资比例，按比例出资时必填，值必须是小于等于100的整数，如出资比例33%，值为33
	 */
	@ApiField("fund_ratio")
	private Long fundRatio;

	/**
	 * 余额
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 出资账号对应用户ID
	 */
	@ApiField("fund_user_id")
	private String fundUserId;

	public Boolean getAllowedFloatUp() {
		return this.allowedFloatUp;
	}
	public void setAllowedFloatUp(Boolean allowedFloatUp) {
		this.allowedFloatUp = allowedFloatUp;
	}

	public Boolean getAllowsSkipBudgetDeduction() {
		return this.allowsSkipBudgetDeduction;
	}
	public void setAllowsSkipBudgetDeduction(Boolean allowsSkipBudgetDeduction) {
		this.allowsSkipBudgetDeduction = allowsSkipBudgetDeduction;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public Long getFundPriority() {
		return this.fundPriority;
	}
	public void setFundPriority(Long fundPriority) {
		this.fundPriority = fundPriority;
	}

	public String getFundProvider() {
		return this.fundProvider;
	}
	public void setFundProvider(String fundProvider) {
		this.fundProvider = fundProvider;
	}

	public Long getFundRatio() {
		return this.fundRatio;
	}
	public void setFundRatio(Long fundRatio) {
		this.fundRatio = fundRatio;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getFundUserId() {
		return this.fundUserId;
	}
	public void setFundUserId(String fundUserId) {
		this.fundUserId = fundUserId;
	}

}
