package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序功能服务poi查询
 *
 * @author auto create
 * @since 1.0, 2019-08-01 20:34:59
 */
public class AlipayOpenAppServiceMiniappnearbyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1823515889922492297L;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
