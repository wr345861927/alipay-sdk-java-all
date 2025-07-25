package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.stall.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:35
 */
public class KoubeiCateringPosStallCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8236999632557633264L;

	/** 
	 * 档口id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
