package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁协议信息
 *
 * @author auto create
 * @since 1.0, 2023-05-23 15:30:25
 */
public class RentAgreementInfo extends AlipayObject {

	private static final long serialVersionUID = 5671192257576585893L;

	/**
	 * 租赁协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 资金委托授权协议，默认为空，特殊场景提供。
	 */
	@ApiField("deduct_agreement_no")
	private String deductAgreementNo;

	/**
	 * 用户脱敏登陆号
	 */
	@ApiField("rent_logon_id")
	private String rentLogonId;

	/**
	 * 租赁用户uid
	 */
	@ApiField("rent_user_id")
	private String rentUserId;

	/**
	 * 租赁用户openId
	 */
	@ApiField("rent_user_open_id")
	private String rentUserOpenId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getDeductAgreementNo() {
		return this.deductAgreementNo;
	}
	public void setDeductAgreementNo(String deductAgreementNo) {
		this.deductAgreementNo = deductAgreementNo;
	}

	public String getRentLogonId() {
		return this.rentLogonId;
	}
	public void setRentLogonId(String rentLogonId) {
		this.rentLogonId = rentLogonId;
	}

	public String getRentUserId() {
		return this.rentUserId;
	}
	public void setRentUserId(String rentUserId) {
		this.rentUserId = rentUserId;
	}

	public String getRentUserOpenId() {
		return this.rentUserOpenId;
	}
	public void setRentUserOpenId(String rentUserOpenId) {
		this.rentUserOpenId = rentUserOpenId;
	}

}
