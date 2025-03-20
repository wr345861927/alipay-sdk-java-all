package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收商品同步服务
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:26
 */
public class AlipayCommerceRecycleItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3832634958468712144L;

	/**
	 * 回收商进行产品（商品）变更时需要传入唯一的流水号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 产品code，用来描述商品的SPU_ID
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * null
	 */
	@ApiListField("skus")
	@ApiField("recycle_sku_d_t_o")
	private List<RecycleSkuDTO> skus;

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<RecycleSkuDTO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<RecycleSkuDTO> skus) {
		this.skus = skus;
	}

}
