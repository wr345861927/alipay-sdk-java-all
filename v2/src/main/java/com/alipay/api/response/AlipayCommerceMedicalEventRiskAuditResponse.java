package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.event.risk.audit response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-27 17:17:44
 */
public class AlipayCommerceMedicalEventRiskAuditResponse extends AlipayResponse {

	private static final long serialVersionUID = 6256599849717962214L;

	/** 
	 * 事件id
	 */
	@ApiField("event_id")
	private String eventId;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 事件code
	 */
	@ApiField("risk_event_code")
	private String riskEventCode;

	/** 
	 * SUCCESS表示有审核结果，不需要等待结果消息
INIT或者PROCESSING表示需要等待消息
见【
NextGuard总线接入文档
】审核返回status
	 */
	@ApiField("risk_process")
	private String riskProcess;

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventId( ) {
		return this.eventId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setRiskEventCode(String riskEventCode) {
		this.riskEventCode = riskEventCode;
	}
	public String getRiskEventCode( ) {
		return this.riskEventCode;
	}

	public void setRiskProcess(String riskProcess) {
		this.riskProcess = riskProcess;
	}
	public String getRiskProcess( ) {
		return this.riskProcess;
	}

}
