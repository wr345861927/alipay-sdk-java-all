package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-26 12:47:13
 */
public class AlipayCommerceMedicalCommercialUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7329767544817576127L;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
