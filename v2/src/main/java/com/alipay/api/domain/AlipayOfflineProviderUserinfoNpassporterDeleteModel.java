package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * NFC核身用户出库
 *
 * @author auto create
 * @since 1.0, 2025-04-16 16:25:24
 */
public class AlipayOfflineProviderUserinfoNpassporterDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2582235966327349671L;

	/**
	 * 身份证号。可以传明文，也可以传身份证号的32位大写MD5值。尽量使用MD5值
	 */
	@ApiField("identity_card")
	private String identityCard;

	/**
	 * 用户订单号，如果一个用户传入不同的订单号，则出库的时候会在所有订单都出库完之后才会彻底删除；如果传入相同的订单号，则一次出库就会删除。
	 */
	@ApiListField("out_biz_no")
	@ApiField("string")
	private List<String> outBizNo;

	/**
	 * 用户手机号。如果身份证选择不传，那手机号必须有。 如果有身份证信息，手机号非必须。
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 为了给用户分到不同的类别中。 
目前使用点位ID，由BD输出或者开放平台上的点位ID。
	 */
	@ApiField("project_id")
	private String projectId;

	public String getIdentityCard() {
		return this.identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public List<String> getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(List<String> outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
