package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.point.receive.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:52:15
 */
public class AlipayInsAutoPointReceiveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4223851458282116892L;

	/** 
	 * 本次可攒积分。
例如，攒油活动，返回本次可攒油量，单位ml
	 */
	@ApiField("save_amount")
	private Long saveAmount;

	public void setSaveAmount(Long saveAmount) {
		this.saveAmount = saveAmount;
	}
	public Long getSaveAmount( ) {
		return this.saveAmount;
	}

}
