package com.taotao.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.ExceptionUtil;
import com.taotao.search.service.ItemService;

/**
 * 商品导入 Controller
 * @author Administrator
 *
 */
@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@RequestMapping("/importall")
	@ResponseBody
	public TaotaoResult importAll() {
		try {
			TaotaoResult result = itemService.importItems();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
