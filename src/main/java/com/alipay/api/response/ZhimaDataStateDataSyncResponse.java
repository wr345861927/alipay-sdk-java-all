package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.data.state.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-15 21:16:34
 */
public class ZhimaDataStateDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3672752132847828259L;

	/** 
	 * 同步结果成功或失败,具体错误码在错误信息中
	 */
	@ApiField("biz_result")
	private String bizResult;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

}
