package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分类信息
 *
 * @author auto create
 * @since 1.0, 2021-03-10 16:55:26
 */
public class CateInfo extends AlipayObject {

	private static final long serialVersionUID = 4312821113125449581L;

	/**
	 * 类目code
	 */
	@ApiField("cate_code")
	private String cateCode;

	/**
	 * 学段code
	 */
	@ApiField("stage_code")
	private String stageCode;

	public String getCateCode() {
		return this.cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}

	public String getStageCode() {
		return this.stageCode;
	}
	public void setStageCode(String stageCode) {
		this.stageCode = stageCode;
	}

}
