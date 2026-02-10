package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-02-10 14:22:43
 */
public class BizInfoMap extends AlipayObject {

	private static final long serialVersionUID = 2525225221635288737L;

	/**
	 * 业务对象的数量
	 */
	@ApiField("biz_count")
	private Long bizCount;

	/**
	 * 业务对象标识，如药品 ID，69 码等
	 */
	@ApiField("biz_object_no")
	private String bizObjectNo;

	public Long getBizCount() {
		return this.bizCount;
	}
	public void setBizCount(Long bizCount) {
		this.bizCount = bizCount;
	}

	public String getBizObjectNo() {
		return this.bizObjectNo;
	}
	public void setBizObjectNo(String bizObjectNo) {
		this.bizObjectNo = bizObjectNo;
	}

}
