package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-12 17:24:17
 */
public class AlipayCommerceKidsAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6855821979712298365L;

	/** 
	 * 儿童唯一id
	 */
	@ApiField("child_id")
	private String childId;

	public void setChildId(String childId) {
		this.childId = childId;
	}
	public String getChildId( ) {
		return this.childId;
	}

}
