package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝代运营商业关系门店资产新增
 *
 * @author auto create
 * @since 1.0, 2023-08-07 09:53:35
 */
public class AlipayBusinessRelationShopmemberAddModel extends AlipayObject {

	private static final long serialVersionUID = 7786815774979229965L;

	/**
	 * 门店资产增加方式
	 */
	@ApiField("add_option")
	private BusinessRelationShopMemberAddOption addOption;

	/**
	 * 商业关系组织id 由组织信息创建接口返回或bd分配或业务标识id，如mallid
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商业关系组织子类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_sub_type")
	private String groupSubType;

	/**
	 * 商业关系组织类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 支付宝内部物理门店编号。real_shop_no和real_shop_id至少传一个。如果同时传以real_shop_id为准
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/**
	 * 外部门店编号，用于ISV系统内部门店标识等。real_shop_no和real_shop_id至少传一个。如果同时传以real_shop_id为准
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	public BusinessRelationShopMemberAddOption getAddOption() {
		return this.addOption;
	}
	public void setAddOption(BusinessRelationShopMemberAddOption addOption) {
		this.addOption = addOption;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupSubType() {
		return this.groupSubType;
	}
	public void setGroupSubType(String groupSubType) {
		this.groupSubType = groupSubType;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getRealShopId() {
		return this.realShopId;
	}
	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}

	public String getRealShopNo() {
		return this.realShopNo;
	}
	public void setRealShopNo(String realShopNo) {
		this.realShopNo = realShopNo;
	}

}
