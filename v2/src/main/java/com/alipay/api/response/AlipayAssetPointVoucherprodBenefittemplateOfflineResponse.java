package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.voucherprod.benefittemplate.offline response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:44
 */
public class AlipayAssetPointVoucherprodBenefittemplateOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 2168995912732475536L;

	/** 
	 * 快速下线，true表示模版已过期并且已经退回资金，false表示模版已过期，但是尚未退回资金
	 */
	@ApiField("quick_recycle")
	private Boolean quickRecycle;

	public void setQuickRecycle(Boolean quickRecycle) {
		this.quickRecycle = quickRecycle;
	}
	public Boolean getQuickRecycle( ) {
		return this.quickRecycle;
	}

}
