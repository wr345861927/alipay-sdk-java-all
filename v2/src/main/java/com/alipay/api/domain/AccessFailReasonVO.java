package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务不可选理由
 *
 * @author auto create
 * @since 1.0, 2024-01-25 21:09:56
 */
public class AccessFailReasonVO extends AlipayObject {

	private static final long serialVersionUID = 7533538291193537857L;

	/**
	 * 一般为引导商户修改账号配置的链接
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 用于对客展示功能无法使用的原因
	 */
	@ApiField("reason_text")
	private String reasonText;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getReasonText() {
		return this.reasonText;
	}
	public void setReasonText(String reasonText) {
		this.reasonText = reasonText;
	}

}
