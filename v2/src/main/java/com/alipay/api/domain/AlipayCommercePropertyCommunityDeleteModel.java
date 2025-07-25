package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 项目删除接口
 *
 * @author auto create
 * @since 1.0, 2025-06-19 20:02:28
 */
public class AlipayCommercePropertyCommunityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7555315728268683212L;

	/**
	 * 项目ID
	 */
	@ApiField("community_id")
	private String communityId;

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

}
