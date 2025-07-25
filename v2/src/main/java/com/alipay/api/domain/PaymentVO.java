package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付信息
 *
 * @author auto create
 * @since 1.0, 2025-07-21 10:19:00
 */
public class PaymentVO extends AlipayObject {

	private static final long serialVersionUID = 1825134869999894477L;

	/**
	 * 订单优惠总金额
	 */
	@ApiField("amount_discount")
	private String amountDiscount;

	/**
	 * 商品总金额
	 */
	@ApiField("amount_item")
	private String amountItem;

	/**
	 * 订单总金额
	 */
	@ApiField("amount_original")
	private String amountOriginal;

	/**
	 * 用户实付金额
	 */
	@ApiField("amount_user")
	private String amountUser;

	/**
	 * 此字段对应B站对账单中抽佣部分的交易单号
	 */
	@ApiListField("commission_trade_nos")
	@ApiField("string")
	private List<String> commissionTradeNos;

	/**
	 * 配送优惠金额
	 */
	@ApiField("delivery_discount_fee")
	private String deliveryDiscountFee;

	/**
	 * 配送服务费，当前订单产生时该门店的配送费，配送服务费=基础配送费+特殊时段加价费用+距离加价费用-配送优惠金额，单位：元，保留2位小数
	 */
	@ApiField("delivery_fee")
	private String deliveryFee;

	/**
	 * 基础配送费，单位：元，保留2位小数
	 */
	@ApiField("delivery_price")
	private String deliveryPrice;

	/**
	 * 距离加价费用，单位：元，保留2位小数
	 */
	@ApiField("distance_markup_price")
	private String distanceMarkupPrice;

	/**
	 * 商家应收款
	 */
	@ApiField("merchant_receive")
	private String merchantReceive;

	/**
	 * 医保支付金额
	 */
	@ApiField("mi_amount")
	private String miAmount;

	/**
	 * 打包费总金额，单位：元，保留2位小数
	 */
	@ApiField("packing_fee")
	private String packingFee;

	/**
	 * 购药saas平台支付单号，对应医保对账单中的平台订单号
	 */
	@ApiField("pay_num")
	private String payNum;

	/**
	 * 自费支付产生费用时的订单号
	 */
	@ApiField("self_trade_no")
	private String selfTradeNo;

	/**
	 * 特殊时段加价费用，单位：元，保留2位小数
	 */
	@ApiField("time_markup_price")
	private String timeMarkupPrice;

	/**
	 * 此字段对应B站对账单中的商家订单号
	 */
	@ApiField("yk_pay_no")
	private String ykPayNo;

	public String getAmountDiscount() {
		return this.amountDiscount;
	}
	public void setAmountDiscount(String amountDiscount) {
		this.amountDiscount = amountDiscount;
	}

	public String getAmountItem() {
		return this.amountItem;
	}
	public void setAmountItem(String amountItem) {
		this.amountItem = amountItem;
	}

	public String getAmountOriginal() {
		return this.amountOriginal;
	}
	public void setAmountOriginal(String amountOriginal) {
		this.amountOriginal = amountOriginal;
	}

	public String getAmountUser() {
		return this.amountUser;
	}
	public void setAmountUser(String amountUser) {
		this.amountUser = amountUser;
	}

	public List<String> getCommissionTradeNos() {
		return this.commissionTradeNos;
	}
	public void setCommissionTradeNos(List<String> commissionTradeNos) {
		this.commissionTradeNos = commissionTradeNos;
	}

	public String getDeliveryDiscountFee() {
		return this.deliveryDiscountFee;
	}
	public void setDeliveryDiscountFee(String deliveryDiscountFee) {
		this.deliveryDiscountFee = deliveryDiscountFee;
	}

	public String getDeliveryFee() {
		return this.deliveryFee;
	}
	public void setDeliveryFee(String deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public String getDeliveryPrice() {
		return this.deliveryPrice;
	}
	public void setDeliveryPrice(String deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	public String getDistanceMarkupPrice() {
		return this.distanceMarkupPrice;
	}
	public void setDistanceMarkupPrice(String distanceMarkupPrice) {
		this.distanceMarkupPrice = distanceMarkupPrice;
	}

	public String getMerchantReceive() {
		return this.merchantReceive;
	}
	public void setMerchantReceive(String merchantReceive) {
		this.merchantReceive = merchantReceive;
	}

	public String getMiAmount() {
		return this.miAmount;
	}
	public void setMiAmount(String miAmount) {
		this.miAmount = miAmount;
	}

	public String getPackingFee() {
		return this.packingFee;
	}
	public void setPackingFee(String packingFee) {
		this.packingFee = packingFee;
	}

	public String getPayNum() {
		return this.payNum;
	}
	public void setPayNum(String payNum) {
		this.payNum = payNum;
	}

	public String getSelfTradeNo() {
		return this.selfTradeNo;
	}
	public void setSelfTradeNo(String selfTradeNo) {
		this.selfTradeNo = selfTradeNo;
	}

	public String getTimeMarkupPrice() {
		return this.timeMarkupPrice;
	}
	public void setTimeMarkupPrice(String timeMarkupPrice) {
		this.timeMarkupPrice = timeMarkupPrice;
	}

	public String getYkPayNo() {
		return this.ykPayNo;
	}
	public void setYkPayNo(String ykPayNo) {
		this.ykPayNo = ykPayNo;
	}

}
