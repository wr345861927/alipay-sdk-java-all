package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.downloadurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-04 10:59:20
 */
public class AlipayDataBillDownloadurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8674466357269955584L;

	/** 
	 * 账单下载地址链接，获取连接后30秒后未下载，链接地址失效。
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}
	public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

}
