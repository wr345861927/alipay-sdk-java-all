package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PreCreateWaybillIstd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.order.instantdelivery.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-23 10:36:36
 */
public class AlipayCommerceLogisticsOrderInstantdeliveryPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2382769728541722695L;

	/** 
	 * 即时配送运单列表
	 */
	@ApiListField("waybills")
	@ApiField("pre_create_waybill_istd")
	private List<PreCreateWaybillIstd> waybills;

	public void setWaybills(List<PreCreateWaybillIstd> waybills) {
		this.waybills = waybills;
	}
	public List<PreCreateWaybillIstd> getWaybills( ) {
		return this.waybills;
	}

}
