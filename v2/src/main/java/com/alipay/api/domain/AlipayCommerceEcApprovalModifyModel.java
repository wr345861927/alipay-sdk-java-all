package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改审批单
 *
 * @author auto create
 * @since 1.0, 2025-06-03 17:07:13
 */
public class AlipayCommerceEcApprovalModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5664139539932361959L;

	/**
	 * 申请结束时间
	 */
	@ApiField("apply_finish_time")
	private Date applyFinishTime;

	/**
	 * 申请单开始时间
	 */
	@ApiField("apply_start_time")
	private Date applyStartTime;

	/**
	 * 申请单状态
	 */
	@ApiField("approval_status")
	private String approvalStatus;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 审批单关联制度列表，当企业出资方式为企业出资且设置此字段非空时，会查询最优制度并发放额度至该最优制度关联的员工
	 */
	@ApiListField("institution_id_list")
	@ApiField("string")
	private List<String> institutionIdList;

	/**
	 * 外部平台审批单id
	 */
	@ApiField("platform_approval_id")
	private String platformApprovalId;

	/**
	 * 事由
	 */
	@ApiField("purpose")
	private String purpose;

	/**
	 * 同行人信息列表
	 */
	@ApiListField("traveler_list")
	@ApiField("approval_traveler_d_t_o")
	private List<ApprovalTravelerDTO> travelerList;

	/**
	 * 行程信息列表（传入覆盖修改）
	 */
	@ApiListField("trip_info_list")
	@ApiField("approval_trip_d_t_o")
	private List<ApprovalTripDTO> tripInfoList;

	public Date getApplyFinishTime() {
		return this.applyFinishTime;
	}
	public void setApplyFinishTime(Date applyFinishTime) {
		this.applyFinishTime = applyFinishTime;
	}

	public Date getApplyStartTime() {
		return this.applyStartTime;
	}
	public void setApplyStartTime(Date applyStartTime) {
		this.applyStartTime = applyStartTime;
	}

	public String getApprovalStatus() {
		return this.approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public List<String> getInstitutionIdList() {
		return this.institutionIdList;
	}
	public void setInstitutionIdList(List<String> institutionIdList) {
		this.institutionIdList = institutionIdList;
	}

	public String getPlatformApprovalId() {
		return this.platformApprovalId;
	}
	public void setPlatformApprovalId(String platformApprovalId) {
		this.platformApprovalId = platformApprovalId;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public List<ApprovalTravelerDTO> getTravelerList() {
		return this.travelerList;
	}
	public void setTravelerList(List<ApprovalTravelerDTO> travelerList) {
		this.travelerList = travelerList;
	}

	public List<ApprovalTripDTO> getTripInfoList() {
		return this.tripInfoList;
	}
	public void setTripInfoList(List<ApprovalTripDTO> tripInfoList) {
		this.tripInfoList = tripInfoList;
	}

}
