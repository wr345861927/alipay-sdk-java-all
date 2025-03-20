package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工商企业所属行业信息
 *
 * @author auto create
 * @since 1.0, 2025-03-07 15:17:20
 */
public class EpIndustryModel extends AlipayObject {

	private static final long serialVersionUID = 6359888256725856591L;

	/**
	 * 所属行业
	 */
	@ApiField("industry_desc")
	private String industryDesc;

	public String getIndustryDesc() {
		return this.industryDesc;
	}
	public void setIndustryDesc(String industryDesc) {
		this.industryDesc = industryDesc;
	}

}
