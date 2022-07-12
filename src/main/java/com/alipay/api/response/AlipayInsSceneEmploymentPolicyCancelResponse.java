package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.policy.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-24 13:46:44
 */
public class AlipayInsSceneEmploymentPolicyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8382214679772857566L;

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