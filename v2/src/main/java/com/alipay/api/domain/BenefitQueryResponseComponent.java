package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益召回组件
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:55
 */
public class BenefitQueryResponseComponent extends AlipayObject {

	private static final long serialVersionUID = 5437968128338284727L;

	/**
	 * 权益召回内容
	 */
	@ApiField("content")
	private BenefitQueryContent content;

	public BenefitQueryContent getContent() {
		return this.content;
	}
	public void setContent(BenefitQueryContent content) {
		this.content = content;
	}

}
