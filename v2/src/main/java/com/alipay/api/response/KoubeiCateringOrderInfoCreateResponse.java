package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:24
 */
public class KoubeiCateringOrderInfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5166567792745818734L;

	/** 
	 * 口碑的订单号（唯一主键），和pos本地订单号一一对应
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 是否需要重试，true-需要重试，false-不需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
