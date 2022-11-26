package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡商品扩展字段
 *
 * @author auto create
 * @since 1.0, 2022-05-19 20:31:27
 */
public class TimeCardItemExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 2171382696159331489L;

	/**
	 * 小程序跳转链接
	 */
	@ApiField("action_link")
	private String actionLink;

	/**
	 * 扩展描述
	 */
	@ApiField("ext_desc")
	private String extDesc;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getActionLink() {
		return this.actionLink;
	}
	public void setActionLink(String actionLink) {
		this.actionLink = actionLink;
	}

	public String getExtDesc() {
		return this.extDesc;
	}
	public void setExtDesc(String extDesc) {
		this.extDesc = extDesc;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
