package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupScheduleMsgVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.schedulemsg.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-30 17:32:26
 */
public class AlipayMerchantGroupSchedulemsgBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4717458145792262224L;

	/** 
	 * null
	 */
	@ApiListField("msg_record_list")
	@ApiField("group_schedule_msg_v_o")
	private List<GroupScheduleMsgVO> msgRecordList;

	/** 
	 * 当前页码

	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页展示记录条数

	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 商家群群发消息记录总条数

	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMsgRecordList(List<GroupScheduleMsgVO> msgRecordList) {
		this.msgRecordList = msgRecordList;
	}
	public List<GroupScheduleMsgVO> getMsgRecordList( ) {
		return this.msgRecordList;
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
