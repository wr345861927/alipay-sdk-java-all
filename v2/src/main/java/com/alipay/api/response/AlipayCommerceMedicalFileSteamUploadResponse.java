package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.file.steam.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 17:37:44
 */
public class AlipayCommerceMedicalFileSteamUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4887827236426866989L;

	/** 
	 * 文件访问url
	 */
	@ApiField("file_url")
	private String fileUrl;

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

}
