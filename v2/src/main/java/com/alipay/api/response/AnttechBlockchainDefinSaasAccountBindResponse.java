package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ReferenceId;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.account.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-22 14:48:28
 */
public class AnttechBlockchainDefinSaasAccountBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8138177124965521211L;

	/** 
	 * 操作结果 SUCCESS(成功);FAIL(失败);
	 */
	@ApiField("op_status")
	private String opStatus;

	/** 
	 * 外部业务平台会员ID
	 */
	@ApiField("out_member_id")
	private ReferenceId outMemberId;

	/** 
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public void setOpStatus(String opStatus) {
		this.opStatus = opStatus;
	}
	public String getOpStatus( ) {
		return this.opStatus;
	}

	public void setOutMemberId(ReferenceId outMemberId) {
		this.outMemberId = outMemberId;
	}
	public ReferenceId getOutMemberId( ) {
		return this.outMemberId;
	}

	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}
	public String getPlatformMemberId( ) {
		return this.platformMemberId;
	}

}
