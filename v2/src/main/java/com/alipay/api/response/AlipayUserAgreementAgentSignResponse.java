package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.agent.sign response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-10 16:22:43
 */
public class AlipayUserAgreementAgentSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3787778572624987888L;

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
