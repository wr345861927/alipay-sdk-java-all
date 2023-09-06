package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取外部账号绑定信息
 *
 * @author auto create
 * @since 1.0, 2023-08-08 13:43:35
 */
public class AlipayCloudCloudbaseExternalaccountBindGetModel extends AlipayObject {

	private static final long serialVersionUID = 1769391441968333946L;

	/**
	 * 服务商账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

}
