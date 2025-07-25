package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupMsgAutoreplyRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.autoreply.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:26
 */
public class AlipayMerchantGroupAutoreplyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6513972918943886994L;

	/** 
	 * null
	 */
	@ApiListField("group_msg_autoreply_list")
	@ApiField("group_msg_autoreply_record_v_o")
	private List<GroupMsgAutoreplyRecordVO> groupMsgAutoreplyList;

	/** 
	 * 当前第几页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页展示条数，最大展示50条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 自动回复记录总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setGroupMsgAutoreplyList(List<GroupMsgAutoreplyRecordVO> groupMsgAutoreplyList) {
		this.groupMsgAutoreplyList = groupMsgAutoreplyList;
	}
	public List<GroupMsgAutoreplyRecordVO> getGroupMsgAutoreplyList( ) {
		return this.groupMsgAutoreplyList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
