package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EcomCompanyFeatureInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.ecomcompany.feature.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-12 15:07:05
 */
public class ZhimaCreditEpEcomcompanyFeatureQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6494322747986924632L;

	/** 
	 * 电商企业特征信息
	 */
	@ApiField("data")
	private EcomCompanyFeatureInfo data;

	public void setData(EcomCompanyFeatureInfo data) {
		this.data = data;
	}
	public EcomCompanyFeatureInfo getData( ) {
		return this.data;
	}

}
