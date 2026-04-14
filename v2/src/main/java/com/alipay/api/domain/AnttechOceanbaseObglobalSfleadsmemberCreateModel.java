package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * salesforce新增项目组成员
 *
 * @author auto create
 * @since 1.0, 2026-04-14 14:26:22
 */
public class AnttechOceanbaseObglobalSfleadsmemberCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8812624817847553761L;

	/**
	 * 提供给SalesForce创建项目组成员入参
	 */
	@ApiField("salesforce_create_leads_member_request")
	private SaleForceLeadsMemberCreateDTO salesforceCreateLeadsMemberRequest;

	public SaleForceLeadsMemberCreateDTO getSalesforceCreateLeadsMemberRequest() {
		return this.salesforceCreateLeadsMemberRequest;
	}
	public void setSalesforceCreateLeadsMemberRequest(SaleForceLeadsMemberCreateDTO salesforceCreateLeadsMemberRequest) {
		this.salesforceCreateLeadsMemberRequest = salesforceCreateLeadsMemberRequest;
	}

}
