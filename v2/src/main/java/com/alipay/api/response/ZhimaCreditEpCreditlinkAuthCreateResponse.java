package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlink.auth.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:01:50
 */
public class ZhimaCreditEpCreditlinkAuthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4522379288934382155L;

	/** 
	 * 业务订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 授权有效时间,格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("expire_time")
	private String expireTime;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

}
