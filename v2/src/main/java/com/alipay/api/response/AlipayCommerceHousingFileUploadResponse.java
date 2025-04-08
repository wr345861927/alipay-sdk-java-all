package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-08 17:06:02
 */
public class AlipayCommerceHousingFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3215577812188376773L;

	/** 
	 * 附件id
	 */
	@ApiField("attachment_id")
	private String attachmentId;

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}
	public String getAttachmentId( ) {
		return this.attachmentId;
	}

}
