package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NotifyUserVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.notifycenter.notifyuser.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 22:06:43
 */
public class AlipayCommerceTransportNotifycenterNotifyuserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6711927474438727228L;

	/** 
	 * 订阅用户vo列表
	 */
	@ApiListField("result")
	@ApiField("notify_user_vo")
	private List<NotifyUserVo> result;

	public void setResult(List<NotifyUserVo> result) {
		this.result = result;
	}
	public List<NotifyUserVo> getResult( ) {
		return this.result;
	}

}
