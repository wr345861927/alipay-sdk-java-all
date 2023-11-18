package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.insure.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-15 15:11:11
 */
public class AlipayFundFlexiblestaffingInsureApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8892249513921619449L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
