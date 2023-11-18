package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.info.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:28:37
 */
public class KoubeiItemExtitemInfoDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4414337374418267692L;

	/** 
	 * 删除成功，返回主键id
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
