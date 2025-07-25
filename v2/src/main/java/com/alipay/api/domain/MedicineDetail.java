package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗健康权益包查询镁信药品明细数据结构
 *
 * @author auto create
 * @since 1.0, 2025-02-25 14:50:21
 */
public class MedicineDetail extends AlipayObject {

	private static final long serialVersionUID = 4528667824427232288L;

	/**
	 * 药品说明
	 */
	@ApiField("description")
	private String description;

	/**
	 * xx药品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 药品图片url
	 */
	@ApiField("image")
	private String image;

	/**
	 * 药品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 价格25.99元
	 */
	@ApiField("original_price")
	private String originalPrice;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

}
