package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二级回收商代扣关系查询
 *
 * @author auto create
 * @since 1.0, 2025-06-25 14:57:05
 */
public class AlipayCommerceRecycleDeductRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1859552473617479172L;

	/**
	 * 二级商户pid
	 */
	@ApiField("second_merchant_open_id")
	private String secondMerchantOpenId;

	/**
	 * 二级商户pid
	 */
	@ApiField("second_merchant_pid")
	private String secondMerchantPid;

	public String getSecondMerchantOpenId() {
		return this.secondMerchantOpenId;
	}
	public void setSecondMerchantOpenId(String secondMerchantOpenId) {
		this.secondMerchantOpenId = secondMerchantOpenId;
	}

	public String getSecondMerchantPid() {
		return this.secondMerchantPid;
	}
	public void setSecondMerchantPid(String secondMerchantPid) {
		this.secondMerchantPid = secondMerchantPid;
	}

}
