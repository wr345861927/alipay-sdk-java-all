package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 体检系统口袋医生在线问诊-人员信息查询
 *
 * @author auto create
 * @since 1.0, 2025-03-12 20:04:52
 */
public class AlipayDigitalmgmtHrhealthKdysPersoninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4321156759244955689L;

	/**
	 * 一般为带'-'的uuid
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * 钉钉免登码
	 */
	@ApiField("no_login_code")
	private String noLoginCode;

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public String getNoLoginCode() {
		return this.noLoginCode;
	}
	public void setNoLoginCode(String noLoginCode) {
		this.noLoginCode = noLoginCode;
	}

}
