package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售后单违约金修改
 *
 * @author auto create
 * @since 1.0, 2025-05-22 16:52:26
 */
public class AlipayCommerceMerchantcardAftersalesbreakcostModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3186647217294779383L;

	/**
	 * 售后单id
	 */
	@ApiField("aftersales_id")
	private String aftersalesId;

	/**
	 * 违约金金额，单位分，最大值取售后单上返回的违约金咨询结果，不收违约金传0
	 */
	@ApiField("damages_cash")
	private Long damagesCash;

	public String getAftersalesId() {
		return this.aftersalesId;
	}
	public void setAftersalesId(String aftersalesId) {
		this.aftersalesId = aftersalesId;
	}

	public Long getDamagesCash() {
		return this.damagesCash;
	}
	public void setDamagesCash(Long damagesCash) {
		this.damagesCash = damagesCash;
	}

}
