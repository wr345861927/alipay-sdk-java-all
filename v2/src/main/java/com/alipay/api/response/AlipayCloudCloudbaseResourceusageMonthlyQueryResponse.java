package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MonthlyUsage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourceusage.monthly.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-11 11:49:33
 */
public class AlipayCloudCloudbaseResourceusageMonthlyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8897239985789871711L;

	/** 
	 * 各计费项用量列表
	 */
	@ApiListField("monthly_usages")
	@ApiField("monthly_usage")
	private List<MonthlyUsage> monthlyUsages;

	public void setMonthlyUsages(List<MonthlyUsage> monthlyUsages) {
		this.monthlyUsages = monthlyUsages;
	}
	public List<MonthlyUsage> getMonthlyUsages( ) {
		return this.monthlyUsages;
	}

}
