package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.merchant.apply.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:11:42
 */
public class AlipayEbppInvoiceMerchantApplyUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3613894946432623613L;

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

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getInvoiceCode( ) {
		return this.invoiceCode;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceNo( ) {
		return this.invoiceNo;
	}

}
