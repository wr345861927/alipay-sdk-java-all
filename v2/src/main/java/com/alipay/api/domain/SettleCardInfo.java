package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算卡信息
 *
 * @author auto create
 * @since 1.0, 2025-07-08 19:12:24
 */
public class SettleCardInfo extends AlipayObject {

	private static final long serialVersionUID = 3121918983944873389L;

	/**
	 * 开户支行名
	 */
	@ApiField("account_branch_name")
	private String accountBranchName;

	/**
	 * 卡户名
	 */
	@ApiField("account_holder_name")
	private String accountHolderName;

	/**
	 * 开户行所在地-市
	 */
	@ApiField("account_inst_city")
	private String accountInstCity;

	/**
	 * 开户行简称缩写
	 */
	@ApiField("account_inst_id")
	private String accountInstId;

	/**
	 * 银行名称
	 */
	@ApiField("account_inst_name")
	private String accountInstName;

	/**
	 * 开户行所在地-省
	 */
	@ApiField("account_inst_province")
	private String accountInstProvince;

	/**
	 * 银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 卡类型
借记卡-DC
信用卡-CC
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 账号使用类型
对公-01
对私-02
	 */
	@ApiField("usage_type")
	private String usageType;

	public String getAccountBranchName() {
		return this.accountBranchName;
	}
	public void setAccountBranchName(String accountBranchName) {
		this.accountBranchName = accountBranchName;
	}

	public String getAccountHolderName() {
		return this.accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountInstCity() {
		return this.accountInstCity;
	}
	public void setAccountInstCity(String accountInstCity) {
		this.accountInstCity = accountInstCity;
	}

	public String getAccountInstId() {
		return this.accountInstId;
	}
	public void setAccountInstId(String accountInstId) {
		this.accountInstId = accountInstId;
	}

	public String getAccountInstName() {
		return this.accountInstName;
	}
	public void setAccountInstName(String accountInstName) {
		this.accountInstName = accountInstName;
	}

	public String getAccountInstProvince() {
		return this.accountInstProvince;
	}
	public void setAccountInstProvince(String accountInstProvince) {
		this.accountInstProvince = accountInstProvince;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getUsageType() {
		return this.usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

}
