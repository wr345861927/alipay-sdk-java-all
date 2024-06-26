package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.gzone.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 17:12:53
 */
public class AlipayOpenOperationOpenbizmockGzoneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5744728948684933894L;

	/** 
	 * 1
	 */
	@ApiField("result")
	private String result;

	/** 
	 * ceshi
	 */
	@ApiField("zone_name")
	private String zoneName;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getZoneName( ) {
		return this.zoneName;
	}

}
