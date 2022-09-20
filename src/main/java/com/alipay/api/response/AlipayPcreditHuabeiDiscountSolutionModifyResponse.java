package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.discount.solution.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-16 17:48:37
 */
public class AlipayPcreditHuabeiDiscountSolutionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5445741376112535877L;

	/** 
	 * success，是否更新成功，true成功，false失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
