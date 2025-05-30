package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-05-21 10:52:01
 */
public class SellerSyncRentOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5492694925636439575L;

	/**
	 * 租赁的模式：到期归还/到期即送/到期买断
	 */
	@ApiField("rent_mode")
	private String rentMode;

	public String getRentMode() {
		return this.rentMode;
	}
	public void setRentMode(String rentMode) {
		this.rentMode = rentMode;
	}

}
