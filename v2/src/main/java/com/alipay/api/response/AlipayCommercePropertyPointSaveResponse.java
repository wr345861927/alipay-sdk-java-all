package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.point.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 20:02:26
 */
public class AlipayCommercePropertyPointSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2659474295325185659L;

	/** 
	 * 点位id
	 */
	@ApiField("location_point_id")
	private String locationPointId;

	/** 
	 * 解绑的线圈id
	 */
	@ApiField("nfc_card_id")
	private String nfcCardId;

	public void setLocationPointId(String locationPointId) {
		this.locationPointId = locationPointId;
	}
	public String getLocationPointId( ) {
		return this.locationPointId;
	}

	public void setNfcCardId(String nfcCardId) {
		this.nfcCardId = nfcCardId;
	}
	public String getNfcCardId( ) {
		return this.nfcCardId;
	}

}
