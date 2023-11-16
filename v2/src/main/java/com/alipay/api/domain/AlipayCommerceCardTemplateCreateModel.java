package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版创建
 *
 * @author auto create
 * @since 1.0, 2023-11-02 13:55:39
 */
public class AlipayCommerceCardTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1693778797565283658L;

	/**
	 * 卡模版信息
	 */
	@ApiField("card_template_info")
	private CardTemplateInfo cardTemplateInfo;

	public CardTemplateInfo getCardTemplateInfo() {
		return this.cardTemplateInfo;
	}
	public void setCardTemplateInfo(CardTemplateInfo cardTemplateInfo) {
		this.cardTemplateInfo = cardTemplateInfo;
	}

}
