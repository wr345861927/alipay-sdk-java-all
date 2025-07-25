package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取本地商品模板信息
 *
 * @author auto create
 * @since 1.0, 2025-05-20 19:30:17
 */
public class AlipayOpenAppLocalitemTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3555311557184618878L;

	/**
	 * 平台类目，填写的类目必须在类目表列出，只填最后一级。商品类目 ID 及信息可通过商品类目表获取。
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
