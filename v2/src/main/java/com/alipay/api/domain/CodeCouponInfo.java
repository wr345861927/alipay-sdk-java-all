package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口令送信息
 *
 * @author auto create
 * @since 1.0, 2016-11-24 22:26:22
 */
public class CodeCouponInfo extends AlipayObject {

	private static final long serialVersionUID = 2681344715332734528L;

	/**
	 * 领取时间
	 */
	@ApiField("taken_time")
	private String takenTime;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 面额（单位分）
	 */
	@ApiField("voucher_amt")
	private String voucherAmt;

	public String getTakenTime() {
		return this.takenTime;
	}
	public void setTakenTime(String takenTime) {
		this.takenTime = takenTime;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVoucherAmt() {
		return this.voucherAmt;
	}
	public void setVoucherAmt(String voucherAmt) {
		this.voucherAmt = voucherAmt;
	}

}
