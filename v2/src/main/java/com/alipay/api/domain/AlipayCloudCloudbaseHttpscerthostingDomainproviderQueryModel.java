package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 域名服务提供商查询
 *
 * @author auto create
 * @since 1.0, 2024-06-06 16:20:17
 */
public class AlipayCloudCloudbaseHttpscerthostingDomainproviderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1729371572372261275L;

	/**
	 * 小程序云APPID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云ENVID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

}
