package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁预算DTO
 *
 * @author auto create
 * @since 1.0, 2023-01-11 15:04:15
 */
public class CfbudmacBizBudgetDTO extends AlipayObject {

	private static final long serialVersionUID = 5379495474825934731L;

	/**
	 * 方案剩余可用金额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 预算业务申请信息
	 */
	@ApiListField("biz_apply_info")
	@ApiField("cfbudmac_purchase_apply_info_d_t_o")
	private List<CfbudmacPurchaseApplyInfoDTO> bizApplyInfo;

	/**
	 * 活动预算编码
	 */
	@ApiField("biz_budget_id")
	private String bizBudgetId;

	/**
	 * 活动预算的名称，非用户名，不是敏感字段
	 */
	@ApiField("biz_budget_name")
	private String bizBudgetName;

	/**
	 * 币种，默认156
	 */
	@ApiField("currency")
	private String currency;

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public List<CfbudmacPurchaseApplyInfoDTO> getBizApplyInfo() {
		return this.bizApplyInfo;
	}
	public void setBizApplyInfo(List<CfbudmacPurchaseApplyInfoDTO> bizApplyInfo) {
		this.bizApplyInfo = bizApplyInfo;
	}

	public String getBizBudgetId() {
		return this.bizBudgetId;
	}
	public void setBizBudgetId(String bizBudgetId) {
		this.bizBudgetId = bizBudgetId;
	}

	public String getBizBudgetName() {
		return this.bizBudgetName;
	}
	public void setBizBudgetName(String bizBudgetName) {
		this.bizBudgetName = bizBudgetName;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
