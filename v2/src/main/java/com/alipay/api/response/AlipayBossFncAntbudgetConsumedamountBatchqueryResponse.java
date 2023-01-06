package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizActionConsumedAmountsDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.antbudget.consumedamount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:56:58
 */
public class AlipayBossFncAntbudgetConsumedamountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7161869828325943918L;

	/** 
	 * 根据BizUkIds查询出的占用情况
	 */
	@ApiListField("result_data")
	@ApiField("biz_action_consumed_amounts_d_t_o")
	private List<BizActionConsumedAmountsDTO> resultData;

	/** 
	 * 错误具体信息描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(List<BizActionConsumedAmountsDTO> resultData) {
		this.resultData = resultData;
	}
	public List<BizActionConsumedAmountsDTO> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
