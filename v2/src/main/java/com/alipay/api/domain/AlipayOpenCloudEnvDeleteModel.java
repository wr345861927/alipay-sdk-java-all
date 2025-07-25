package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除应用在云中环境
 *
 * @author auto create
 * @since 1.0, 2023-04-06 16:50:30
 */
public class AlipayOpenCloudEnvDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7121659889611143997L;

	/**
	 * 云id
	 */
	@ApiField("cloud_id")
	private String cloudId;

	/**
	 * 环境id
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 调用的应用id
	 */
	@ApiField("invoke_app_id")
	private String invokeAppId;

	public String getCloudId() {
		return this.cloudId;
	}
	public void setCloudId(String cloudId) {
		this.cloudId = cloudId;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getInvokeAppId() {
		return this.invokeAppId;
	}
	public void setInvokeAppId(String invokeAppId) {
		this.invokeAppId = invokeAppId;
	}

}
