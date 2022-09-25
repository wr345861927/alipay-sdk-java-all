package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 21:00:30
 */
public class AlipayOpenPublicInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7412116648578694965L;

	/** 
	 * 服务窗审核状态描述
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 服务窗审核状态，申请成功后返回AUDITING，等待风控审核
	 */
	@ApiField("audit_status")
	private String auditStatus;

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

}
