package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物险查询档案列表信息
 *
 * @author auto create
 * @since 1.0, 2022-10-10 16:23:41
 */
public class AlipayInsSceneInsassetprodPetprofilelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3753361345531276274L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
