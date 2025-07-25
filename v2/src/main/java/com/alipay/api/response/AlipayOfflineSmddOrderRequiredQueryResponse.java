package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RequireBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.order.required.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:32
 */
public class AlipayOfflineSmddOrderRequiredQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6883462423941532816L;

	/** 
	 * 必填信息
	 */
	@ApiListField("require_info_list")
	@ApiField("require_bean")
	private List<RequireBean> requireInfoList;

	public void setRequireInfoList(List<RequireBean> requireInfoList) {
		this.requireInfoList = requireInfoList;
	}
	public List<RequireBean> getRequireInfoList( ) {
		return this.requireInfoList;
	}

}
