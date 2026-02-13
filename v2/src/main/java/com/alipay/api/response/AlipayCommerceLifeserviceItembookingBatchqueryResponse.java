package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeserviceItemBookingRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.itembooking.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-12 10:47:46
 */
public class AlipayCommerceLifeserviceItembookingBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6849759446987767268L;

	/** 
	 * null
	 */
	@ApiListField("content")
	@ApiField("lifeservice_item_booking_relation")
	private List<LifeserviceItemBookingRelation> content;

	public void setContent(List<LifeserviceItemBookingRelation> content) {
		this.content = content;
	}
	public List<LifeserviceItemBookingRelation> getContent( ) {
		return this.content;
	}

}
