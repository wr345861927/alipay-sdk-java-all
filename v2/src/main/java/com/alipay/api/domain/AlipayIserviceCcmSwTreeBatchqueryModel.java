package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库-类目-批量查询
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:23:13
 */
public class AlipayIserviceCcmSwTreeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8175819415348741149L;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

}
