package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * crm人员信息回传海图
 *
 * @author auto create
 * @since 1.0, 2026-02-11 11:17:44
 */
public class AnttechOceanbaseObglobalEmployeeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3195611531688987522L;

	/**
	 * 员工身份
	 */
	@ApiField("employee_identity")
	private String employeeIdentity;

	/**
	 * 一级部门id
	 */
	@ApiField("first_dept_id")
	private String firstDeptId;

	/**
	 * 主属部门id
	 */
	@ApiField("main_dept_id")
	private String mainDeptId;

	/**
	 * 二级部门id
	 */
	@ApiField("second_dept_id")
	private String secondDeptId;

	/**
	 * 人员状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 姓名
	 */
	@ApiField("system_name")
	private String systemName;

	/**
	 * 三级部门id
	 */
	@ApiField("third_dept_id")
	private String thirdDeptId;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getEmployeeIdentity() {
		return this.employeeIdentity;
	}
	public void setEmployeeIdentity(String employeeIdentity) {
		this.employeeIdentity = employeeIdentity;
	}

	public String getFirstDeptId() {
		return this.firstDeptId;
	}
	public void setFirstDeptId(String firstDeptId) {
		this.firstDeptId = firstDeptId;
	}

	public String getMainDeptId() {
		return this.mainDeptId;
	}
	public void setMainDeptId(String mainDeptId) {
		this.mainDeptId = mainDeptId;
	}

	public String getSecondDeptId() {
		return this.secondDeptId;
	}
	public void setSecondDeptId(String secondDeptId) {
		this.secondDeptId = secondDeptId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSystemName() {
		return this.systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getThirdDeptId() {
		return this.thirdDeptId;
	}
	public void setThirdDeptId(String thirdDeptId) {
		this.thirdDeptId = thirdDeptId;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
