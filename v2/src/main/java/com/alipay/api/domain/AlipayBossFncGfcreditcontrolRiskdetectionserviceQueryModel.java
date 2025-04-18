package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算风险咨询openapi
 *
 * @author auto create
 * @since 1.0, 2025-02-27 11:02:23
 */
public class AlipayBossFncGfcreditcontrolRiskdetectionserviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2677425782182851581L;

	/**
	 * 风险咨询服务请求
	 */
	@ApiField("risk_detection_request")
	private RiskDetectionRequest riskDetectionRequest;

	public RiskDetectionRequest getRiskDetectionRequest() {
		return this.riskDetectionRequest;
	}
	public void setRiskDetectionRequest(RiskDetectionRequest riskDetectionRequest) {
		this.riskDetectionRequest = riskDetectionRequest;
	}

}
