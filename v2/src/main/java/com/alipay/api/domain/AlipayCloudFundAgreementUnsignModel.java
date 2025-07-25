package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包代扣解约
 *
 * @author auto create
 * @since 1.0, 2024-06-11 11:41:42
 */
public class AlipayCloudFundAgreementUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 5844485673639856868L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ），如果传了该参数，其他参数会被忽略 。 本参数与 external_agreement_no 不可同时为空。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 用户的支付宝账号对应的支付宝唯一用户号，以2088 开头的 16 位纯数字组成
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 用户的支付宝账号对应的支付宝唯一用户号，以2088 开头的 16 位纯数字组成
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 代扣协议中标示用户的唯一签约号(确保在商户系统中 唯一)。 格式规则:支持大写小写字母和数字，最长 32 位。 注意：若调用 alipay.user.agreement.page.sign(支付宝个人协议页面签约接口) 签约时传入 external_agreement_no 则该值必填且需与签约接口传入值相同
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 仅异步解约需传入，其余情况无需传递本参数。
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 签约协议场景，该值需要与系统/页面签约接口调用时传入的值保持一 致。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public String getThirdPartyType() {
		return this.thirdPartyType;
	}
	public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

}
