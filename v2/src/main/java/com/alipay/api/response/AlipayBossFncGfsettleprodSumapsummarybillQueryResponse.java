package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApSumSummaryBillAmountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.sumapsummarybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 16:59:03
 */
public class AlipayBossFncGfsettleprodSumapsummarybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2276134596883579245L;

	/** 
	 * 统计金额
	 */
	@ApiField("result_set")
	private ApSumSummaryBillAmountDTO resultSet;

	public void setResultSet(ApSumSummaryBillAmountDTO resultSet) {
		this.resultSet = resultSet;
	}
	public ApSumSummaryBillAmountDTO getResultSet( ) {
		return this.resultSet;
	}

}
