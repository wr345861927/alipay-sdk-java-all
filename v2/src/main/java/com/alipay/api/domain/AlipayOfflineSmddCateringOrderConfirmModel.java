package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单确认接口
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:25
 */
public class AlipayOfflineSmddCateringOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4543457754485532419L;

	/**
	 * 买家唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 桌码拓展对象
	 */
	@ApiField("code_ext")
	private CodeExtBean codeExt;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public CodeExtBean getCodeExt() {
		return this.codeExt;
	}
	public void setCodeExt(CodeExtBean codeExt) {
		this.codeExt = codeExt;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
