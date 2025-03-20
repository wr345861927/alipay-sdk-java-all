package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署状态查询
 *
 * @author auto create
 * @since 1.0, 2025-03-07 10:19:46
 */
public class AlipayCommerceRentEnterpriseSealQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 8371932395535845827L;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 签署合同id
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getSignFlowId() {
		return this.signFlowId;
	}
	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}

}
