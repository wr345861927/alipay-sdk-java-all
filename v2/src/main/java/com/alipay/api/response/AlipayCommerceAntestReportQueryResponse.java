package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 19:47:25
 */
public class AlipayCommerceAntestReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5546588984372647463L;

	/** 
	 * 测试报告页url
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
