package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.approval.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-17 13:57:35
 */
public class AlipayCommerceEcApprovalCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8852316163295514555L;

	/** 
	 * 外部平台审批单id
	 */
	@ApiField("platform_approval_id")
	private String platformApprovalId;

	public void setPlatformApprovalId(String platformApprovalId) {
		this.platformApprovalId = platformApprovalId;
	}
	public String getPlatformApprovalId( ) {
		return this.platformApprovalId;
	}

}
