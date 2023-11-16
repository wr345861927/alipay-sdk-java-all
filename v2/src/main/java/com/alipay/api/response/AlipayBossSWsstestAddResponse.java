package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.s.wsstest.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-11 20:11:46
 */
public class AlipayBossSWsstestAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6866552579716428355L;

	/** 
	 * 1
	 */
	@ApiField("ss")
	private String ss;

	public void setSs(String ss) {
		this.ss = ss;
	}
	public String getSs( ) {
		return this.ss;
	}

}
