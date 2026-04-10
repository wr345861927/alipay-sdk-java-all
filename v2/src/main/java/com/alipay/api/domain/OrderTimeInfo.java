package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单时间信息
 *
 * @author auto create
 * @since 1.0, 2026-04-10 14:14:28
 */
public class OrderTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 8564854185459171576L;

	/**
	 * 订单取消时间
	 */
	@ApiField("order_cancel_time")
	private Date orderCancelTime;

	/**
	 * 订单关闭时间
	 */
	@ApiField("order_close_time")
	private Date orderCloseTime;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单发货时间
	 */
	@ApiField("order_deliver_time")
	private Date orderDeliverTime;

	/**
	 * 订单完成时间
	 */
	@ApiField("order_finish_time")
	private Date orderFinishTime;

	/**
	 * 订单最后更新时间
	 */
	@ApiField("order_last_update_time")
	private Date orderLastUpdateTime;

	/**
	 * 订单支付时间
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 订单收货时间
	 */
	@ApiField("order_receive_time")
	private Date orderReceiveTime;

	public Date getOrderCancelTime() {
		return this.orderCancelTime;
	}
	public void setOrderCancelTime(Date orderCancelTime) {
		this.orderCancelTime = orderCancelTime;
	}

	public Date getOrderCloseTime() {
		return this.orderCloseTime;
	}
	public void setOrderCloseTime(Date orderCloseTime) {
		this.orderCloseTime = orderCloseTime;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderDeliverTime() {
		return this.orderDeliverTime;
	}
	public void setOrderDeliverTime(Date orderDeliverTime) {
		this.orderDeliverTime = orderDeliverTime;
	}

	public Date getOrderFinishTime() {
		return this.orderFinishTime;
	}
	public void setOrderFinishTime(Date orderFinishTime) {
		this.orderFinishTime = orderFinishTime;
	}

	public Date getOrderLastUpdateTime() {
		return this.orderLastUpdateTime;
	}
	public void setOrderLastUpdateTime(Date orderLastUpdateTime) {
		this.orderLastUpdateTime = orderLastUpdateTime;
	}

	public Date getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public Date getOrderReceiveTime() {
		return this.orderReceiveTime;
	}
	public void setOrderReceiveTime(Date orderReceiveTime) {
		this.orderReceiveTime = orderReceiveTime;
	}

}
