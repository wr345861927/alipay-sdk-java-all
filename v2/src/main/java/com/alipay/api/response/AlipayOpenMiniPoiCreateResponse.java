package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.poi.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 21:41:48
 */
public class AlipayOpenMiniPoiCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5729298264256511314L;

	/** 
	 * poi id，地理位置标记信息
	 */
	@ApiField("poi_id")
	private String poiId;

	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}
	public String getPoiId( ) {
		return this.poiId;
	}

}
