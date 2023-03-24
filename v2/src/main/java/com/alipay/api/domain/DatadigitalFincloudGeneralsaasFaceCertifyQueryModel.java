package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸核身产品身份认证记录查询
 *
 * @author auto create
 * @since 1.0, 2022-02-28 11:06:55
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4342611948169846652L;

	/**
	 * 本次申请操作的唯一标识，通过datadigital.fincloud.generalsaas.face.certify.initialize
接口同步响应获取。
	 */
	@ApiField("certify_id")
	private String certifyId;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

}
