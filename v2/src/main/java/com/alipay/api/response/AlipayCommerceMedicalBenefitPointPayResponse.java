package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.benefit.point.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-23 15:47:49
 */
public class AlipayCommerceMedicalBenefitPointPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5757431414937941619L;

	/** 
	 * 处理码
	 */
	@ApiField("res_code")
	private String resCode;

	/** 
	 * 业务处理标识
	 */
	@ApiField("res_flag")
	private Boolean resFlag;

	/** 
	 * 业务处理描述
	 */
	@ApiField("res_msg")
	private String resMsg;

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResCode( ) {
		return this.resCode;
	}

	public void setResFlag(Boolean resFlag) {
		this.resFlag = resFlag;
	}
	public Boolean getResFlag( ) {
		return this.resFlag;
	}

	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	public String getResMsg( ) {
		return this.resMsg;
	}

}
