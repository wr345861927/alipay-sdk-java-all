package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁单扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-07-18 18:44:51
 */
public class RentExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8734545328771839415L;

	/**
	 * 买家扩展信息
	 */
	@ApiField("buyer_ext_info")
	private RentBuyerExtInfo buyerExtInfo;

	/**
	 * 物流扩展信息
	 */
	@ApiField("delivery_ext_info")
	private RentDeliveryExtInfo deliveryExtInfo;

	/**
	 * 融资扩展信息
	 */
	@ApiListField("financing_ext_info")
	@ApiField("rent_financing_ext_info")
	private List<RentFinancingExtInfo> financingExtInfo;

	/**
	 * 历史资产融资扩展信息
	 */
	@ApiField("historical_asset_financing_ext_info")
	private RentHistoricalAssetFinancingExtInfoDTO historicalAssetFinancingExtInfo;

	/**
	 * 商品扩展信息
	 */
	@ApiField("item_ext_info")
	private RentItemExtInfo itemExtInfo;

	/**
	 * 订单扩展信息
	 */
	@ApiField("order_ext_info")
	private RentOrderExtInfo orderExtInfo;

	public RentBuyerExtInfo getBuyerExtInfo() {
		return this.buyerExtInfo;
	}
	public void setBuyerExtInfo(RentBuyerExtInfo buyerExtInfo) {
		this.buyerExtInfo = buyerExtInfo;
	}

	public RentDeliveryExtInfo getDeliveryExtInfo() {
		return this.deliveryExtInfo;
	}
	public void setDeliveryExtInfo(RentDeliveryExtInfo deliveryExtInfo) {
		this.deliveryExtInfo = deliveryExtInfo;
	}

	public List<RentFinancingExtInfo> getFinancingExtInfo() {
		return this.financingExtInfo;
	}
	public void setFinancingExtInfo(List<RentFinancingExtInfo> financingExtInfo) {
		this.financingExtInfo = financingExtInfo;
	}

	public RentHistoricalAssetFinancingExtInfoDTO getHistoricalAssetFinancingExtInfo() {
		return this.historicalAssetFinancingExtInfo;
	}
	public void setHistoricalAssetFinancingExtInfo(RentHistoricalAssetFinancingExtInfoDTO historicalAssetFinancingExtInfo) {
		this.historicalAssetFinancingExtInfo = historicalAssetFinancingExtInfo;
	}

	public RentItemExtInfo getItemExtInfo() {
		return this.itemExtInfo;
	}
	public void setItemExtInfo(RentItemExtInfo itemExtInfo) {
		this.itemExtInfo = itemExtInfo;
	}

	public RentOrderExtInfo getOrderExtInfo() {
		return this.orderExtInfo;
	}
	public void setOrderExtInfo(RentOrderExtInfo orderExtInfo) {
		this.orderExtInfo = orderExtInfo;
	}

}
