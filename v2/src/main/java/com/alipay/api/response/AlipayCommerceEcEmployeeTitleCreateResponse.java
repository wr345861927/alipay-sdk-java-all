package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EcEmployeeTitleFailed;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.title.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-01 17:17:29
 */
public class AlipayCommerceEcEmployeeTitleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4418546328614112713L;

	/** 
	 * 抬头失败信息，用来返回批量处理的每一个抬头错误信息
	 */
	@ApiField("title_failed_list")
	private EcEmployeeTitleFailed titleFailedList;

	public void setTitleFailedList(EcEmployeeTitleFailed titleFailedList) {
		this.titleFailedList = titleFailedList;
	}
	public EcEmployeeTitleFailed getTitleFailedList( ) {
		return this.titleFailedList;
	}

}
