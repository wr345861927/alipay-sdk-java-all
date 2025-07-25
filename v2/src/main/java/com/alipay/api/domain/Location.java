package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 位置信息
 *
 * @author auto create
 * @since 1.0, 2025-05-29 15:11:25
 */
public class Location extends AlipayObject {

	private static final long serialVersionUID = 1533947862592737927L;

	/**
	 * 朝向角度
	 */
	@ApiField("angle")
	private String angle;

	/**
	 * 纬度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 位置扩展信息列表
	 */
	@ApiListField("location_ext_infos")
	@ApiField("transport_ext_info")
	private List<TransportExtInfo> locationExtInfos;

	/**
	 * 经度
	 */
	@ApiField("lon")
	private String lon;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 提示信息
	 */
	@ApiField("tips")
	private TipInfo tips;

	public String getAngle() {
		return this.angle;
	}
	public void setAngle(String angle) {
		this.angle = angle;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public List<TransportExtInfo> getLocationExtInfos() {
		return this.locationExtInfos;
	}
	public void setLocationExtInfos(List<TransportExtInfo> locationExtInfos) {
		this.locationExtInfos = locationExtInfos;
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

	public TipInfo getTips() {
		return this.tips;
	}
	public void setTips(TipInfo tips) {
		this.tips = tips;
	}

}
