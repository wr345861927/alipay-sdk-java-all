package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.info.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:25:14
 */
public class KoubeiItemExtitemInfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2838839696922221933L;

	/** 
	 * 创建成功，返回id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
