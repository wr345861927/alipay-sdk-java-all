package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链金融-自保理-电信分期还款预算查询服务
 *
 * @author auto create
 * @since 1.0, 2019-07-02 14:13:05
 */
public class MybankCreditSupplychainTradeBillrepaybudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7451432968699544589L;

	/**
	 * 买家信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 渠道类型
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 产品销售码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

}
