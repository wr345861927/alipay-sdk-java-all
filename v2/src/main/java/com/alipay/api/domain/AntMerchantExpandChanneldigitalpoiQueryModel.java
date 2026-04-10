package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 渠道进件数字化门店进度查询
 *
 * @author auto create
 * @since 1.0, 2026-03-26 19:37:44
 */
public class AntMerchantExpandChanneldigitalpoiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6653849687721846335L;

	/**
	 * 请求渠道，由后端技术分配
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * null
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
