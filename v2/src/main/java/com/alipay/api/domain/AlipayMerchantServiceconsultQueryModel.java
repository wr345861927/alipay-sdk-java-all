package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单条服务咨询详情
 *
 * @author auto create
 * @since 1.0, 2023-01-12 10:58:56
 */
public class AlipayMerchantServiceconsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2786152964188232665L;

	/**
	 * 支付宝侧服务咨询工单号
	 */
	@ApiField("consult_event_id")
	private String consultEventId;

	public String getConsultEventId() {
		return this.consultEventId;
	}
	public void setConsultEventId(String consultEventId) {
		this.consultEventId = consultEventId;
	}

}
