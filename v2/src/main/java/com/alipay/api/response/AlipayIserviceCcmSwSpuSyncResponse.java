package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.spu.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 20:02:00
 */
public class AlipayIserviceCcmSwSpuSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2644121519277239491L;

	/** 
	 * 商品id
	 */
	@ApiField("spu_id")
	private String spuId;

	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}
	public String getSpuId( ) {
		return this.spuId;
	}

}
