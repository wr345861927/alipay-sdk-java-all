package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集卡lm商品删除同步
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:04:45
 */
public class AlipayOfflineMarketingAiplayfieldbusItemdeleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3493749768795314432L;

	/**
	 * 业务标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 商品列表
	 */
	@ApiField("item_list")
	private String itemList;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getItemList() {
		return this.itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
