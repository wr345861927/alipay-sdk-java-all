package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业信用购提前结清单查询
 *
 * @author auto create
 * @since 1.0, 2024-04-11 15:23:49
 */
public class AlipayCommerceAcommunicationCreditphonePayinadvanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3668745928895783759L;

	/**
	 * 提前结清支付宝订单号
	 */
	@ApiField("alipay_biz_no")
	private String alipayBizNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝主单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAlipayBizNo() {
		return this.alipayBizNo;
	}
	public void setAlipayBizNo(String alipayBizNo) {
		this.alipayBizNo = alipayBizNo;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
