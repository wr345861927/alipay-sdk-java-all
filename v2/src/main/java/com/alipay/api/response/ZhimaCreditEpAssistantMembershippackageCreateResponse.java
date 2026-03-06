package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssistantLicenseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.membershippackage.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-03 15:12:44
 */
public class ZhimaCreditEpAssistantMembershippackageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6152652613168579623L;

	/** 
	 * null
	 */
	@ApiListField("license_detail_list")
	@ApiField("assistant_license_info")
	private List<AssistantLicenseInfo> licenseDetailList;

	/** 
	 * null
	 */
	@ApiListField("licenses")
	@ApiField("string")
	private List<String> licenses;

	/** 
	 * 会员包编码
	 */
	@ApiField("package_id")
	private String packageId;

	public void setLicenseDetailList(List<AssistantLicenseInfo> licenseDetailList) {
		this.licenseDetailList = licenseDetailList;
	}
	public List<AssistantLicenseInfo> getLicenseDetailList( ) {
		return this.licenseDetailList;
	}

	public void setLicenses(List<String> licenses) {
		this.licenses = licenses;
	}
	public List<String> getLicenses( ) {
		return this.licenses;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getPackageId( ) {
		return this.packageId;
	}

}
