package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.invoice.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-03 10:22:28
 */
public class AlipayCommerceEcEmployeeInvoiceVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5167555793158315639L;

	/** 
	 * 防伪码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

	/** 
	 * 复核人
	 */
	@ApiField("checker")
	private String checker;

	/** 
	 * 员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/** 
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 发票下载地址
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/** 
	 * 文件类型：
jpg:发票图片;pdf:发票PDF文件;
	 */
	@ApiField("file_type")
	private String fileType;

	/** 
	 * 发票查验结果:
INVOICE_CORRECT:发票正确;INVOICE_MISTAKE:发票信息错误;INVOICE_HAS_RED_INVOICE:发票存在红冲;INVOICE_CANCELLED:发票已作废
	 */
	@ApiField("invoice_check_result")
	private String invoiceCheckResult;

	/** 
	 * 发票查验时间
	 */
	@ApiField("invoice_check_time")
	private String invoiceCheckTime;

	/** 
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/** 
	 * 开票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/** 
	 * 发票种类:
E_SPECIALTY:增值税电子专用发票;
E_PLAN:增值税电子普通发票;ALL_ELECTRONIC_SPECIAL:电子发票(增值税专用发票);ALL_ELECTRONIC_GENERAL:电子发票(普通发票);SPECIAL:增值税专用发票;PLAIN_INVOICE:增值税普通发票
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/** 
	 * 备注
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/** 
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/** 
	 * 发票类型 值有两种情况：blue－蓝票 red－红票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/** 
	 * 开票人
	 */
	@ApiField("operator")
	private String operator;

	/** 
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/** 
	 * 销方地址
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/** 
	 * 销方银行账号
	 */
	@ApiField("payee_bank_account")
	private String payeeBankAccount;

	/** 
	 * 销方开户行
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/** 
	 * 销方电话
	 */
	@ApiField("payee_mobile")
	private String payeeMobile;

	/** 
	 * 销方抬头
	 */
	@ApiField("payee_name")
	private String payeeName;

	/** 
	 * 销方税号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/** 
	 * 购方地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/** 
	 * 购方银行账号
	 */
	@ApiField("payer_bank_account")
	private String payerBankAccount;

	/** 
	 * 购方开户行
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/** 
	 * 购方电话
	 */
	@ApiField("payer_mobile")
	private String payerMobile;

	/** 
	 * 购方抬头
	 */
	@ApiField("payer_name")
	private String payerName;

	/** 
	 * 购方税号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/** 
	 * 发票金额，单位元
	 */
	@ApiField("sum_amount")
	private String sumAmount;

	/** 
	 * 税额，单位元
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/** 
	 * 不含税金额，单位元
	 */
	@ApiField("without_tax_amount")
	private String withoutTaxAmount;

	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
	}
	public String getAntiFakeCode( ) {
		return this.antiFakeCode;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}
	public String getChecker( ) {
		return this.checker;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeId( ) {
		return this.employeeId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}
	public String getFileDownloadUrl( ) {
		return this.fileDownloadUrl;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType( ) {
		return this.fileType;
	}

	public void setInvoiceCheckResult(String invoiceCheckResult) {
		this.invoiceCheckResult = invoiceCheckResult;
	}
	public String getInvoiceCheckResult( ) {
		return this.invoiceCheckResult;
	}

	public void setInvoiceCheckTime(String invoiceCheckTime) {
		this.invoiceCheckTime = invoiceCheckTime;
	}
	public String getInvoiceCheckTime( ) {
		return this.invoiceCheckTime;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getInvoiceCode( ) {
		return this.invoiceCode;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceDate( ) {
		return this.invoiceDate;
	}

	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}
	public String getInvoiceKind( ) {
		return this.invoiceKind;
	}

	public void setInvoiceMemo(String invoiceMemo) {
		this.invoiceMemo = invoiceMemo;
	}
	public String getInvoiceMemo( ) {
		return this.invoiceMemo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceNo( ) {
		return this.invoiceNo;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getInvoiceType( ) {
		return this.invoiceType;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator( ) {
		return this.operator;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getPayee( ) {
		return this.payee;
	}

	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}
	public String getPayeeAddress( ) {
		return this.payeeAddress;
	}

	public void setPayeeBankAccount(String payeeBankAccount) {
		this.payeeBankAccount = payeeBankAccount;
	}
	public String getPayeeBankAccount( ) {
		return this.payeeBankAccount;
	}

	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}
	public String getPayeeBankName( ) {
		return this.payeeBankName;
	}

	public void setPayeeMobile(String payeeMobile) {
		this.payeeMobile = payeeMobile;
	}
	public String getPayeeMobile( ) {
		return this.payeeMobile;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getPayeeName( ) {
		return this.payeeName;
	}

	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}
	public String getPayeeRegisterNo( ) {
		return this.payeeRegisterNo;
	}

	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}
	public String getPayerAddress( ) {
		return this.payerAddress;
	}

	public void setPayerBankAccount(String payerBankAccount) {
		this.payerBankAccount = payerBankAccount;
	}
	public String getPayerBankAccount( ) {
		return this.payerBankAccount;
	}

	public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}
	public String getPayerBankName( ) {
		return this.payerBankName;
	}

	public void setPayerMobile(String payerMobile) {
		this.payerMobile = payerMobile;
	}
	public String getPayerMobile( ) {
		return this.payerMobile;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getPayerName( ) {
		return this.payerName;
	}

	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}
	public String getPayerRegisterNo( ) {
		return this.payerRegisterNo;
	}

	public void setSumAmount(String sumAmount) {
		this.sumAmount = sumAmount;
	}
	public String getSumAmount( ) {
		return this.sumAmount;
	}

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getTaxAmount( ) {
		return this.taxAmount;
	}

	public void setWithoutTaxAmount(String withoutTaxAmount) {
		this.withoutTaxAmount = withoutTaxAmount;
	}
	public String getWithoutTaxAmount( ) {
		return this.withoutTaxAmount;
	}

}
