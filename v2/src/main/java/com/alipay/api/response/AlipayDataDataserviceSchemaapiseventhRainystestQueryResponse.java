package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapiseventh.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-16 09:47:29
 */
public class AlipayDataDataserviceSchemaapiseventhRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7188934793186332735L;

	/** 
	 * id
	 */
	@ApiField("user_id")
	private String userId;

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
