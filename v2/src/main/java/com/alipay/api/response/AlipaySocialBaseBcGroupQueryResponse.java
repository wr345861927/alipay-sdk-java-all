package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bc.group.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:24:24
 */
public class AlipaySocialBaseBcGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7871667947349783637L;

	/** 
	 * 支付宝群详情
	 */
	@ApiField("group_detail")
	private GroupDetail groupDetail;

	public void setGroupDetail(GroupDetail groupDetail) {
		this.groupDetail = groupDetail;
	}
	public GroupDetail getGroupDetail( ) {
		return this.groupDetail;
	}

}
