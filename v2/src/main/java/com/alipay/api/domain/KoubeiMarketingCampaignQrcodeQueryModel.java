package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑活动二维码查询接口
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:16:28
 */
public class KoubeiMarketingCampaignQrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2694453495154932853L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

}
