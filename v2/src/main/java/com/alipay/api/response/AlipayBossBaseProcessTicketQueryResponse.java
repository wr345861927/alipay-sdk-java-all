package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiTicket;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.ticket.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:47:24
 */
public class AlipayBossBaseProcessTicketQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2898181868718615277L;

	/** 
	 * 工单详情
	 */
	@ApiField("ticket")
	private BPOpenApiTicket ticket;

	public void setTicket(BPOpenApiTicket ticket) {
		this.ticket = ticket;
	}
	public BPOpenApiTicket getTicket( ) {
		return this.ticket;
	}

}
