package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.registerinvite.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 13:37:33
 */
public class AlipayCommerceEcEnterpriseRegisterinviteCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6179585314447628858L;

	/** 
	 * 注册链接失效时间，有效期30天
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * PC端企业注册链接
	 */
	@ApiField("pc_invite_url")
	private String pcInviteUrl;

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setPcInviteUrl(String pcInviteUrl) {
		this.pcInviteUrl = pcInviteUrl;
	}
	public String getPcInviteUrl( ) {
		return this.pcInviteUrl;
	}

}
