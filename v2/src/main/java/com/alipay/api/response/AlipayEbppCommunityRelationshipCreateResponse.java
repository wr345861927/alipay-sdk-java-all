package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.relationship.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:27:34
 */
public class AlipayEbppCommunityRelationshipCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4659798349558285647L;

	/** 
	 * 物业和小区的绑定实体ID
	 */
	@ApiField("relationship_id")
	private String relationshipId;

	public void setRelationshipId(String relationshipId) {
		this.relationshipId = relationshipId;
	}
	public String getRelationshipId( ) {
		return this.relationshipId;
	}

}
