package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 匿名复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-03-07 11:00:02
 */
public class RainysComplexRefFirst extends AlipayObject {

	private static final long serialVersionUID = 2889521748284622432L;

	/**
	 * 子参数
	 */
	@ApiField("case_string")
	private String caseString;

	public String getCaseString() {
		return this.caseString;
	}
	public void setCaseString(String caseString) {
		this.caseString = caseString;
	}

}
