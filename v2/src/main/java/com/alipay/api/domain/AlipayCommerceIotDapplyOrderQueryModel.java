package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁iot进件申请单撤销接口
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:26:38
 */
public class AlipayCommerceIotDapplyOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5495155241216939268L;

	/**
	 * 物料申请单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	public String getAssetApplyOrderId() {
		return this.assetApplyOrderId;
	}
	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}

}
