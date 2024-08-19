package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心卡使用明细详情列表
 *
 * @author auto create
 * @since 1.0, 2024-07-15 09:31:12
 */
public class AnxinkaDeliverDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 6761295776256386629L;

	/**
	 * 安心卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 安心付金额卡每笔退，卡使用扣除面额。单位：元，精确到小数点后两位
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 安心付金额卡每笔退，卡使用扣除实付面额。单位：元，精确到小数点后两位
	 */
	@ApiField("refund_cash")
	private String refundCash;

	/**
	 * 安心付金额卡每笔退款时间， 单位：秒。
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 安心付金额卡每笔使用收单商家账号
	 */
	@ApiField("settle_pid")
	private String settlePid;

	/**
	 * 安心付金额卡当前使用的核销门店的ID。
	 */
	@ApiField("settle_shop_id")
	private String settleShopId;

	/**
	 * 安心付金额卡当前使用的核销门店的门店备注名。
	 */
	@ApiField("settle_shop_memo")
	private String settleShopMemo;

	/**
	 * 安心付金额卡当前使用的核销门店的名称
	 */
	@ApiField("settle_shop_name")
	private String settleShopName;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 安心付金额卡每笔使用，卡使用扣除面额。单位：元，精确到小数点后两位。
	 */
	@ApiField("use_amount")
	private String useAmount;

	/**
	 * 安心付金额卡每笔使用，卡使用扣除实付面额。单位：元，精确到小数点后两位
	 */
	@ApiField("use_cash")
	private String useCash;

	/**
	 * 安心付金额卡每笔使用状态，如已使用、已退款，是一个状态表示。
	 */
	@ApiField("use_status")
	private String useStatus;

	/**
	 * 安心付金额卡每笔使用时间，单位：秒。
	 */
	@ApiField("use_time")
	private Date useTime;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundCash() {
		return this.refundCash;
	}
	public void setRefundCash(String refundCash) {
		this.refundCash = refundCash;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getSettlePid() {
		return this.settlePid;
	}
	public void setSettlePid(String settlePid) {
		this.settlePid = settlePid;
	}

	public String getSettleShopId() {
		return this.settleShopId;
	}
	public void setSettleShopId(String settleShopId) {
		this.settleShopId = settleShopId;
	}

	public String getSettleShopMemo() {
		return this.settleShopMemo;
	}
	public void setSettleShopMemo(String settleShopMemo) {
		this.settleShopMemo = settleShopMemo;
	}

	public String getSettleShopName() {
		return this.settleShopName;
	}
	public void setSettleShopName(String settleShopName) {
		this.settleShopName = settleShopName;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUseAmount() {
		return this.useAmount;
	}
	public void setUseAmount(String useAmount) {
		this.useAmount = useAmount;
	}

	public String getUseCash() {
		return this.useCash;
	}
	public void setUseCash(String useCash) {
		this.useCash = useCash;
	}

	public String getUseStatus() {
		return this.useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

	public Date getUseTime() {
		return this.useTime;
	}
	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

}
