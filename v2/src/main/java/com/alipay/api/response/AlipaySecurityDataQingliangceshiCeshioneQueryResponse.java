package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.qingliangceshi.ceshione.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-14 14:27:33
 */
public class AlipaySecurityDataQingliangceshiCeshioneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8394274939922594355L;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
