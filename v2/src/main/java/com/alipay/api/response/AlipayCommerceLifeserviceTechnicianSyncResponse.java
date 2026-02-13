package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.technician.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-05 16:47:44
 */
public class AlipayCommerceLifeserviceTechnicianSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2379647557963924171L;

	/** 
	 * 手艺人id
	 */
	@ApiField("technician_id")
	private String technicianId;

	public void setTechnicianId(String technicianId) {
		this.technicianId = technicianId;
	}
	public String getTechnicianId( ) {
		return this.technicianId;
	}

}
