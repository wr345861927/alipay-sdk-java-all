package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸能力接口
 *
 * @author auto create
 * @since 1.0, 2022-02-22 17:08:24
 */
public class ZolozAuthenticationCustomerFaceabilityIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 6321543382796474575L;

	/**
	 * 开放活体图片进行人脸识别的能力，包括extract(提取特征)、sex(检测性别)、rect(人脸矩形框检测)
	 */
	@ApiField("ability")
	private String ability;

	/**
	 * 算法版本，人脸PD定向提供
	 */
	@ApiField("alg_ver")
	private String algVer;

	/**
	 * 活体图片encode base64 String
	 */
	@ApiField("auth_img")
	private String authImg;

	/**
	 * 业务唯一ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 使用人脸能力所需要等拓展参数信息
	 */
	@ApiField("ext_info")
	private FaceAbilityExtInfo extInfo;

	/**
	 * 人脸定制分配的场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAbility() {
		return this.ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getAlgVer() {
		return this.algVer;
	}
	public void setAlgVer(String algVer) {
		this.algVer = algVer;
	}

	public String getAuthImg() {
		return this.authImg;
	}
	public void setAuthImg(String authImg) {
		this.authImg = authImg;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public FaceAbilityExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(FaceAbilityExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
