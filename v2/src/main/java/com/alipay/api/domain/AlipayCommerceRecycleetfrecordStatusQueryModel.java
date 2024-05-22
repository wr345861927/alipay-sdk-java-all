package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETF申购状态查询
 *
 * @author auto create
 * @since 1.0, 2023-12-05 10:41:48
 */
public class AlipayCommerceRecycleetfrecordStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7298347735394412822L;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
