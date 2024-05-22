package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.eco.attachment.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-22 11:27:02
 */
public class AntMerchantExpandEcoAttachmentUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5592797297222959836L;

	/** 
	 * 文件上传成功返回的osskey
	 */
	@ApiField("oss_key")
	private String ossKey;

	public void setOssKey(String ossKey) {
		this.ossKey = ossKey;
	}
	public String getOssKey( ) {
		return this.ossKey;
	}

}
