package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.industry.service.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:02:51
 */
public class AlipayCommerceIndustryServiceSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1214499474875191453L;

	/** 
	 * 成功请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 服务编码 需通过审核后才可使用
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
