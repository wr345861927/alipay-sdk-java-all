package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CrowdSelectTagOpen;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qipan.crowdtag.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:36:44
 */
public class AlipayMarketingQipanCrowdtagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3768515189356913332L;

	/** 
	 * 棋盘开放圈选查询标签值返回
	 */
	@ApiListField("select_tag_list")
	@ApiField("crowd_select_tag_open")
	private List<CrowdSelectTagOpen> selectTagList;

	public void setSelectTagList(List<CrowdSelectTagOpen> selectTagList) {
		this.selectTagList = selectTagList;
	}
	public List<CrowdSelectTagOpen> getSelectTagList( ) {
		return this.selectTagList;
	}

}
