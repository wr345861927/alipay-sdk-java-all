package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.deviceinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:10
 */
public class AlipaySecurityRiskDeviceinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3524856854638364343L;

	/** 
	 * 设备原子风险
	 */
	@ApiField("atomic_risk")
	private String atomicRisk;

	public void setAtomicRisk(String atomicRisk) {
		this.atomicRisk = atomicRisk;
	}
	public String getAtomicRisk( ) {
		return this.atomicRisk;
	}

}
