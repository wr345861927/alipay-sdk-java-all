package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvBizOpenOrderFailReason;
import com.alipay.api.domain.IsvBizOpenOrderContent;
import com.alipay.api.domain.IsvSubMerchantOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.bizaccess.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 09:47:31
 */
public class AntMerchantExpandBizaccessOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4299383822164739595L;

	/** 
	 * 失败原因
	 */
	@ApiListField("fail_reasons")
	@ApiField("isv_biz_open_order_fail_reason")
	private List<IsvBizOpenOrderFailReason> failReasons;

	/** 
	 * 商户号
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 订单信息
	 */
	@ApiField("order_content")
	private IsvBizOpenOrderContent orderContent;

	/** 
	 * 业务开通主单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 用于表示申请单的状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 子单列表
	 */
	@ApiListField("sub_merchant_orders")
	@ApiField("isv_sub_merchant_order_v_o")
	private List<IsvSubMerchantOrderVO> subMerchantOrders;

	/** 
	 * 待办url
	 */
	@ApiField("wait_process_task_url")
	private String waitProcessTaskUrl;

	public void setFailReasons(List<IsvBizOpenOrderFailReason> failReasons) {
		this.failReasons = failReasons;
	}
	public List<IsvBizOpenOrderFailReason> getFailReasons( ) {
		return this.failReasons;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setOrderContent(IsvBizOpenOrderContent orderContent) {
		this.orderContent = orderContent;
	}
	public IsvBizOpenOrderContent getOrderContent( ) {
		return this.orderContent;
	}

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

	public void setSubMerchantOrders(List<IsvSubMerchantOrderVO> subMerchantOrders) {
		this.subMerchantOrders = subMerchantOrders;
	}
	public List<IsvSubMerchantOrderVO> getSubMerchantOrders( ) {
		return this.subMerchantOrders;
	}

	public void setWaitProcessTaskUrl(String waitProcessTaskUrl) {
		this.waitProcessTaskUrl = waitProcessTaskUrl;
	}
	public String getWaitProcessTaskUrl( ) {
		return this.waitProcessTaskUrl;
	}

}
