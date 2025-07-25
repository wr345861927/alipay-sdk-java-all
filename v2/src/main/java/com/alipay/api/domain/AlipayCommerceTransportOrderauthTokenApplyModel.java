package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请出行行业订单授权Token
 *
 * @author auto create
 * @since 1.0, 2025-06-12 19:17:28
 */
public class AlipayCommerceTransportOrderauthTokenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3711887199996242255L;

	/**
	 * 16位支付宝小程序应用APPID，默认是当前调用方
	 */
	@ApiField("auth_appid")
	private String authAppid;

	/**
	 * 授权行业编码，由支付宝业务人员分配
	 */
	@ApiField("auth_industry")
	private String authIndustry;

	/**
	 * 额外参数
	 */
	@ApiField("ext_info")
	private AuthTokenApplyExtInfo extInfo;

	/**
	 * 身份证号码
	 */
	@ApiField("id_card_number")
	private String idCardNumber;

	/**
	 * 手机号码
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public String getAuthAppid() {
		return this.authAppid;
	}
	public void setAuthAppid(String authAppid) {
		this.authAppid = authAppid;
	}

	public String getAuthIndustry() {
		return this.authIndustry;
	}
	public void setAuthIndustry(String authIndustry) {
		this.authIndustry = authIndustry;
	}

	public AuthTokenApplyExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(AuthTokenApplyExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
