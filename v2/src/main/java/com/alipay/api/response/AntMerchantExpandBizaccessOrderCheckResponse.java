package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvBizOpenOrderFailReason;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.bizaccess.order.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-11 11:32:29
 */
public class AntMerchantExpandBizaccessOrderCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2347238187458565889L;

	/** 
	 * 失败原因
	 */
	@ApiListField("fail_reasons")
	@ApiField("isv_biz_open_order_fail_reason")
	private List<IsvBizOpenOrderFailReason> failReasons;

	public void setFailReasons(List<IsvBizOpenOrderFailReason> failReasons) {
		this.failReasons = failReasons;
	}
	public List<IsvBizOpenOrderFailReason> getFailReasons( ) {
		return this.failReasons;
	}

}
