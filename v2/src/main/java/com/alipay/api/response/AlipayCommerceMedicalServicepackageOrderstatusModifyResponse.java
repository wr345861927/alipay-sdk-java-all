package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.servicepackage.orderstatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-20 16:57:45
 */
public class AlipayCommerceMedicalServicepackageOrderstatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3474416746751588447L;

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
