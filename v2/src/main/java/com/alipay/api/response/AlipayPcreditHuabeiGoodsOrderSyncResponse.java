package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.goods.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:05:45
 */
public class AlipayPcreditHuabeiGoodsOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7699838794487594456L;

	/** 
	 * 业务结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
