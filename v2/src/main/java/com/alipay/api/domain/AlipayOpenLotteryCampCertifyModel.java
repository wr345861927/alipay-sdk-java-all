package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 天天抽奖-活动审批
 *
 * @author auto create
 * @since 1.0, 2020-01-07 19:36:30
 */
public class AlipayOpenLotteryCampCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 1826286984285172773L;

	/**
	 * 环境
	 */
	@ApiField("env")
	private String env;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}
