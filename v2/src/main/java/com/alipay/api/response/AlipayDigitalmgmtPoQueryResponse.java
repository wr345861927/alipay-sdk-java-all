package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PurchaseOrderOutDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.po.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-29 12:10:15
 */
public class AlipayDigitalmgmtPoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8797677338867887817L;

	/** 
	 * 采购订单信息
	 */
	@ApiListField("purchase_order_list")
	@ApiField("purchase_order_out_d_t_o")
	private List<PurchaseOrderOutDTO> purchaseOrderList;

	public void setPurchaseOrderList(List<PurchaseOrderOutDTO> purchaseOrderList) {
		this.purchaseOrderList = purchaseOrderList;
	}
	public List<PurchaseOrderOutDTO> getPurchaseOrderList( ) {
		return this.purchaseOrderList;
	}

}
