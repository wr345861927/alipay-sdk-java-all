package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isportal.logincontext.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-08 16:35:17
 */
public class AlipayIserviceIsportalLogincontextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1489886932978544624L;

	/** 
	 * 登录信息
	 */
	@ApiField("biz_data")
	private String bizData;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}
	public String getBizData( ) {
		return this.bizData;
	}

}
