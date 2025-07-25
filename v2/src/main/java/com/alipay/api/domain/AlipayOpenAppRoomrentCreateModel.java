package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租房商品创建接口
 *
 * @author auto create
 * @since 1.0, 2025-06-13 10:18:14
 */
public class AlipayOpenAppRoomrentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1774231311926943819L;

	/**
	 * 通过alipay.open.app.localitem.template.query获取本地商品模板信息接口得到商品属性key，is_required=1时属性必填
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/**
	 * 商品提报，如果需要自动推广则传此参数true，如没有这需求传false
	 */
	@ApiField("auto_marketing_delivery")
	private Boolean autoMarketingDelivery;

	/**
	 * 可通过alipay.open.app.localitem.allcategory.query接口获取
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 展示在商品详情页的轮播图中，图片宽高为750px*750px，宽高比1:1，800kb以内。支持jpg、jpeg、png格式的图片。
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 要求 APPID 下全局唯一
	 */
	@ApiField("out_item_id")
	private String outItemId;

	public List<AppItemAttrVO> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<AppItemAttrVO> attrs) {
		this.attrs = attrs;
	}

	public Boolean getAutoMarketingDelivery() {
		return this.autoMarketingDelivery;
	}
	public void setAutoMarketingDelivery(Boolean autoMarketingDelivery) {
		this.autoMarketingDelivery = autoMarketingDelivery;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

}
