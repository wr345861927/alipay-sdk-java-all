package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * get
 *
 * @author auto create
 * @since 1.0, 2023-01-03 18:13:10
 */
public class AlipayOpenAppTestGrayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7534989676423262641L;

	/**
	 * 1
	 */
	@ApiField("buy_open_id")
	private String buyOpenId;

	/**
	 * 1
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 1
	 */
	@ApiField("uid")
	private String uid;

	public String getBuyOpenId() {
		return this.buyOpenId;
	}
	public void setBuyOpenId(String buyOpenId) {
		this.buyOpenId = buyOpenId;
	}

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
