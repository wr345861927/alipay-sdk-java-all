package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除服务关键词
 *
 * @author auto create
 * @since 1.0, 2023-06-12 16:27:43
 */
public class AlipayOpenSearchSubservicekeywordDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1221115573899216873L;

	/**
	 * 关键词配置ID
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 小程序id
	 */
	@ApiField("target_appid")
	private String targetAppid;

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}
