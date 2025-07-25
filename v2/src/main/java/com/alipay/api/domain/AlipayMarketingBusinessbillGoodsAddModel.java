package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营收款单商品新增
 *
 * @author auto create
 * @since 1.0, 2025-04-15 14:33:34
 */
public class AlipayMarketingBusinessbillGoodsAddModel extends AlipayObject {

	private static final long serialVersionUID = 6639391491296257943L;

	/**
	 * 支付宝分配的场景编码
	 */
	@ApiField("activity_scene")
	private String activityScene;

	/**
	 * 商品一级分类，按品类维护，用于收款单内选商品时商品分组使用
	 */
	@ApiField("category")
	private String category;

	/**
	 * 能效等级
	 */
	@ApiField("energy_efficiency_level")
	private String energyEfficiencyLevel;

	/**
	 * 商品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 商品型号
	 */
	@ApiField("goods_model_number")
	private String goodsModelNumber;

	/**
	 * 商品名称
	 */
	@ApiField("goods_title")
	private String goodsTitle;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识，商户uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商品价格，单位:元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 二级分类；按品牌维护，用于收款单内选商品时商品分组使用
	 */
	@ApiField("sub_category")
	private String subCategory;

	/**
	 * 支付宝商家用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityScene() {
		return this.activityScene;
	}
	public void setActivityScene(String activityScene) {
		this.activityScene = activityScene;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getEnergyEfficiencyLevel() {
		return this.energyEfficiencyLevel;
	}
	public void setEnergyEfficiencyLevel(String energyEfficiencyLevel) {
		this.energyEfficiencyLevel = energyEfficiencyLevel;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsModelNumber() {
		return this.goodsModelNumber;
	}
	public void setGoodsModelNumber(String goodsModelNumber) {
		this.goodsModelNumber = goodsModelNumber;
	}

	public String getGoodsTitle() {
		return this.goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSubCategory() {
		return this.subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
