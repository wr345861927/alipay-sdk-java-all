package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序结束灰度
 *
 * @author auto create
 * @since 1.0, 2024-07-09 11:27:49
 */
public class AlipayOpenMiniVersionGrayCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4586867649595738359L;

	/**
	 * 商家灰度中的小程序版本号，结束灰度后小程序将回到审核通过状态。
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

}
