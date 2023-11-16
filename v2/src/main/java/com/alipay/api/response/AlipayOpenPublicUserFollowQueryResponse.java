package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.user.follow.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:41:50
 */
public class AlipayOpenPublicUserFollowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4168215557253837131L;

	/** 
	 * 用户是否关注。枚举值如下：
*T：代表已关注。
*F：代表未关注。
	 */
	@ApiField("is_follow")
	private String isFollow;

	public void setIsFollow(String isFollow) {
		this.isFollow = isFollow;
	}
	public String getIsFollow( ) {
		return this.isFollow;
	}

}
