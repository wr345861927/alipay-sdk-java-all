package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antcommonweal.donate.consume.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:17:01
 */
public class AlipaySocialAntcommonwealDonateConsumeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2187953969236654124L;

	/** 
	 * 错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 成功/失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
