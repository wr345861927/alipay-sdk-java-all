package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-01 19:52:25
 */
public class SellerSyncRentFinancingExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8642369781825164447L;

	/**
	 * 需要融资的金额，币种：人民币
	 */
	@ApiField("financing_amount")
	private String financingAmount;

	/**
	 * 融资期数
	 */
	@ApiField("financing_period")
	private RentPeriod financingPeriod;

	/**
	 * 融资的利率(年化利率)，例如年化利率0.2%，字段值设置时为：0.2
	 */
	@ApiField("financing_rate")
	private String financingRate;

	/**
	 * 融资人的ID，取值：为支付宝的PID
	 */
	@ApiField("fundraiser_id")
	private String fundraiserId;

	/**
	 * 融资人的名称，一般为融资公司的名称
	 */
	@ApiField("fundraiser_name")
	private String fundraiserName;

	/**
	 * 融资人的OpenId，取值参考：openApi开发网关接入文档
	 */
	@ApiField("fundraiser_open_id")
	private String fundraiserOpenId;

	/**
	 * 资方的支付宝PID，取值：请联系资方获取
	 */
	@ApiField("invest_id")
	private String investId;

	/**
	 * 资方的支付宝PID，取值：请联系资方获取
	 */
	@ApiField("invest_open_id")
	private String investOpenId;

	/**
	 * 融资人收款账户，取值：企业支付宝的账号PID
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 融资人收款账户openId，取值参考：openApi开发网关接入文档
	 */
	@ApiField("payee_account_open_id")
	private String payeeAccountOpenId;

	/**
	 * 收款备注说明，示例：融资放款
	 */
	@ApiField("payee_memo")
	private String payeeMemo;

	/**
	 * 还款的方式，例如：等额本息/等额本差
	 */
	@ApiField("repayment_type")
	private String repaymentType;

	public String getFinancingAmount() {
		return this.financingAmount;
	}
	public void setFinancingAmount(String financingAmount) {
		this.financingAmount = financingAmount;
	}

	public RentPeriod getFinancingPeriod() {
		return this.financingPeriod;
	}
	public void setFinancingPeriod(RentPeriod financingPeriod) {
		this.financingPeriod = financingPeriod;
	}

	public String getFinancingRate() {
		return this.financingRate;
	}
	public void setFinancingRate(String financingRate) {
		this.financingRate = financingRate;
	}

	public String getFundraiserId() {
		return this.fundraiserId;
	}
	public void setFundraiserId(String fundraiserId) {
		this.fundraiserId = fundraiserId;
	}

	public String getFundraiserName() {
		return this.fundraiserName;
	}
	public void setFundraiserName(String fundraiserName) {
		this.fundraiserName = fundraiserName;
	}

	public String getFundraiserOpenId() {
		return this.fundraiserOpenId;
	}
	public void setFundraiserOpenId(String fundraiserOpenId) {
		this.fundraiserOpenId = fundraiserOpenId;
	}

	public String getInvestId() {
		return this.investId;
	}
	public void setInvestId(String investId) {
		this.investId = investId;
	}

	public String getInvestOpenId() {
		return this.investOpenId;
	}
	public void setInvestOpenId(String investOpenId) {
		this.investOpenId = investOpenId;
	}

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayeeAccountOpenId() {
		return this.payeeAccountOpenId;
	}
	public void setPayeeAccountOpenId(String payeeAccountOpenId) {
		this.payeeAccountOpenId = payeeAccountOpenId;
	}

	public String getPayeeMemo() {
		return this.payeeMemo;
	}
	public void setPayeeMemo(String payeeMemo) {
		this.payeeMemo = payeeMemo;
	}

	public String getRepaymentType() {
		return this.repaymentType;
	}
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}

}
