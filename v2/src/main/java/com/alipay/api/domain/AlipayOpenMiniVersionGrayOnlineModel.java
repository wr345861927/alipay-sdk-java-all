package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序灰度上架
 *
 * @author auto create
 * @since 1.0, 2024-06-06 16:57:17
 */
public class AlipayOpenMiniVersionGrayOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 7768886575487961385L;

	/**
	 * 商家小程序版本号，需为审核通过状态的小程序版本。
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序客户端类型，默认为支付宝端。常见支持如下客户端：
com.alipay.alipaywallet：支付宝端；
com.alibaba.android.rimet：DINGDING端；
com.amap.app：高德端；
com.alibaba.ailabs.genie.webapps：天猫精灵端；
com.alipay.iot.xpaas：支付宝IoT端。
如需更多端投放，请联系业务BD。
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序灰度策略值
	 */
	@ApiField("gray_strategy")
	private String grayStrategy;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getGrayStrategy() {
		return this.grayStrategy;
	}
	public void setGrayStrategy(String grayStrategy) {
		this.grayStrategy = grayStrategy;
	}

}
