package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.user.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 17:37:44
 */
public class AlipayCommerceMedicalUserInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7465564612946468715L;

	/** 
	 * 结果数据
	 */
	@ApiField("user_query_info")
	private UserQueryInfo userQueryInfo;

	public void setUserQueryInfo(UserQueryInfo userQueryInfo) {
		this.userQueryInfo = userQueryInfo;
	}
	public UserQueryInfo getUserQueryInfo( ) {
		return this.userQueryInfo;
	}

}
