package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ServiceEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adentitylibrary.serviceentity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-15 12:02:36
 */
public class AlipayDataDataserviceAdentitylibraryServiceentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3543945986273415197L;

	/** 
	 * 实体详情返回结果
	 */
	@ApiField("result")
	private ServiceEntity result;

	public void setResult(ServiceEntity result) {
		this.result = result;
	}
	public ServiceEntity getResult( ) {
		return this.result;
	}

}
