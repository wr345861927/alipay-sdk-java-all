package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.userbalance.online response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayDataDataserviceAdUserbalanceOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 1113719737388137662L;

	/** 
	 * 操作成功投放账户id列表
	 */
	@ApiListField("success_user_id_list")
	@ApiField("number")
	private List<Long> successUserIdList;

	public void setSuccessUserIdList(List<Long> successUserIdList) {
		this.successUserIdList = successUserIdList;
	}
	public List<Long> getSuccessUserIdList( ) {
		return this.successUserIdList;
	}

}
