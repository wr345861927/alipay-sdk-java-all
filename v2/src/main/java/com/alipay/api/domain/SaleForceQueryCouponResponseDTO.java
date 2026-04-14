package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果对象
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:25:24
 */
public class SaleForceQueryCouponResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 1488363536753995219L;

	/**
	 * 审批状态
	 */
	@ApiField("approval_status")
	private String approvalStatus;

	/**
	 * 券申请id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 券申请id
	 */
	@ApiField("process_url")
	private String processUrl;

	public String getApprovalStatus() {
		return this.approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getProcessUrl() {
		return this.processUrl;
	}
	public void setProcessUrl(String processUrl) {
		this.processUrl = processUrl;
	}

}
