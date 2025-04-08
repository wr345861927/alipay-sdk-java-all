package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.approval.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-25 10:54:37
 */
public class AlipayCommerceEcApprovalModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6451219625583823899L;

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
