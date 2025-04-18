package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态线圈绑定接口
 *
 * @author auto create
 * @since 1.0, 2025-03-06 17:57:53
 */
public class AntMerchantExpandEcoNfcBindModel extends AlipayObject {

	private static final long serialVersionUID = 7267937752733118352L;

	/**
	 * nfc线圈的码值token
	 */
	@ApiField("nfc_token")
	private String nfcToken;

	/**
	 * nfc线圈的tagId
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 买家上传的个人收款码链接
	 */
	@ApiField("upload_qrcode_url")
	private String uploadQrcodeUrl;

	public String getNfcToken() {
		return this.nfcToken;
	}
	public void setNfcToken(String nfcToken) {
		this.nfcToken = nfcToken;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getUploadQrcodeUrl() {
		return this.uploadQrcodeUrl;
	}
	public void setUploadQrcodeUrl(String uploadQrcodeUrl) {
		this.uploadQrcodeUrl = uploadQrcodeUrl;
	}

}
