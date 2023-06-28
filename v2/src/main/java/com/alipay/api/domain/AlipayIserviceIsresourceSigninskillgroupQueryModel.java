package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询可签入技能组列表
 *
 * @author auto create
 * @since 1.0, 2023-05-26 10:39:45
 */
public class AlipayIserviceIsresourceSigninskillgroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7114348331792713621L;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 星云用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
