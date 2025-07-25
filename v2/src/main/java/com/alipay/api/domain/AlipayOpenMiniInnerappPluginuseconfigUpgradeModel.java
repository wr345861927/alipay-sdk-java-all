package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灰度端版本配置
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:20:34
 */
public class AlipayOpenMiniInnerappPluginuseconfigUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 3392148615162818271L;

	/**
	 * 来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 端id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序应用 ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 插件研发版本
	 */
	@ApiField("plugin_dev_version")
	private String pluginDevVersion;

	/**
	 * 插件id
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 灰度值
	 */
	@ApiField("strategy_value")
	private String strategyValue;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPluginDevVersion() {
		return this.pluginDevVersion;
	}
	public void setPluginDevVersion(String pluginDevVersion) {
		this.pluginDevVersion = pluginDevVersion;
	}

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getStrategyValue() {
		return this.strategyValue;
	}
	public void setStrategyValue(String strategyValue) {
		this.strategyValue = strategyValue;
	}

}
