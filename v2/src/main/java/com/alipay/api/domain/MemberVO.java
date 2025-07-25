package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MemberVO
 *
 * @author auto create
 * @since 1.0, 2024-12-26 21:12:26
 */
public class MemberVO extends AlipayObject {

	private static final long serialVersionUID = 5365284126994742294L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 是否绑定好大夫服务，0：未绑定，1：已绑定
	 */
	@ApiField("binding_hdf_service")
	private String bindingHdfService;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 出生日期
	 */
	@ApiField("member_birthday")
	private String memberBirthday;

	/**
	 * 证件类型 01-身份证
	 */
	@ApiField("member_cert_type")
	private String memberCertType;

	/**
	 * 家庭成员性别  MALE:男 FEMALE:女
	 */
	@ApiField("member_gender")
	private String memberGender;

	/**
	 * 支付宝家庭成员id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 证件号
	 */
	@ApiField("member_id_no")
	private String memberIdNo;

	/**
	 * 家庭成员姓名
	 */
	@ApiField("member_name")
	private String memberName;

	/**
	 * 手机号
	 */
	@ApiField("member_phone_no")
	private String memberPhoneNo;

	/**
	 * 外部家庭成员id
	 */
	@ApiField("out_member_id")
	private String outMemberId;

	/**
	 * 关系 myself：本人、parent：父母、 child：子女、spouse：配偶、friend_relative：亲朋、other：其他
	 */
	@ApiField("rel")
	private String rel;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBindingHdfService() {
		return this.bindingHdfService;
	}
	public void setBindingHdfService(String bindingHdfService) {
		this.bindingHdfService = bindingHdfService;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getMemberBirthday() {
		return this.memberBirthday;
	}
	public void setMemberBirthday(String memberBirthday) {
		this.memberBirthday = memberBirthday;
	}

	public String getMemberCertType() {
		return this.memberCertType;
	}
	public void setMemberCertType(String memberCertType) {
		this.memberCertType = memberCertType;
	}

	public String getMemberGender() {
		return this.memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberIdNo() {
		return this.memberIdNo;
	}
	public void setMemberIdNo(String memberIdNo) {
		this.memberIdNo = memberIdNo;
	}

	public String getMemberName() {
		return this.memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhoneNo() {
		return this.memberPhoneNo;
	}
	public void setMemberPhoneNo(String memberPhoneNo) {
		this.memberPhoneNo = memberPhoneNo;
	}

	public String getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(String outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getRel() {
		return this.rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}

}
