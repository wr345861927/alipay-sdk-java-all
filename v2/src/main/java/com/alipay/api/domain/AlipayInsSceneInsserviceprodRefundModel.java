package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退订服务
 *
 * @author auto create
 * @since 1.0, 2023-05-18 18:36:14
 */
public class AlipayInsSceneInsserviceprodRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1386235226389299885L;

	/**
	 * 服务订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
