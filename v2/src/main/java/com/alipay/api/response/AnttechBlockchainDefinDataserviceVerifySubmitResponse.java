package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.verify.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:54:29
 */
public class AnttechBlockchainDefinDataserviceVerifySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3128288741566699796L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private String bizResult;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

}
