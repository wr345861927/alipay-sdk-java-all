package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.bike.energy.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:21:47
 */
public class AlipayCommerceTransportBikeEnergyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7513848359969175122L;

	/** 
	 * 用户是否开启能量开关
1：开启
0：关闭
	 */
	@ApiField("energy_open")
	private String energyOpen;

	public void setEnergyOpen(String energyOpen) {
		this.energyOpen = energyOpen;
	}
	public String getEnergyOpen( ) {
		return this.energyOpen;
	}

}
