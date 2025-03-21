package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部远程订单创建
 *
 * @author auto create
 * @since 1.0, 2025-03-11 17:47:54
 */
public class AlipayOfflinePaysaasOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3396196323363974618L;

	/**
	 * 收款订单投送N手持设备ID
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 服务商外部单号,外部实际使用单号
	 */
	@ApiField("isv_out_order_no")
	private String isvOutOrderNo;

	/**
	 * 单位为分，最大值为100000000分
	 */
	@ApiField("pay_amount")
	private String payAmount;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getIsvOutOrderNo() {
		return this.isvOutOrderNo;
	}
	public void setIsvOutOrderNo(String isvOutOrderNo) {
		this.isvOutOrderNo = isvOutOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

}
