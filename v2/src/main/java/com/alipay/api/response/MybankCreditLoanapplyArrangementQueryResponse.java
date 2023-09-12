package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArrangementOpenQueryResultVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.arrangement.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-19 15:46:57
 */
public class MybankCreditLoanapplyArrangementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7341183143259533733L;

	/** 
	 * 查询指定客户、产品下客户签订的合约状态等信息
	 */
	@ApiListField("arrangement_query_result")
	@ApiField("arrangement_open_query_result_v_o")
	private List<ArrangementOpenQueryResultVO> arrangementQueryResult;

	public void setArrangementQueryResult(List<ArrangementOpenQueryResultVO> arrangementQueryResult) {
		this.arrangementQueryResult = arrangementQueryResult;
	}
	public List<ArrangementOpenQueryResultVO> getArrangementQueryResult( ) {
		return this.arrangementQueryResult;
	}

}
