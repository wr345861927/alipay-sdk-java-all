package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量更新门店商品编码通过旧商家商品编码
 *
 * @author auto create
 * @since 1.0, 2025-01-16 14:28:19
 */
public class AlipayCommerceMedicalItemcodeBycodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8716916477824119478L;

	/**
	 * 批量修改药品编码信息
	 */
	@ApiListField("item_code_data")
	@ApiField("item_code_update_by_code_v_o")
	private List<ItemCodeUpdateByCodeVO> itemCodeData;

	/**
	 * app方门店编码, 用于标识定位要操作商品的指定门店, 创建门店时设置的值
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<ItemCodeUpdateByCodeVO> getItemCodeData() {
		return this.itemCodeData;
	}
	public void setItemCodeData(List<ItemCodeUpdateByCodeVO> itemCodeData) {
		this.itemCodeData = itemCodeData;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
