package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userstate.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 21:18:48
 */
public class AlipayOpenIotvspUserstateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2464317498826676225L;

	/** 
	 * 返回用户是否在库（1：在库，2：不在库）
	 */
	@ApiField("state")
	private String state;

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
