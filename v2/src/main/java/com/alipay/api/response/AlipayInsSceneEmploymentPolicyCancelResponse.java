package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.policy.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:50:07
 */
public class AlipayInsSceneEmploymentPolicyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8865587375113421274L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
