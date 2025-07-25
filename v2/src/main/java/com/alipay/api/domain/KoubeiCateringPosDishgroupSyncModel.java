package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步组合菜
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:21:32
 */
public class KoubeiCateringPosDishgroupSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7769772224422774732L;

	/**
	 * 组合菜详情
	 */
	@ApiField("pos_dish_group_model")
	private PosDishGroupModel posDishGroupModel;

	public PosDishGroupModel getPosDishGroupModel() {
		return this.posDishGroupModel;
	}
	public void setPosDishGroupModel(PosDishGroupModel posDishGroupModel) {
		this.posDishGroupModel = posDishGroupModel;
	}

}
