package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpInvestDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.invest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:23
 */
public class ZhimaCreditEpDossierInvestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8651785656512426358L;

	/** 
	 * 企业对外投资内容
	 */
	@ApiField("data")
	private EpInvestDataInfo data;

	public void setData(EpInvestDataInfo data) {
		this.data = data;
	}
	public EpInvestDataInfo getData( ) {
		return this.data;
	}

}
