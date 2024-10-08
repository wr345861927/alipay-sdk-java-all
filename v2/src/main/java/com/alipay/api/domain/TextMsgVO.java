package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本消息模型
 *
 * @author auto create
 * @since 1.0, 2024-05-27 20:03:13
 */
public class TextMsgVO extends AlipayObject {

	private static final long serialVersionUID = 4262161746168688632L;

	/**
	 * 文本消息内容
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
