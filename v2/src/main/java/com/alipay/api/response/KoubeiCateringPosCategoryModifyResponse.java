package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.category.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 07:18:16
 */
public class KoubeiCateringPosCategoryModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3433649598295873864L;

	/** 
	 * 类别ID
	 */
	@ApiField("cate_id")
	private String cateId;

	public void setCateId(String cateId) {
		this.cateId = cateId;
	}
	public String getCateId( ) {
		return this.cateId;
	}

}
