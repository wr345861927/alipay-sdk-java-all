package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BkdfmacBizBudgetApplyAmountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.financialplatform.budget.bbaremainamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:36:40
 */
public class MybankFinancialplatformBudgetBbaremainamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3896678751642757241L;

	/** 
	 * BBA可用、剩余金额
	 */
	@ApiField("result_data")
	private BkdfmacBizBudgetApplyAmountDTO resultData;

	/** 
	 * 错误的详细信息，用于具体描述错误信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(BkdfmacBizBudgetApplyAmountDTO resultData) {
		this.resultData = resultData;
	}
	public BkdfmacBizBudgetApplyAmountDTO getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
