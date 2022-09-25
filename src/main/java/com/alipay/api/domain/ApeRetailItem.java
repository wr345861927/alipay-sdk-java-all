package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 本地零售商品
 *
 * @author auto create
 * @since 1.0, 2022-09-20 15:33:49
 */
public class ApeRetailItem extends AlipayObject {

	private static final long serialVersionUID = 5661568287264136763L;

	/**
	 * 商品可售时间
	 */
	@ApiListField("available_times")
	@ApiField("string")
	private List<String> availableTimes;

	/**
	 * 品牌名
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 支付宝小程序的商品详情页面
	 */
	@ApiField("buy_url")
	private String buyUrl;

	/**
	 * 商品不同级类目之间用$##$分隔，且自左向右类目层级逐渐细化。类目值推荐全部传名称，举例如“家电$##$电视$##$OLED电视”。某一段为空时直接传空字符串，如第二段为空， 则传“家电$##$$##$OLED电视”。如果有多个类目，多个类目之间用,分割。
	 */
	@ApiField("cate")
	private String cate;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品唯一id，即spu_id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商户角色id，同步蚂蚁门店时的pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 需要公域推广，默认情况下为false
	 */
	@ApiField("need_public_promo")
	private Boolean needPublicPromo;

	/**
	 * 商品详情的图片列表
	 */
	@ApiListField("pic_url_list")
	@ApiField("string")
	private List<String> picUrlList;

	/**
	 * 商品的logo图片列表，可用于公域推广对用户展示的图片，建议600*600
	 */
	@ApiListField("promo_pic_url_list")
	@ApiField("string")
	private List<String> promoPicUrlList;

	/**
	 * 数据类型
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 支付宝侧的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * sku信息
	 */
	@ApiListField("sku_list")
	@ApiField("ape_sku_info")
	private List<ApeSkuInfo> skuList;

	/**
	 * 状态，1为有效、0为无效
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 商家侧的门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 商品标签，如首页展示标签“特惠”，“热卖”,或详情页“满50包邮”,“假一赔三”等。多值示例：“特惠,热卖"
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public List<String> getAvailableTimes() {
		return this.availableTimes;
	}
	public void setAvailableTimes(List<String> availableTimes) {
		this.availableTimes = availableTimes;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBuyUrl() {
		return this.buyUrl;
	}
	public void setBuyUrl(String buyUrl) {
		this.buyUrl = buyUrl;
	}

	public String getCate() {
		return this.cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}

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

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public Boolean getNeedPublicPromo() {
		return this.needPublicPromo;
	}
	public void setNeedPublicPromo(Boolean needPublicPromo) {
		this.needPublicPromo = needPublicPromo;
	}

	public List<String> getPicUrlList() {
		return this.picUrlList;
	}
	public void setPicUrlList(List<String> picUrlList) {
		this.picUrlList = picUrlList;
	}

	public List<String> getPromoPicUrlList() {
		return this.promoPicUrlList;
	}
	public void setPromoPicUrlList(List<String> promoPicUrlList) {
		this.promoPicUrlList = promoPicUrlList;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<ApeSkuInfo> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<ApeSkuInfo> skuList) {
		this.skuList = skuList;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
