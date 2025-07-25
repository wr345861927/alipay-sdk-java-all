package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiAuthAmountInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.antauthorize.multi.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-08 15:31:03
 */
public class AlipayBossBaseAntauthorizeMultiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3574858119497678312L;

	/** 
	 * 返回的具体授权信息
	 */
	@ApiField("auth_amount_info")
	private OpenApiAuthAmountInfoDTO authAmountInfo;

	public void setAuthAmountInfo(OpenApiAuthAmountInfoDTO authAmountInfo) {
		this.authAmountInfo = authAmountInfo;
	}
	public OpenApiAuthAmountInfoDTO getAuthAmountInfo( ) {
		return this.authAmountInfo;
	}

}
