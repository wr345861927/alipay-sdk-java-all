package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.icontrol.serviceorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 17:38:14
 */
public class AlipayIserviceIcontrolServiceorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4434988299446258253L;

	/** 
	 * 经度
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
