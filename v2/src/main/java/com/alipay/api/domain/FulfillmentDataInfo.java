package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约数据
 *
 * @author auto create
 * @since 1.0, 2026-04-10 17:42:45
 */
public class FulfillmentDataInfo extends AlipayObject {

	private static final long serialVersionUID = 6214196744122858936L;

	/**
	 * 问诊类数据
	 */
	@ApiField("consultation")
	private ConsultationParam consultation;

	/**
	 * 检查检验数据
	 */
	@ApiField("examination")
	private ExaminationParam examination;

	public ConsultationParam getConsultation() {
		return this.consultation;
	}
	public void setConsultation(ConsultationParam consultation) {
		this.consultation = consultation;
	}

	public ExaminationParam getExamination() {
		return this.examination;
	}
	public void setExamination(ExaminationParam examination) {
		this.examination = examination;
	}

}
