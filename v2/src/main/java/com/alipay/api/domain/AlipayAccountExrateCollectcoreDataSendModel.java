package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融信息受理接口
 *
 * @author auto create
 * @since 1.0, 2024-09-04 11:54:15
 */
public class AlipayAccountExrateCollectcoreDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 8375656219637841729L;

	/**
	 * 上数提交数据内容
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
