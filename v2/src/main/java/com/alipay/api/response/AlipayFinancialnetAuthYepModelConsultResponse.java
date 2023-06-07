package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.yep.model.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:56:57
 */
public class AlipayFinancialnetAuthYepModelConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6498626643251836442L;

	/** 
	 * 业务模式
	 */
	@ApiField("biz_model")
	private String bizModel;

	/** 
	 * 当biz_model返回 直接签约或可引导签约，可跳转到链接，签约余额升级
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setBizModel(String bizModel) {
		this.bizModel = bizModel;
	}
	public String getBizModel( ) {
		return this.bizModel;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

}
