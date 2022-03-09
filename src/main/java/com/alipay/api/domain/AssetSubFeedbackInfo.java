package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AssetSubFeedbackInfo 存放子信息
 *
 * @author auto create
 * @since 1.0, 2020-12-21 14:24:59
 */
public class AssetSubFeedbackInfo extends AlipayObject {

	private static final long serialVersionUID = 2352482911991517264L;

	/**
	 * 返回的信息code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 返回值的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 具体的值，例如SN号
	 */
	@ApiField("value")
	private String value;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
