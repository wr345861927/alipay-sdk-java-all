package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.paysaas.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 16:52:26
 */
public class AlipayOfflinePaysaasOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5729544762621634766L;

	/** 
	 * 推单业务的唯一单号
	 */
	@ApiField("isv_order_no")
	private String isvOrderNo;

	/** 
	 * 收款订单状态，用于服务商收银机展示收款状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 推单对应的支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 支付时isv返回的内部订单号，当订单状态为：PAID、REFUND_CLOSED可以返回该值
	 */
	@ApiField("third_order_no")
	private String thirdOrderNo;

	public void setIsvOrderNo(String isvOrderNo) {
		this.isvOrderNo = isvOrderNo;
	}
	public String getIsvOrderNo( ) {
		return this.isvOrderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
	}

	public void setThirdOrderNo(String thirdOrderNo) {
		this.thirdOrderNo = thirdOrderNo;
	}
	public String getThirdOrderNo( ) {
		return this.thirdOrderNo;
	}

}
