package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenCrowdOperationTag;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qipan.tagbase.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-04 15:22:03
 */
public class AlipayMarketingQipanTagbaseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3298958246412579916L;

	/** 
	 * 返回全部可用的圈选标签基本信息。
	 */
	@ApiListField("operation_tag_list")
	@ApiField("open_crowd_operation_tag")
	private List<OpenCrowdOperationTag> operationTagList;

	public void setOperationTagList(List<OpenCrowdOperationTag> operationTagList) {
		this.operationTagList = operationTagList;
	}
	public List<OpenCrowdOperationTag> getOperationTagList( ) {
		return this.operationTagList;
	}

}
