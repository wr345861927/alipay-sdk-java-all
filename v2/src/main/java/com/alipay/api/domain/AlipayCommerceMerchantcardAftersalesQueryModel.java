package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后详情查询
 *
 * @author auto create
 * @since 1.0, 2025-06-17 15:47:28
 */
public class AlipayCommerceMerchantcardAftersalesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1587422171972751155L;

	/**
	 * 查询订单详情或者列表的返回数据中的aftersales_id
	 */
	@ApiField("aftersales_id")
	private String aftersalesId;

	/**
	 * 下单成功后的卡编号
	 */
	@ApiField("card_id")
	private String cardId;

	public String getAftersalesId() {
		return this.aftersalesId;
	}
	public void setAftersalesId(String aftersalesId) {
		this.aftersalesId = aftersalesId;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

}
