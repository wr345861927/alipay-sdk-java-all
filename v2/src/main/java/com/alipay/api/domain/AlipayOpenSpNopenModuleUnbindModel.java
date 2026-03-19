package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N模组返厂解绑
 *
 * @author auto create
 * @since 1.0, 2026-03-17 10:27:44
 */
public class AlipayOpenSpNopenModuleUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 2561598116749765749L;

	/**
	 * 上位机 itemId 必传
	 */
	@ApiField("device_item_id")
	private String deviceItemId;

	/**
	 * 绑定的上位机sn 必传
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 模组 itemId 必传
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 模组有 mcuid 必传
	 */
	@ApiField("mcu_id")
	private String mcuId;

	/**
	 * 模组有 seuuid 必传
	 */
	@ApiField("se_uuid")
	private String seUuid;

	/**
	 * 模组有 sn 必传，如碰有源线圈
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 供应商 Id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 模板code 必传
	 */
	@ApiField("template_code")
	private String templateCode;

	public String getDeviceItemId() {
		return this.deviceItemId;
	}
	public void setDeviceItemId(String deviceItemId) {
		this.deviceItemId = deviceItemId;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMcuId() {
		return this.mcuId;
	}
	public void setMcuId(String mcuId) {
		this.mcuId = mcuId;
	}

	public String getSeUuid() {
		return this.seUuid;
	}
	public void setSeUuid(String seUuid) {
		this.seUuid = seUuid;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
