package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.face.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:46:50
 */
public class AlipayCommerceLogisticsFaceMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 2368235696591492486L;

	/** 
	 * 返回业务唯一标识 , 用于在人脸匹配到目标后，根据这个业务唯一标识做后续业务j校验以及操作.比如针对刷脸开柜场景，商户需要根据返回的这个业务唯一标识来判断当前业务单的状态，来决定是否进行开柜操作 .
	 */
	@ApiField("biz_unique_no")
	private String bizUniqueNo;

	public void setBizUniqueNo(String bizUniqueNo) {
		this.bizUniqueNo = bizUniqueNo;
	}
	public String getBizUniqueNo( ) {
		return this.bizUniqueNo;
	}

}
