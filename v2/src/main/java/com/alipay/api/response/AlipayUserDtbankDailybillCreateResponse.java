package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.dailybill.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:21:56
 */
public class AlipayUserDtbankDailybillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2818832784455597144L;

	/** 
	 * 账单申请号
	 */
	@ApiField("bill_application_id")
	private String billApplicationId;

	public void setBillApplicationId(String billApplicationId) {
		this.billApplicationId = billApplicationId;
	}
	public String getBillApplicationId( ) {
		return this.billApplicationId;
	}

}
