package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcoAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.applist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:18:36
 */
public class AlipayCommerceAntestApplistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3278783319443439542L;

	/** 
	 * 小程序列表
	 */
	@ApiListField("data")
	@ApiField("eco_app_info")
	private List<EcoAppInfo> data;

	public void setData(List<EcoAppInfo> data) {
		this.data = data;
	}
	public List<EcoAppInfo> getData( ) {
		return this.data;
	}

}
