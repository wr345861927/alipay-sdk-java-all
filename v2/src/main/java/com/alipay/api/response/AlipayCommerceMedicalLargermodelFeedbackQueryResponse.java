package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FeedbackOptionsVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.feedback.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 19:04:36
 */
public class AlipayCommerceMedicalLargermodelFeedbackQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6224486445823233481L;

	/** 
	 * 反馈选项数据
	 */
	@ApiListField("feedback_options_list")
	@ApiField("feedback_options_v_o")
	private List<FeedbackOptionsVO> feedbackOptionsList;

	public void setFeedbackOptionsList(List<FeedbackOptionsVO> feedbackOptionsList) {
		this.feedbackOptionsList = feedbackOptionsList;
	}
	public List<FeedbackOptionsVO> getFeedbackOptionsList( ) {
		return this.feedbackOptionsList;
	}

}
