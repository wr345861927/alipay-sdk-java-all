package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻分分段
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:52:40
 */
public class AlipayZmScoreZrankResult extends AlipayObject {

	private static final long serialVersionUID = 1565326184692286294L;

	/**
	 * 芝麻分分段 Z0-Z7
	 */
	@ApiField("zrank")
	private String zrank;

	public String getZrank() {
		return this.zrank;
	}
	public void setZrank(String zrank) {
		this.zrank = zrank;
	}

}
