package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.eco.nfc.bind response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-06 18:02:25
 */
public class AntMerchantExpandEcoNfcBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8226979472975288361L;

	/** 
	 * 绑定失败的具体原因
	 */
	@ApiField("bind_fail_reason")
	private String bindFailReason;

	/** 
	 * 绑定结果
	 */
	@ApiField("bind_success")
	private Boolean bindSuccess;

	public void setBindFailReason(String bindFailReason) {
		this.bindFailReason = bindFailReason;
	}
	public String getBindFailReason( ) {
		return this.bindFailReason;
	}

	public void setBindSuccess(Boolean bindSuccess) {
		this.bindSuccess = bindSuccess;
	}
	public Boolean getBindSuccess( ) {
		return this.bindSuccess;
	}

}
