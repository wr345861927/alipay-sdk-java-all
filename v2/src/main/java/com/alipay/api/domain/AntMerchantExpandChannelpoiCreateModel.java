package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁门店进件数字化门店
 *
 * @author auto create
 * @since 1.0, 2026-03-26 19:37:44
 */
public class AntMerchantExpandChannelpoiCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5648272688845331463L;

	/**
	 * 数字化门店信息
	 */
	@ApiField("digital_poi")
	private DigitalPoi digitalPoi;

	/**
	 * null
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public DigitalPoi getDigitalPoi() {
		return this.digitalPoi;
	}
	public void setDigitalPoi(DigitalPoi digitalPoi) {
		this.digitalPoi = digitalPoi;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
