package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人关联信息对象
 *
 * @author auto create
 * @since 1.0, 2025-03-25 12:45:37
 */
public class BsContactPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 4115485466199117989L;

	/**
	 * 门店联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 13位联系人手机号
	 */
	@ApiField("contact_phone_no")
	private String contactPhoneNo;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhoneNo() {
		return this.contactPhoneNo;
	}
	public void setContactPhoneNo(String contactPhoneNo) {
		this.contactPhoneNo = contactPhoneNo;
	}

}
