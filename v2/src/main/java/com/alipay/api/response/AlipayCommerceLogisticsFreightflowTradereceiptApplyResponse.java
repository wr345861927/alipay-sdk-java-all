package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.tradereceipt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 19:17:31
 */
public class AlipayCommerceLogisticsFreightflowTradereceiptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7163265537986134263L;

	/** 
	 * Base64加密
5分钟有效期，过期需换单重新申请。
	 */
	@ApiField("pdf_download_url")
	private String pdfDownloadUrl;

	public void setPdfDownloadUrl(String pdfDownloadUrl) {
		this.pdfDownloadUrl = pdfDownloadUrl;
	}
	public String getPdfDownloadUrl( ) {
		return this.pdfDownloadUrl;
	}

}
