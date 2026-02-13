package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-02-12 12:59:34
 */
public class DeviceStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 5156427132352435412L;

	/**
	 * 电池电量百分比（0~100）
	 */
	@ApiField("battery_percent")
	private Long batteryPercent;

	/**
	 * 机器人编号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 机器人状态，参考枚举值
	 */
	@ApiField("status")
	private String status;

	public Long getBatteryPercent() {
		return this.batteryPercent;
	}
	public void setBatteryPercent(Long batteryPercent) {
		this.batteryPercent = batteryPercent;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
