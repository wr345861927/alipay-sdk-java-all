package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建门店提交leads作业接口
 *
 * @author auto create
 * @since 1.0, 2025-04-01 17:14:18
 */
public class AlipayCommerceOperationOpportunityLeadsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5537567984938719811L;

	/**
	 * 业务主体
	 */
	@ApiField("biz_entity_info")
	private BizEntityInfo bizEntityInfo;

	/**
	 * 收银机+小白盒收银：可铺设N5/N6
收银机+扫码枪：可铺设N5/N6
手持pos-不铺设：拦截
收款码-不铺设：拦截
	 */
	@ApiListField("cashier_info")
	@ApiField("bs_cashier_info")
	private List<BsCashierInfo> cashierInfo;

	/**
	 * 证照信息
	 */
	@ApiField("certificate_info")
	private BsCertificateInfo certificateInfo;

	/**
	 * 定义联系人关联信息对象
	 */
	@ApiField("contact_person_info")
	private BsContactPersonInfo contactPersonInfo;

	/**
	 * 补充材料
● 意愿确认单
	 */
	@ApiField("extra_credentials")
	private BsExtraCredentials extraCredentials;

	/**
	 * 门店关联的支付宝类目
	 */
	@ApiField("mcc_info")
	private BsMccInfo mccInfo;

	/**
	 * 商机ID
	 */
	@ApiField("opportunity_id")
	private String opportunityId;

	/**
	 * 外部业务流水号（业务申请编号；业务自定义，保证唯一）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 一笔支付宝交易单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 服务设备提报给支付宝的门店信息
	 */
	@ApiField("shop_info")
	private BsShopInfoDetail shopInfo;

	public BizEntityInfo getBizEntityInfo() {
		return this.bizEntityInfo;
	}
	public void setBizEntityInfo(BizEntityInfo bizEntityInfo) {
		this.bizEntityInfo = bizEntityInfo;
	}

	public List<BsCashierInfo> getCashierInfo() {
		return this.cashierInfo;
	}
	public void setCashierInfo(List<BsCashierInfo> cashierInfo) {
		this.cashierInfo = cashierInfo;
	}

	public BsCertificateInfo getCertificateInfo() {
		return this.certificateInfo;
	}
	public void setCertificateInfo(BsCertificateInfo certificateInfo) {
		this.certificateInfo = certificateInfo;
	}

	public BsContactPersonInfo getContactPersonInfo() {
		return this.contactPersonInfo;
	}
	public void setContactPersonInfo(BsContactPersonInfo contactPersonInfo) {
		this.contactPersonInfo = contactPersonInfo;
	}

	public BsExtraCredentials getExtraCredentials() {
		return this.extraCredentials;
	}
	public void setExtraCredentials(BsExtraCredentials extraCredentials) {
		this.extraCredentials = extraCredentials;
	}

	public BsMccInfo getMccInfo() {
		return this.mccInfo;
	}
	public void setMccInfo(BsMccInfo mccInfo) {
		this.mccInfo = mccInfo;
	}

	public String getOpportunityId() {
		return this.opportunityId;
	}
	public void setOpportunityId(String opportunityId) {
		this.opportunityId = opportunityId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public BsShopInfoDetail getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(BsShopInfoDetail shopInfo) {
		this.shopInfo = shopInfo;
	}

}
