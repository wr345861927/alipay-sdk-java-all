package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SnsTradeDataResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.snstrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-18 10:07:28
 */
public class AlipayMerchantOrderSnstradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2136875447124998682L;

	/** 
	 * 动销数据
	 */
	@ApiListField("data_results")
	@ApiField("sns_trade_data_result")
	private List<SnsTradeDataResult> dataResults;

	public void setDataResults(List<SnsTradeDataResult> dataResults) {
		this.dataResults = dataResults;
	}
	public List<SnsTradeDataResult> getDataResults( ) {
		return this.dataResults;
	}

}
