package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.intl.shopbrand.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-15 13:46:55
 */
public class AlipayOverseasTravelIntlShopbrandSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8627356467945271329L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	/** 
	 * Result code
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果信息
	 */
	@ApiField("result_message")
	private String resultMessage;

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

}
