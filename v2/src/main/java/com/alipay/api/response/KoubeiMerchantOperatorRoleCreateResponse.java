package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.role.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:04
 */
public class KoubeiMerchantOperatorRoleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4549761137831978789L;

	/** 
	 * 新增返回角色roleId,修改则返回修改的roleId.
	 */
	@ApiField("role_id")
	private String roleId;

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleId( ) {
		return this.roleId;
	}

}
