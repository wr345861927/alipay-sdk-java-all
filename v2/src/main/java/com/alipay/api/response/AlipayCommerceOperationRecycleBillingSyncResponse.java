package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.recycle.billing.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-02 11:15:32
 */
public class AlipayCommerceOperationRecycleBillingSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5295367258726373689L;

	/** 
	 * 是否传递成功
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
