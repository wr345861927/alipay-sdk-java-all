package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce查询券审批接口
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:25:24
 */
public class AnttechOceanbaseObglobalSfcloudfeereductionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5592369493443244746L;

	/**
	 * 券申请id
	 */
	@ApiField("cloud_fee_reduction_id")
	private String cloudFeeReductionId;

	public String getCloudFeeReductionId() {
		return this.cloudFeeReductionId;
	}
	public void setCloudFeeReductionId(String cloudFeeReductionId) {
		this.cloudFeeReductionId = cloudFeeReductionId;
	}

}
