package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.cv.rs.result.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:31:40
 */
public class AnttechAiCvRsResultGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7778399294839787429L;

	/** 
	 * 各种类型的预测结果值
	 */
	@ApiField("predict_res")
	private String predictRes;

	public void setPredictRes(String predictRes) {
		this.predictRes = predictRes;
	}
	public String getPredictRes( ) {
		return this.predictRes;
	}

}
