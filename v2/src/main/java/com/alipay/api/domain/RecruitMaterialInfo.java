package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名提交的素材
 *
 * @author auto create
 * @since 1.0, 2023-03-26 14:07:56
 */
public class RecruitMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 1714171548752268766L;

	/**
	 * 素材ID。
	 */
	@ApiField("material_id")
	private String materialId;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

}
