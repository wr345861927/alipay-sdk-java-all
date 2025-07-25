package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.qingliangceshi.ceshiceshiceshi.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-21 11:42:32
 */
public class AlipaySecurityDataQingliangceshiCeshiceshiceshiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8724689165947463761L;

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
