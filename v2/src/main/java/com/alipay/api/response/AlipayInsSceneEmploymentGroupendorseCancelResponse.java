package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.groupendorse.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 14:41:34
 */
public class AlipayInsSceneEmploymentGroupendorseCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 3793858281192159321L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 主批单号
	 */
	@ApiField("summary_endorse_order_no")
	private String summaryEndorseOrderNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setSummaryEndorseOrderNo(String summaryEndorseOrderNo) {
		this.summaryEndorseOrderNo = summaryEndorseOrderNo;
	}
	public String getSummaryEndorseOrderNo( ) {
		return this.summaryEndorseOrderNo;
	}

}
