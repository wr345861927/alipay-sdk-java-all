package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵活用工团单批改信息查询
 *
 * @author auto create
 * @since 1.0, 2023-10-25 16:36:54
 */
public class AlipayInsSceneCommonGroupendorseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6812677391154492523L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 渠道
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 主批单号
	 */
	@ApiField("summary_endorse_order_no")
	private String summaryEndorseOrderNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSummaryEndorseOrderNo() {
		return this.summaryEndorseOrderNo;
	}
	public void setSummaryEndorseOrderNo(String summaryEndorseOrderNo) {
		this.summaryEndorseOrderNo = summaryEndorseOrderNo;
	}

}
