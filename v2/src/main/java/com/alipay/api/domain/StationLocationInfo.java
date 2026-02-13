package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 站点具体信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 19:55:36
 */
public class StationLocationInfo extends AlipayObject {

	private static final long serialVersionUID = 4874135536656834923L;

	/**
	 * 站点纬度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 站点经度
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 站点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 站点名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 站点Id
	 */
	@ApiField("station_id")
	private String stationId;

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

}
