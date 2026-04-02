package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子回单信息
 *
 * @author auto create
 * @since 1.0, 2026-03-26 16:21:38
 */
public class OrderElectronicReceipt extends AlipayObject {

	private static final long serialVersionUID = 7796626145493727721L;

	/**
	 * 下载链接。status为SUCCESS时返回。用户可以使用此http链接下载文件内容。有效时间20s。 生成的文件是zip格式。需要解压后获取电子回单pdf内容
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 如果生成失败，则会返回失败原因
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 处理状态 INIT - 初始化 PROCESS - 处理中 SUCCESS - 成功 FAIL - 失败
	 */
	@ApiField("status")
	private String status;

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
