package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetinfo.produce.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:54:11
 */
public class AntMerchantExpandAssetinfoProduceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6811741555485632151L;

	/** 
	 * 物料信息反馈处理结果
	 */
	@ApiListField("info_results")
	@ApiField("asset_result")
	private List<AssetResult> infoResults;

	public void setInfoResults(List<AssetResult> infoResults) {
		this.infoResults = infoResults;
	}
	public List<AssetResult> getInfoResults( ) {
		return this.infoResults;
	}

}
