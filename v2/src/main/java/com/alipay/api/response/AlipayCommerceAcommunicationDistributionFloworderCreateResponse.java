package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.floworder.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-15 17:02:35
 */
public class AlipayCommerceAcommunicationDistributionFloworderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1187866566841126983L;

	/** 
	 * 支付宝订单id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/** 
	 * 机构订单id
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}
	public String getAlipayOrderId( ) {
		return this.alipayOrderId;
	}

	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}
	public String getInstOrderId( ) {
		return this.instOrderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
