package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店范围
 *
 * @author auto create
 * @since 1.0, 2024-04-12 17:38:57
 */
public class ShopAreaInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6444533328423398392L;

	/**
	 * 市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区
	 */
	@ApiField("county_name")
	private String countyName;

	/**
	 * 省
	 */
	@ApiField("province_name")
	private String provinceName;

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountyName() {
		return this.countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
