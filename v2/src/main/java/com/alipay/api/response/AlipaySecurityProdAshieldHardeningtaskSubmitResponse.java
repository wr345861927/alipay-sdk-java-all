package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.HardeningTaskResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ashield.hardeningtask.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-10 14:01:38
 */
public class AlipaySecurityProdAshieldHardeningtaskSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7592657865544254874L;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 返回的具体对象
	 */
	@ApiField("res_data")
	private HardeningTaskResponse resData;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setResData(HardeningTaskResponse resData) {
		this.resData = resData;
	}
	public HardeningTaskResponse getResData( ) {
		return this.resData;
	}

}
