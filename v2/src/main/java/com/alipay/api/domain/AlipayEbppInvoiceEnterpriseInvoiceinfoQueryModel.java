package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业发票查询
 *
 * @author auto create
 * @since 1.0, 2025-07-15 19:37:50
 */
public class AlipayEbppInvoiceEnterpriseInvoiceinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7515555291711573411L;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

}
