package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.frontcategory.security.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:15:55
 */
public class AntMerchantExpandFrontcategorySecurityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7257118297829554169L;

	/** 
	 * 前台类目ID
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}
	public String getFrontCategoryId( ) {
		return this.frontCategoryId;
	}

}
