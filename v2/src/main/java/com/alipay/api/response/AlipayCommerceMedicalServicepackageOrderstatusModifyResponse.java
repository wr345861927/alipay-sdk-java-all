package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.servicepackage.orderstatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 17:37:44
 */
public class AlipayCommerceMedicalServicepackageOrderstatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7319296824596936733L;

	/** 
	 * 结果数据
	 */
	@ApiField("operate_res")
	private String operateRes;

	public void setOperateRes(String operateRes) {
		this.operateRes = operateRes;
	}
	public String getOperateRes( ) {
		return this.operateRes;
	}

}
