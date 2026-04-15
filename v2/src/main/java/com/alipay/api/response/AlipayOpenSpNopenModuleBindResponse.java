package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nopen.module.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-03 18:12:44
 */
public class AlipayOpenSpNopenModuleBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 4519863843512155864L;

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
