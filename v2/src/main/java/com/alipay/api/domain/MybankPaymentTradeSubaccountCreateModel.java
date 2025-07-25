package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子账户开通
 *
 * @author auto create
 * @since 1.0, 2021-11-26 13:52:07
 */
public class MybankPaymentTradeSubaccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2277312689714937213L;

	/**
	 * 账户名称，不传默认使用母户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 币种，默认(CNY)
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/**
	 * 外部渠道ID，业务幂等字段
支付宝场景传入支付宝2088
天猫和集团场景传入memberId
	 */
	@ApiField("out_channel_id")
	private String outChannelId;

	/**
	 * 外部渠道类型
支付宝：ALIPW3CN
 天猫：TMALL
淘宝：TAOBAO
	 */
	@ApiField("out_channel_type")
	private String outChannelType;

	/**
	 * 母户账户名称，会根据卡号进行户名校验，不传不校验
	 */
	@ApiField("parent_account_name")
	private String parentAccountName;

	/**
	 * 母户账户类型，例如SETTLE_ACCOUNT(结算账户)
	 */
	@ApiField("parent_account_type")
	private String parentAccountType;

	/**
	 * 母户卡号，一般为结算户/二类户卡号
	 */
	@ApiField("parent_card_no")
	private String parentCardNo;

	/**
	 * 请求流水号，表示外部一次请求，幂等字段
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 场景码，网商银行提供
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCurrencyValue() {
		return this.currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

	public String getOutChannelId() {
		return this.outChannelId;
	}
	public void setOutChannelId(String outChannelId) {
		this.outChannelId = outChannelId;
	}

	public String getOutChannelType() {
		return this.outChannelType;
	}
	public void setOutChannelType(String outChannelType) {
		this.outChannelType = outChannelType;
	}

	public String getParentAccountName() {
		return this.parentAccountName;
	}
	public void setParentAccountName(String parentAccountName) {
		this.parentAccountName = parentAccountName;
	}

	public String getParentAccountType() {
		return this.parentAccountType;
	}
	public void setParentAccountType(String parentAccountType) {
		this.parentAccountType = parentAccountType;
	}

	public String getParentCardNo() {
		return this.parentCardNo;
	}
	public void setParentCardNo(String parentCardNo) {
		this.parentCardNo = parentCardNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
