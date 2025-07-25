package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品信息返回值
 *
 * @author auto create
 * @since 1.0, 2023-08-18 17:27:28
 */
public class PrizeResponse extends AlipayObject {

	private static final long serialVersionUID = 4425967525192319754L;

	/**
	 * 奖品预算
	 */
	@ApiField("prize_budget")
	private String prizeBudget;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品价格、单位元、请使用正整数
	 */
	@ApiField("prize_price")
	private String prizePrice;

	public String getPrizeBudget() {
		return this.prizeBudget;
	}
	public void setPrizeBudget(String prizeBudget) {
		this.prizeBudget = prizeBudget;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizePrice() {
		return this.prizePrice;
	}
	public void setPrizePrice(String prizePrice) {
		this.prizePrice = prizePrice;
	}

}
