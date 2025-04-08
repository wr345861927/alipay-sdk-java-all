package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 静态站点缓存刷新
 *
 * @author auto create
 * @since 1.0, 2025-04-01 10:47:34
 */
public class AlipayCloudCloudrunStaticsiteCacheruleRefreshModel extends AlipayObject {

	private static final long serialVersionUID = 7839491291142719689L;

	/**
	 * 文件/目录路径
	 */
	@ApiField("data")
	private String data;

	/**
	 * 环境ID
	 */
	@ApiField("env")
	private String env;

	/**
	 * 用户使用的app id，可以从小程序云用户中心获取
	 */
	@ApiField("id_app")
	private String idApp;

	/**
	 * 目前只支持两种File/Directory
	 */
	@ApiField("type")
	private String type;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getIdApp() {
		return this.idApp;
	}
	public void setIdApp(String idApp) {
		this.idApp = idApp;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
