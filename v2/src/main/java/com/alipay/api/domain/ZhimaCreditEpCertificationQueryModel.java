package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用认证结果查询
 *
 * @author auto create
 * @since 1.0, 2024-11-26 11:22:22
 */
public class ZhimaCreditEpCertificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1394664366521584384L;

	/**
	 * 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
