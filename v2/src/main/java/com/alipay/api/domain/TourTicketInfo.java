package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-02 15:07:45
 */
public class TourTicketInfo extends AlipayObject {

	private static final long serialVersionUID = 7464484726971597949L;

	/**
	 * 门票信息
	 */
	@ApiField("ticket_name")
	private String ticketName;

	/**
	 * 门票价格 分
	 */
	@ApiField("ticket_price")
	private String ticketPrice;

	/**
	 * 门票适用人群
	 */
	@ApiField("ticket_target_audience")
	private String ticketTargetAudience;

	public String getTicketName() {
		return this.ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	public String getTicketPrice() {
		return this.ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getTicketTargetAudience() {
		return this.ticketTargetAudience;
	}
	public void setTicketTargetAudience(String ticketTargetAudience) {
		this.ticketTargetAudience = ticketTargetAudience;
	}

}
