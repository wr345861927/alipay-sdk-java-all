package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-12 10:15:27
 */
public class SyllabusStructuredQueryVO extends AlipayObject {

	private static final long serialVersionUID = 7445536132657564755L;

	/**
	 * 章节
	 */
	@ApiField("chapter")
	private String chapter;

	/**
	 * null
	 */
	@ApiListField("sections")
	@ApiField("string")
	private List<String> sections;

	public String getChapter() {
		return this.chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public List<String> getSections() {
		return this.sections;
	}
	public void setSections(List<String> sections) {
		this.sections = sections;
	}

}
