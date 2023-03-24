package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PosDishCookModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.cooklist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 07:18:38
 */
public class KoubeiCateringPosCooklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7432533978381697575L;

	/** 
	 * 菜谱列表
	 */
	@ApiListField("cook_models")
	@ApiField("pos_dish_cook_model")
	private List<PosDishCookModel> cookModels;

	public void setCookModels(List<PosDishCookModel> cookModels) {
		this.cookModels = cookModels;
	}
	public List<PosDishCookModel> getCookModels( ) {
		return this.cookModels;
	}

}
