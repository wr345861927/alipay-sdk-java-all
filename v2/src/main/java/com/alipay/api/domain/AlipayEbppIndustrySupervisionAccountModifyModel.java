package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专款账户交易属性信息修改
 *
 * @author auto create
 * @since 1.0, 2024-05-29 17:02:14
 */
public class AlipayEbppIndustrySupervisionAccountModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2294637753581627596L;

	/**
	 * 专款钱包场景下开设的子户户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 企业支付宝账户uid对应OpenID
	 */
	@ApiField("merchant_alipay_open_id")
	private String merchantAlipayOpenId;

	/**
	 * 企业支付宝账户uid
	 */
	@ApiField("merchant_alipay_uid")
	private String merchantAlipayUid;

	/**
	 * 专款钱包场景下钱包子户的收方客户类型， 对公账户需要填入收方账户联行号
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 当收方账户为对公账户，则需要填入收方账户联行号
	 */
	@ApiField("payee_contact_line")
	private String payeeContactLine;

	/**
	 * 收方账户ID
	 */
	@ApiField("payee_participant_id")
	private String payeeParticipantId;

	/**
	 * 收方账户名
	 */
	@ApiField("payee_participant_name")
	private String payeeParticipantName;

	/**
	 * 收方账户类型
	 */
	@ApiField("payee_participant_type")
	private String payeeParticipantType;

	/**
	 * 付方账户ID
	 */
	@ApiField("payer_participant_id")
	private String payerParticipantId;

	/**
	 * 付方账户名
	 */
	@ApiField("payer_participant_name")
	private String payerParticipantName;

	/**
	 * 付方账户类型
	 */
	@ApiField("payer_participant_type")
	private String payerParticipantType;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMerchantAlipayOpenId() {
		return this.merchantAlipayOpenId;
	}
	public void setMerchantAlipayOpenId(String merchantAlipayOpenId) {
		this.merchantAlipayOpenId = merchantAlipayOpenId;
	}

	public String getMerchantAlipayUid() {
		return this.merchantAlipayUid;
	}
	public void setMerchantAlipayUid(String merchantAlipayUid) {
		this.merchantAlipayUid = merchantAlipayUid;
	}

	public String getPayeeAccountType() {
		return this.payeeAccountType;
	}
	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

	public String getPayeeContactLine() {
		return this.payeeContactLine;
	}
	public void setPayeeContactLine(String payeeContactLine) {
		this.payeeContactLine = payeeContactLine;
	}

	public String getPayeeParticipantId() {
		return this.payeeParticipantId;
	}
	public void setPayeeParticipantId(String payeeParticipantId) {
		this.payeeParticipantId = payeeParticipantId;
	}

	public String getPayeeParticipantName() {
		return this.payeeParticipantName;
	}
	public void setPayeeParticipantName(String payeeParticipantName) {
		this.payeeParticipantName = payeeParticipantName;
	}

	public String getPayeeParticipantType() {
		return this.payeeParticipantType;
	}
	public void setPayeeParticipantType(String payeeParticipantType) {
		this.payeeParticipantType = payeeParticipantType;
	}

	public String getPayerParticipantId() {
		return this.payerParticipantId;
	}
	public void setPayerParticipantId(String payerParticipantId) {
		this.payerParticipantId = payerParticipantId;
	}

	public String getPayerParticipantName() {
		return this.payerParticipantName;
	}
	public void setPayerParticipantName(String payerParticipantName) {
		this.payerParticipantName = payerParticipantName;
	}

	public String getPayerParticipantType() {
		return this.payerParticipantType;
	}
	public void setPayerParticipantType(String payerParticipantType) {
		this.payerParticipantType = payerParticipantType;
	}

}
