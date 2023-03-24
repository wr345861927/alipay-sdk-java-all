package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.subservicekeyword.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 22:01:44
 */
public class AlipayOpenSearchSubservicekeywordApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1392849874924875251L;

	/** 
	 * 审核工单id，唯一，提报服务关键词，提报服务关键词返回该id
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
