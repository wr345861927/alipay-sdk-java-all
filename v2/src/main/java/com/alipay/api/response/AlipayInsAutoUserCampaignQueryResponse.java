package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.campaign.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayInsAutoUserCampaignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3536292943164519552L;

	/** 
	 * 用户参与状态。
未参与：WITHOUT_REGISTER
参与：REGISTER
	 */
	@ApiField("register_status")
	private String registerStatus;

	public void setRegisterStatus(String registerStatus) {
		this.registerStatus = registerStatus;
	}
	public String getRegisterStatus( ) {
		return this.registerStatus;
	}

}
