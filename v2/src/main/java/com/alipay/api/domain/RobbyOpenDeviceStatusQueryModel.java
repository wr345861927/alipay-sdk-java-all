package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机器人状态查询
 *
 * @author auto create
 * @since 1.0, 2026-01-29 19:44:51
 */
public class RobbyOpenDeviceStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4642217262174748784L;

	/**
	 * null
	 */
	@ApiListField("sn_list")
	@ApiField("string")
	private List<String> snList;

	public List<String> getSnList() {
		return this.snList;
	}
	public void setSnList(List<String> snList) {
		this.snList = snList;
	}

}
