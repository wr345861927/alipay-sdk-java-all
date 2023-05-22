package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AmpeProductInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.devicemodel.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:56:16
 */
public class AlipayOpenMiniAmpeDevicemodelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1299752369594496315L;

	/** 
	 * 产品机型列表
	 */
	@ApiField("product_info")
	private AmpeProductInfo productInfo;

	public void setProductInfo(AmpeProductInfo productInfo) {
		this.productInfo = productInfo;
	}
	public AmpeProductInfo getProductInfo( ) {
		return this.productInfo;
	}

}
