package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务对象批量查询
 *
 * @author auto create
 * @since 1.0, 2026-02-12 13:00:18
 */
public class RobbyOpenObjectInfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2236289285228641264L;

	/**
	 * 业务编号，如订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * null
	 */
	@ApiListField("biz_object_no_list")
	@ApiField("string")
	private List<String> bizObjectNoList;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public List<String> getBizObjectNoList() {
		return this.bizObjectNoList;
	}
	public void setBizObjectNoList(List<String> bizObjectNoList) {
		this.bizObjectNoList = bizObjectNoList;
	}

}
