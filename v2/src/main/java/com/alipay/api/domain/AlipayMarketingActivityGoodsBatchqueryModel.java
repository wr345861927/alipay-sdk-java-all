package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询券可用单品
 *
 * @author auto create
 * @since 1.0, 2023-11-03 11:13:53
 */
public class AlipayMarketingActivityGoodsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5266717815596621174L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动单品类型。
	 */
	@ApiField("goods_use_type")
	private String goodsUseType;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 商户PID,默认为当前接口调用商户。
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 分页查询页码。
限制:
必须为大于0的整数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页数据条数。
限制:
1.必须为大于0的整数
2.每页最大值为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 版本号

枚举值:
2.0.0
	 */
	@ApiField("product_version")
	private String productVersion;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getGoodsUseType() {
		return this.goodsUseType;
	}
	public void setGoodsUseType(String goodsUseType) {
		this.goodsUseType = goodsUseType;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductVersion() {
		return this.productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
