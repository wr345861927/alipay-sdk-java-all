package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取某个具体通话的电话录音
 *
 * @author auto create
 * @since 1.0, 2023-10-23 13:48:28
 */
public class AnttechOceanbaseObglobalGetmonorecordingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5564512978448691657L;

	/**
	 * 通话ID
	 */
	@ApiField("contact_id")
	private String contactId;

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

}
