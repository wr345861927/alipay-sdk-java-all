package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalServiceMagaDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.service.maga.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-06 17:02:23
 */
public class AlipayCommerceMedicalServiceMagaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5713666844159971983L;

	/** 
	 * 服务投放数据实体
	 */
	@ApiField("data")
	private MedicalServiceMagaDTO data;

	public void setData(MedicalServiceMagaDTO data) {
		this.data = data;
	}
	public MedicalServiceMagaDTO getData( ) {
		return this.data;
	}

}
