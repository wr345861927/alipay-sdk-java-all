package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.liveroom.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 10:35:33
 */
public class AlipayContentLiveLiveroomDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5554324594398426395L;

	/** 
	 * 直播中观看人数Uv
	 */
	@ApiField("count_uv")
	private Long countUv;

	public void setCountUv(Long countUv) {
		this.countUv = countUv;
	}
	public Long getCountUv( ) {
		return this.countUv;
	}

}
