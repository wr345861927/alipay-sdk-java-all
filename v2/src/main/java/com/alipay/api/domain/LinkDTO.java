package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 链接
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:19:31
 */
public class LinkDTO extends AlipayObject {

	private static final long serialVersionUID = 7518226742384395252L;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 链接地址
	 */
	@ApiField("url")
	private String url;

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
