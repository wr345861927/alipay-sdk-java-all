package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.roomrent.direct.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-20 19:28:21
 */
public class AlipayOpenAppRoomrentDirectModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8661576746189668594L;

	/** 
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 要求 APPID 下全局唯一
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}
	public String getOutItemId( ) {
		return this.outItemId;
	}

}
