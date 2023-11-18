package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.isv.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-09 15:31:46
 */
public class AlipayOpenMiniIsvCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1754414351671558766L;

	/** 
	 * 小程序代创建订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
