package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nopen.module.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-07 10:37:44
 */
public class AlipayOpenSpNopenModuleUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5238132667394164628L;

	/** 
	 * traceId信息
	 */
	@ApiField("trace_id_info")
	private String traceIdInfo;

	public void setTraceIdInfo(String traceIdInfo) {
		this.traceIdInfo = traceIdInfo;
	}
	public String getTraceIdInfo( ) {
		return this.traceIdInfo;
	}

}
