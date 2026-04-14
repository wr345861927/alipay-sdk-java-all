package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderVoucherReceiveResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.receive response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 11:07:45
 */
public class AlipayMarketingActivityOrdervoucherReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4843677448649212714L;

	/** 
	 * null
	 */
	@ApiListField("receive_result_list")
	@ApiField("order_voucher_receive_result")
	private List<OrderVoucherReceiveResult> receiveResultList;

	public void setReceiveResultList(List<OrderVoucherReceiveResult> receiveResultList) {
		this.receiveResultList = receiveResultList;
	}
	public List<OrderVoucherReceiveResult> getReceiveResultList( ) {
		return this.receiveResultList;
	}

}
