package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单履约信息
 *
 * @author auto create
 * @since 1.0, 2025-06-06 17:52:48
 */
public class RentOrderDeliveryInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8298682966254387139L;

	/**
	 * 配送结束时间
	 */
	@ApiField("delivery_end_time")
	private Date deliveryEndTime;

	/**
	 * 配送开始时间
	 */
	@ApiField("delivery_start_time")
	private Date deliveryStartTime;

	/**
	 * 订单履约类型
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 自提门店信息
	 */
	@ApiField("shop_info")
	private RentPickupShopInfoDTO shopInfo;

	public Date getDeliveryEndTime() {
		return this.deliveryEndTime;
	}
	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}

	public Date getDeliveryStartTime() {
		return this.deliveryStartTime;
	}
	public void setDeliveryStartTime(Date deliveryStartTime) {
		this.deliveryStartTime = deliveryStartTime;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public RentPickupShopInfoDTO getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(RentPickupShopInfoDTO shopInfo) {
		this.shopInfo = shopInfo;
	}

}
