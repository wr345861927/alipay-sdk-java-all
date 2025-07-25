package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.newbenefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:16
 */
public class AlipayUserNewbenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6724524781645572419L;

	/** 
	 * 权益的ID，可以根据此ID对权益进行操作
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
