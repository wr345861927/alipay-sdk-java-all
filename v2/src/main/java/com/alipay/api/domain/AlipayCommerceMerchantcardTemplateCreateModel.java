package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版创建
 *
 * @author auto create
 * @since 1.0, 2024-12-12 19:24:18
 */
public class AlipayCommerceMerchantcardTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7172824599187125927L;

	/**
	 * 卡信息
	 */
	@ApiField("card_template")
	private MerchantCardTemplate cardTemplate;

	public MerchantCardTemplate getCardTemplate() {
		return this.cardTemplate;
	}
	public void setCardTemplate(MerchantCardTemplate cardTemplate) {
		this.cardTemplate = cardTemplate;
	}

}
