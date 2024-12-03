package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 问诊结论（结构化处方）
 *
 * @author auto create
 * @since 1.0, 2023-08-02 15:13:34
 */
public class Diagnosis extends AlipayObject {

	private static final long serialVersionUID = 8772583194523647699L;

	/**
	 * 诊断疾病列表
	 */
	@ApiListField("diseases")
	@ApiField("diagnosis_disease")
	private List<DiagnosisDisease> diseases;

	public List<DiagnosisDisease> getDiseases() {
		return this.diseases;
	}
	public void setDiseases(List<DiagnosisDisease> diseases) {
		this.diseases = diseases;
	}

}
