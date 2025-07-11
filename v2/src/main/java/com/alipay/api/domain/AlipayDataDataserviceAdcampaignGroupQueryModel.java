package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单元详情查询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:15:01
 */
public class AlipayDataDataserviceAdcampaignGroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3136868149562622881L;

	/**
	 * 单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 商家tag
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
