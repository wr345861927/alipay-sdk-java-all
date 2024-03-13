package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.content.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-12 06:51:33
 */
public class AlipayOpenPublicMessageContentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1868979135549587786L;

	/** 
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 内容详情内链url
	 */
	@ApiField("content_url")
	private String contentUrl;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	public String getContentUrl( ) {
		return this.contentUrl;
	}

}
