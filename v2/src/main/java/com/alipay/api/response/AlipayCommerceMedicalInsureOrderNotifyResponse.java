package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insure.order.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 15:32:34
 */
public class AlipayCommerceMedicalInsureOrderNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1223777627219181246L;

	/** 
	 * 通知描述
	 */
	@ApiField("notify_result")
	private String notifyResult;

	public void setNotifyResult(String notifyResult) {
		this.notifyResult = notifyResult;
	}
	public String getNotifyResult( ) {
		return this.notifyResult;
	}

}
