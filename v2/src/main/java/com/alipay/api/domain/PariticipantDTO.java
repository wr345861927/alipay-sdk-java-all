package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询参与方信息
 *
 * @author auto create
 * @since 1.0, 2022-12-29 16:21:54
 */
public class PariticipantDTO extends AlipayObject {

	private static final long serialVersionUID = 4578289421776991261L;

	/**
	 * 参与方的唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 参与方的标识类型，目前支持如下类型： 
1.ALIPAY_USER_ID：支付宝的会员ID
2.ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 参与方名称
	 */
	@ApiField("name")
	private String name;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
