package com.taotao.search.service.impl;

import java.util.List;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.search.mapper.ItemMapper;
import com.taotao.search.pojo.SearchItem;
import com.taotao.search.service.ItemService;

/**
 * 商品导入 Service
 * @author Administrator
 *
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private SolrServer solrServer;
	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public TaotaoResult importItems() throws Exception{
		// 查询数据库获得商品列表
		List<SearchItem> itemList = itemMapper.getItemList();
		// 遍历列表
		for (SearchItem item : itemList) {
			// 创建文档对象
			SolrInputDocument document = new SolrInputDocument();
			// 添加域
			document.addField("id", item.getId());
			document.addField("item_title", item.getTitle());
			document.addField("item_sell_point", item.getSell_point());
			document.addField("item_price", item.getPrice());
			document.addField("item_image", item.getImage());
			document.addField("item_category_name", item.getCategory_name());
			document.addField("item_desc", item.getItem_desc());
			// 写入索引库
			solrServer.add(document);
		}
		// 提交
		solrServer.commit();
		return null;
	}

}
