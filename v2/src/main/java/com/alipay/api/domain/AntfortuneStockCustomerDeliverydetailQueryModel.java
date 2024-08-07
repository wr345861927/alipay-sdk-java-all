package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 证券用户投放内容详情查询
 *
 * @author auto create
 * @since 1.0, 2024-06-11 17:51:32
 */
public class AntfortuneStockCustomerDeliverydetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8217881988654455318L;

	/**
	 * 签约协议号（uid在某个机构处的唯一标识）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 待查询展位码列表、支持批量查询
	 */
	@ApiListField("position_code")
	@ApiField("string")
	private List<String> positionCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public List<String> getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(List<String> positionCode) {
		this.positionCode = positionCode;
	}

}
