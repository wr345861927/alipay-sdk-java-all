package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiOperationalAnalysisTrafficResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysistraffic.overviewtrend.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-05 14:12:06
 */
public class AlipayCloudCloudpromoAnalysistrafficOverviewtrendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3217548574673517367L;

	/** 
	 * 经营分析-流量分析-流量总览趋势返回
	 */
	@ApiField("results")
	private OpenApiOperationalAnalysisTrafficResult results;

	public void setResults(OpenApiOperationalAnalysisTrafficResult results) {
		this.results = results;
	}
	public OpenApiOperationalAnalysisTrafficResult getResults( ) {
		return this.results;
	}

}
