package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetproduce.complete.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-13 23:33:12
 */
public class AntMerchantExpandAssetproduceCompleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4289116537447245719L;

	/** 
	 * 物料订单更新结果信息
	 */
	@ApiListField("asset_results")
	@ApiField("asset_result")
	private List<AssetResult> assetResults;

	public void setAssetResults(List<AssetResult> assetResults) {
		this.assetResults = assetResults;
	}
	public List<AssetResult> getAssetResults( ) {
		return this.assetResults;
	}

}
