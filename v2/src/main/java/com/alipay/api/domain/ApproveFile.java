package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构初审文件
 *
 * @author auto create
 * @since 1.0, 2025-08-05 10:39:19
 */
public class ApproveFile extends AlipayObject {

	private static final long serialVersionUID = 8541491692182147834L;

	/**
	 * 文件路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 传输版本，不同的版本文件位置、加密处理、压缩处理等可能不同。
	 */
	@ApiField("transfer_version")
	private String transferVersion;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getTransferVersion() {
		return this.transferVersion;
	}
	public void setTransferVersion(String transferVersion) {
		this.transferVersion = transferVersion;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
