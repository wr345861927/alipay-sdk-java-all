package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PortraitDistribution;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.userportrait.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:16:08
 */
public class AlipayOpenMiniUserportraitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6572395846727851824L;

	/** 
	 * 用户画像
	 */
	@ApiListField("portrait_distributions")
	@ApiField("portrait_distribution")
	private List<PortraitDistribution> portraitDistributions;

	public void setPortraitDistributions(List<PortraitDistribution> portraitDistributions) {
		this.portraitDistributions = portraitDistributions;
	}
	public List<PortraitDistribution> getPortraitDistributions( ) {
		return this.portraitDistributions;
	}

}
