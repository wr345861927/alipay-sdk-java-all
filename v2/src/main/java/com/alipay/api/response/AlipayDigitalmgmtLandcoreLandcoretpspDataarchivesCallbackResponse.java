package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.landcore.landcoretpsp.dataarchives.callback response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:24:26
 */
public class AlipayDigitalmgmtLandcoreLandcoretpspDataarchivesCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 3766859876618969874L;

	/** 
	 * 数据包唯一ID
	 */
	@ApiField("data_id")
	private String dataId;

	/** 
	 * 检测结果描述
	 */
	@ApiField("message_content")
	private String messageContent;

	/** 
	 * 状态码
	 */
	@ApiField("status")
	private String status;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId( ) {
		return this.dataId;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getMessageContent( ) {
		return this.messageContent;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
