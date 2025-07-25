package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecordDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.enterprise.reimburse.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-28 14:52:39
 */
public class AlipayPcreditHuabeiEnterpriseReimburseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4331326797926728967L;

	/** 
	 * 导出数据详情列表
	 */
	@ApiListField("record_detail_list")
	@ApiField("record_detail")
	private List<RecordDetail> recordDetailList;

	public void setRecordDetailList(List<RecordDetail> recordDetailList) {
		this.recordDetailList = recordDetailList;
	}
	public List<RecordDetail> getRecordDetailList( ) {
		return this.recordDetailList;
	}

}
