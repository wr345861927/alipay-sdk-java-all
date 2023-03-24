package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupBrief;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bc.clustergroup.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 20:13:09
 */
public class AlipaySocialBaseBcClustergroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7283681287157585984L;

	/** 
	 * 社交聊天群的概要信息
	 */
	@ApiListField("group_briefs")
	@ApiField("group_brief")
	private List<GroupBrief> groupBriefs;

	public void setGroupBriefs(List<GroupBrief> groupBriefs) {
		this.groupBriefs = groupBriefs;
	}
	public List<GroupBrief> getGroupBriefs( ) {
		return this.groupBriefs;
	}

}
