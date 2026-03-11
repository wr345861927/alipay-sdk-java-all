package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店预约配置查询
 *
 * @author auto create
 * @since 1.0, 2026-03-06 16:32:45
 */
public class AlipayCommerceLifeserviceShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2856975622334386559L;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
