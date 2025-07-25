package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.torchreplayuv.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:20:38
 */
public class AlipayDataMdaTorchreplayuvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5476256695932319914L;

	/** 
	 * 今日用户量
	 */
	@ApiField("today_uv")
	private Long todayUv;

	/** 
	 * 今日用户趋势
	 */
	@ApiField("today_uv_trend")
	private String todayUvTrend;

	/** 
	 * 总用户量
	 */
	@ApiField("total_uv")
	private Long totalUv;

	public void setTodayUv(Long todayUv) {
		this.todayUv = todayUv;
	}
	public Long getTodayUv( ) {
		return this.todayUv;
	}

	public void setTodayUvTrend(String todayUvTrend) {
		this.todayUvTrend = todayUvTrend;
	}
	public String getTodayUvTrend( ) {
		return this.todayUvTrend;
	}

	public void setTotalUv(Long totalUv) {
		this.totalUv = totalUv;
	}
	public Long getTotalUv( ) {
		return this.totalUv;
	}

}
