package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.schema.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-08 11:52:54
 */
public class AlipayOpenOperationOpenbizmockSchemaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5626766138762622295L;

	/** 
	 * test
	 */
	@ApiField("result")
	private String result;

	/** 
	 * test
	 */
	@ApiField("result_open_id")
	private String resultOpenId;

	/** 
	 * test
	 */
	@ApiField("result_type")
	private String resultType;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setResultOpenId(String resultOpenId) {
		this.resultOpenId = resultOpenId;
	}
	public String getResultOpenId( ) {
		return this.resultOpenId;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
	public String getResultType( ) {
		return this.resultType;
	}

}
