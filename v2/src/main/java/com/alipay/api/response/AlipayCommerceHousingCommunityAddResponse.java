package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.community.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 15:12:27
 */
public class AlipayCommerceHousingCommunityAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3695999493791384617L;

	/** 
	 * 小区id
	 */
	@ApiField("community_id")
	private String communityId;

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	public String getCommunityId( ) {
		return this.communityId;
	}

}
