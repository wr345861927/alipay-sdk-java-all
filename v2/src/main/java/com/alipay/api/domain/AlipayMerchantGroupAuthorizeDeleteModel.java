package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除群授权记录
 *
 * @author auto create
 * @since 1.0, 2024-05-20 21:23:18
 */
public class AlipayMerchantGroupAuthorizeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6158454375528528535L;

	/**
	 * 授权记录id
	 */
	@ApiField("authorize_id")
	private String authorizeId;

	public String getAuthorizeId() {
		return this.authorizeId;
	}
	public void setAuthorizeId(String authorizeId) {
		this.authorizeId = authorizeId;
	}

}
