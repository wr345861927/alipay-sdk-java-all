package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.promotion.apply.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-21 10:15:20
 */
public class AlipayFinancialnetPromotionApplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5225829589672343182L;

	/** 
	 * 进件订单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 蚂蚁traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}