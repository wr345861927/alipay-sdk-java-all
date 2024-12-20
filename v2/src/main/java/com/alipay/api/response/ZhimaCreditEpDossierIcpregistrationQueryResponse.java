package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpICPRegistrationDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.icpregistration.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:22
 */
public class ZhimaCreditEpDossierIcpregistrationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1319172248767163778L;

	/** 
	 * 企业ICP备案内容
	 */
	@ApiField("data")
	private EpICPRegistrationDataInfo data;

	public void setData(EpICPRegistrationDataInfo data) {
		this.data = data;
	}
	public EpICPRegistrationDataInfo getData( ) {
		return this.data;
	}

}
