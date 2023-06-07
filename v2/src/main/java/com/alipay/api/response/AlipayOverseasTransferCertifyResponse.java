package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.certify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:12:04
 */
public class AlipayOverseasTransferCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2137752833338364851L;

	/** 
	 * 是否有默认卡
	 */
	@ApiField("has_default_card")
	private String hasDefaultCard;

	/** 
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/** 
	 * 用于透传主站错误码描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setHasDefaultCard(String hasDefaultCard) {
		this.hasDefaultCard = hasDefaultCard;
	}
	public String getHasDefaultCard( ) {
		return this.hasDefaultCard;
	}

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
