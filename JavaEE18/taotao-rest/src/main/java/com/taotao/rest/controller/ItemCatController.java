package com.taotao.rest.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.utils.JsonUtils;
import com.taotao.rest.pojo.ItemCatResult;
import com.taotao.rest.service.ItemCatService;

/**
 * 商品分类查询服务 Controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
	
	@Autowired
	private ItemCatService itemCatService;
	
	// 第一种方法
//	@RequestMapping(value="/list",produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
//	@ResponseBody
//	public String getItemCatList(String callback) {
//		ItemCatResult result = itemCatService.getItemCatList();
//		if (StringUtils.isBlank(callback)) {
//			// 需要把 result 转换成字符串
//			String json = JsonUtils.objectToJson(result);
//			return json;
//		}
//		// 如果字符串不为空，需要支持 jsonp 调用
//		String json = JsonUtils.objectToJson(result);
//		return callback + "(" + json + ");";
//	}
	
	// 第二种方法
	@RequestMapping(value="/list")
	@ResponseBody
	public Object getItemCatList(String callback) {
		ItemCatResult result = itemCatService.getItemCatList();
		if (StringUtils.isBlank(callback)) {
			// 需要把 result 转换成字符串
			return result;
		}
		// 如果字符串不为空，需要支持 jsonp 调用
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}
}
