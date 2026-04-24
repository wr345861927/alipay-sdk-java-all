package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2026-04-20 17:03:54
 */
public class ServiceItemOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2658998298318732116L;

	/**
	 * 患者名称
	 */
	@ApiField("patient_name")
	private String patientName;

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

}
