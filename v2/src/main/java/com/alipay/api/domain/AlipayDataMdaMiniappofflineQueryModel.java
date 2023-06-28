package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 杭州亚运大屏-左屏-一站通离线指标监控指标
 *
 * @author auto create
 * @since 1.0, 2023-06-14 12:13:02
 */
public class AlipayDataMdaMiniappofflineQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5464544844564276756L;

	/**
	 * 111
	 */
	@ApiField("use_pass")
	private String usePass;

	public String getUsePass() {
		return this.usePass;
	}
	public void setUsePass(String usePass) {
		this.usePass = usePass;
	}

}
