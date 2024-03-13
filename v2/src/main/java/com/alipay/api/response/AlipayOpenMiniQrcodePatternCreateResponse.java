package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.qrcode.pattern.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 14:37:02
 */
public class AlipayOpenMiniQrcodePatternCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7791677376255746321L;

	/** 
	 * 路由规则组，用于唯一标记所创建模式的字段
	 */
	@ApiField("route_group")
	private String routeGroup;

	public void setRouteGroup(String routeGroup) {
		this.routeGroup = routeGroup;
	}
	public String getRouteGroup( ) {
		return this.routeGroup;
	}

}
