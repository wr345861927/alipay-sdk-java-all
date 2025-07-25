package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.schemasdktype.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 15:57:19
 */
public class AlipayDataDataexchangeSchemasdktypeRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6174672913626288124L;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
