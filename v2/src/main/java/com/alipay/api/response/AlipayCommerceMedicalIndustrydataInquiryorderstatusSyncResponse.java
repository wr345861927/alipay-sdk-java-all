package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.inquiryorderstatus.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-16 16:32:31
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderstatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7292555283164899515L;

	/** 
	 * 支付宝问诊订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 支付宝问诊订单状态
待支付:WAIT_PAY
已取消:CANCELED
待接诊:WAIT_INQUIRY
退款中:REFUNDING
已退款:REFUNDED
问诊中:IN_INQUIRY
退款申请中:REFUND_APPLYING
已完成:FINISHED
用户申诉退款:USER_APPEAL_CANCELED
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
