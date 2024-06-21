package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProductSaleInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.itemstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 11:47:04
 */
public class AlipayCloudCloudpromoMallItemstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6543346739535752664L;

	/** 
	 * 商品售卖信息
	 */
	@ApiListField("product_sale_infos")
	@ApiField("product_sale_info_v_o")
	private List<ProductSaleInfoVO> productSaleInfos;

	public void setProductSaleInfos(List<ProductSaleInfoVO> productSaleInfos) {
		this.productSaleInfos = productSaleInfos;
	}
	public List<ProductSaleInfoVO> getProductSaleInfos( ) {
		return this.productSaleInfos;
	}

}
