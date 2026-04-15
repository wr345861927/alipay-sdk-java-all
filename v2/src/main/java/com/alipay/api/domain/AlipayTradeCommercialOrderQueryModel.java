package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付订单结果查询
 *
 * @author auto create
 * @since 1.0, 2026-04-15 00:17:45
 */
public class AlipayTradeCommercialOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6271931357591426327L;

	/**
	 * 订单号，通过订单创建接口获取
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
