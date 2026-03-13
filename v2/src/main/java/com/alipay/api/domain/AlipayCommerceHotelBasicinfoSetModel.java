package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 酒店基础信息配置
 *
 * @author auto create
 * @since 1.0, 2026-03-10 14:28:51
 */
public class AlipayCommerceHotelBasicinfoSetModel extends AlipayObject {

	private static final long serialVersionUID = 6351299684875131224L;

	/**
	 * 是否启用会员功能
	 */
	@ApiField("enable_member")
	private String enableMember;

	/**
	 * 酒店bian'm
	 */
	@ApiField("hotel_code")
	private String hotelCode;

	/**
	 * 酒店集团code
	 */
	@ApiField("hotel_group_code")
	private String hotelGroupCode;

	/**
	 * 酒店名称
	 */
	@ApiField("hotel_name")
	private String hotelName;

	/**
	 * null
	 */
	@ApiListField("registration_agreement")
	@ApiField("string")
	private List<String> registrationAgreement;

	/**
	 * 会员注册提示
	 */
	@ApiField("registration_sub_title")
	private String registrationSubTitle;

	/**
	 * 房间号样式类型
	 */
	@ApiField("room_no_pattern_type")
	private String roomNoPatternType;

	/**
	 * 酒店主题样式配置
	 */
	@ApiField("theme")
	private HotelThemeVO theme;

	public String getEnableMember() {
		return this.enableMember;
	}
	public void setEnableMember(String enableMember) {
		this.enableMember = enableMember;
	}

	public String getHotelCode() {
		return this.hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getHotelGroupCode() {
		return this.hotelGroupCode;
	}
	public void setHotelGroupCode(String hotelGroupCode) {
		this.hotelGroupCode = hotelGroupCode;
	}

	public String getHotelName() {
		return this.hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public List<String> getRegistrationAgreement() {
		return this.registrationAgreement;
	}
	public void setRegistrationAgreement(List<String> registrationAgreement) {
		this.registrationAgreement = registrationAgreement;
	}

	public String getRegistrationSubTitle() {
		return this.registrationSubTitle;
	}
	public void setRegistrationSubTitle(String registrationSubTitle) {
		this.registrationSubTitle = registrationSubTitle;
	}

	public String getRoomNoPatternType() {
		return this.roomNoPatternType;
	}
	public void setRoomNoPatternType(String roomNoPatternType) {
		this.roomNoPatternType = roomNoPatternType;
	}

	public HotelThemeVO getTheme() {
		return this.theme;
	}
	public void setTheme(HotelThemeVO theme) {
		this.theme = theme;
	}

}
