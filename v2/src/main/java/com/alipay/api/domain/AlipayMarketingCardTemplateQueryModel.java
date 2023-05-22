package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板查询接口
 *
 * @author auto create
 * @since 1.0, 2023-05-16 13:50:49
 */
public class AlipayMarketingCardTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2825968696382886323L;

	/**
	 * 会员卡模板id。调用alipay.marketing.card.template.create（会员卡模板创建接口）创建模板后同步返回。
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
