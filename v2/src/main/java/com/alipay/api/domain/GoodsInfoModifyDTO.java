package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品修改信息
 *
 * @author auto create
 * @since 1.0, 2025-03-20 22:45:16
 */
public class GoodsInfoModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 3716536435422553188L;

	/**
	 * 质检金额，单位为元
	 */
	@ApiField("inspect_price")
	private String inspectPrice;

	/**
	 * 提报商品库的商品
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 提报商品库的商品
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品回收状态
	 */
	@ApiField("recycle_status")
	private String recycleStatus;

	/**
	 * 商品租赁信息
	 */
	@ApiField("rent_info")
	private RentInfoDTO rentInfo;

	public String getInspectPrice() {
		return this.inspectPrice;
	}
	public void setInspectPrice(String inspectPrice) {
		this.inspectPrice = inspectPrice;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getRecycleStatus() {
		return this.recycleStatus;
	}
	public void setRecycleStatus(String recycleStatus) {
		this.recycleStatus = recycleStatus;
	}

	public RentInfoDTO getRentInfo() {
		return this.rentInfo;
	}
	public void setRentInfo(RentInfoDTO rentInfo) {
		this.rentInfo = rentInfo;
	}

}
