package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CityShopModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-17 16:45:19
 */
public class KoubeiMerchantShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3363262473593314871L;

	/** 
	 * 根据商户pid查询门店模型列表
	 */
	@ApiListField("city_shop_models")
	@ApiField("city_shop_model")
	private List<CityShopModel> cityShopModels;

	public void setCityShopModels(List<CityShopModel> cityShopModels) {
		this.cityShopModels = cityShopModels;
	}
	public List<CityShopModel> getCityShopModels( ) {
		return this.cityShopModels;
	}

}
