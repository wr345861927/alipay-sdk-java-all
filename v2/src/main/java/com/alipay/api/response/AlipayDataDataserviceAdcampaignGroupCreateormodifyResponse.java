package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.group.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 11:42:50
 */
public class AlipayDataDataserviceAdcampaignGroupCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7752773692537917144L;

	/** 
	 * 单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/** 
	 * 单元名称
	 */
	@ApiField("group_name")
	private String groupName;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getGroupId( ) {
		return this.groupId;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}

}
