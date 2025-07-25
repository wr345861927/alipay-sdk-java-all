package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改手艺人信息接口
 *
 * @author auto create
 * @since 1.0, 2022-10-11 12:01:47
 */
public class KoubeiCraftsmanDataProviderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3189713949822423933L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为 koubei.member.data.oauth.query 中的 auth_code，默认有效期24小时；ISV自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 手艺人头像，在商家端手艺人管理和用户端手艺人个人简介中展示手艺人头像 （通过 alipay.offline.material.image.upload 接口上传图片获取的资源id），上限最大5M,支持bmp,png,jpeg,jpg,gif格式的图片。
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 从业起始年月日
	 */
	@ApiField("career_begin")
	private String careerBegin;

	/**
	 * 职业。目前只能传支持一个。枚举类型目前有19种，发型师、美甲师、美容师、美睫师、纹绣师、纹身师、摄影师、教练、教师、化妆师、司仪、摄像师、按摩技师、足疗技师、灸疗师、理疗师、修脚师、采耳师、其他。
	 */
	@ApiListField("careers")
	@ApiField("string")
	private List<String> careers;

	/**
	 * 口碑手艺人id(外部手艺人id和口碑手艺人id二选一，如果都传的话，那么优先使用口碑手艺人id)
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 手艺人简介，上限300字。
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 昵称，上限16字,手艺人个人主页名称，展示给消费者看。
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 外部手艺人id，由ISV生成，isv的appId + 外部手艺人id全局唯一
	 */
	@ApiField("out_craftsman_id")
	private String outCraftsmanId;

	/**
	 * 手艺人关联门店
	 */
	@ApiListField("shop_relations")
	@ApiField("craftsman_shop_relation_open_model")
	private List<CraftsmanShopRelationOpenModel> shopRelations;

	/**
	 * 描述手艺人擅长的技术（如烫染、二分式剪法、足疗、中医推拿、刮痧、火疗、拔罐、婚纱、儿童、写真...）。最多6个标签,最大长度指每个标签字段上限10个字。
	 */
	@ApiListField("specialities")
	@ApiField("string")
	private List<String> specialities;

	/**
	 * 手艺人的手机号，在商家端和用户端展示，不支持座机
	 */
	@ApiField("tel_num")
	private String telNum;

	/**
	 * 头衔，手艺人在店内的职称。上限10个字。
	 */
	@ApiField("title")
	private String title;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getCareerBegin() {
		return this.careerBegin;
	}
	public void setCareerBegin(String careerBegin) {
		this.careerBegin = careerBegin;
	}

	public List<String> getCareers() {
		return this.careers;
	}
	public void setCareers(List<String> careers) {
		this.careers = careers;
	}

	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOutCraftsmanId() {
		return this.outCraftsmanId;
	}
	public void setOutCraftsmanId(String outCraftsmanId) {
		this.outCraftsmanId = outCraftsmanId;
	}

	public List<CraftsmanShopRelationOpenModel> getShopRelations() {
		return this.shopRelations;
	}
	public void setShopRelations(List<CraftsmanShopRelationOpenModel> shopRelations) {
		this.shopRelations = shopRelations;
	}

	public List<String> getSpecialities() {
		return this.specialities;
	}
	public void setSpecialities(List<String> specialities) {
		this.specialities = specialities;
	}

	public String getTelNum() {
		return this.telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
