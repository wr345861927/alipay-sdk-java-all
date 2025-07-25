package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneConfigQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.config.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-29 15:58:07
 */
public class AlipayCommerceEducateSceneConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1766791479494887656L;

	/** 
	 * 一脸通行服务配置信息查询结果
	 */
	@ApiListField("scene_config_infos")
	@ApiField("scene_config_query_d_t_o")
	private List<SceneConfigQueryDTO> sceneConfigInfos;

	public void setSceneConfigInfos(List<SceneConfigQueryDTO> sceneConfigInfos) {
		this.sceneConfigInfos = sceneConfigInfos;
	}
	public List<SceneConfigQueryDTO> getSceneConfigInfos( ) {
		return this.sceneConfigInfos;
	}

}
