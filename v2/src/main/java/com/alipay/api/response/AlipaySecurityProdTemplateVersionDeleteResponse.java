package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:55:06
 */
public class AlipaySecurityProdTemplateVersionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7539875392973536518L;

	/** 
	 * 删除结果
	 */
	@ApiField("delete_result")
	private Boolean deleteResult;

	public void setDeleteResult(Boolean deleteResult) {
		this.deleteResult = deleteResult;
	}
	public Boolean getDeleteResult( ) {
		return this.deleteResult;
	}

}
