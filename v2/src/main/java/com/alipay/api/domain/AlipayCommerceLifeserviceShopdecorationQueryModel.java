package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店装修信息查询
 *
 * @author auto create
 * @since 1.0, 2026-02-09 14:37:44
 */
public class AlipayCommerceLifeserviceShopdecorationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2889753871787394882L;

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
