package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业标签内容模型
 *
 * @author auto create
 * @since 1.0, 2023-02-01 12:38:24
 */
public class EpLabelContent extends AlipayObject {

	private static final long serialVersionUID = 2237332678629174761L;

	/**
	 * 标签分类
	 */
	@ApiField("label_category")
	private String labelCategory;

	/**
	 * 标签解释说明
	 */
	@ApiField("label_definition")
	private String labelDefinition;

	/**
	 * 标签情感
	 */
	@ApiField("label_emotion")
	private String labelEmotion;

	/**
	 * 标签名称
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 标签值
	 */
	@ApiListField("label_value")
	@ApiField("string")
	private List<String> labelValue;

	public String getLabelCategory() {
		return this.labelCategory;
	}
	public void setLabelCategory(String labelCategory) {
		this.labelCategory = labelCategory;
	}

	public String getLabelDefinition() {
		return this.labelDefinition;
	}
	public void setLabelDefinition(String labelDefinition) {
		this.labelDefinition = labelDefinition;
	}

	public String getLabelEmotion() {
		return this.labelEmotion;
	}
	public void setLabelEmotion(String labelEmotion) {
		this.labelEmotion = labelEmotion;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public List<String> getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(List<String> labelValue) {
		this.labelValue = labelValue;
	}

}
