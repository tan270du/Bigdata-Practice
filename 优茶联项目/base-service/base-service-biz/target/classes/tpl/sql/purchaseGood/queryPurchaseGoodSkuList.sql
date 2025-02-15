select pgs.id,pgs.pur_goods_id as goodsId,cs.sku_name as name,cs.retail_price,c.pc_album_id from purchase_goods_sku pgs
LEFT JOIN cargo_sku cs on cs.id = pgs.cargo_sku_id
LEFT JOIN cargo c on cs.cargo_id = c.id
LEFT JOIN purchase_goods pg on pg.id = pgs.pur_goods_id
where 1=1
and pgs.`status` = '1'
<#if name?? && name!="">
  and (cs.sku_name like '%base-service-biz%' or cs.code like '%base-service-biz%' or pg.group_name = 'base-service-biz')
</#if>
<#if classifyId?? && classifyId!="">
  and FIND_IN_SET ('${classifyId}',pg.group_id)
</#if>
<#if startPrice?? && startPrice!=0>
	and cs.retail_price >= ${startPrice}
</#if>
<#if endPrice?? && endPrice!=0>
	and cs.retail_price <= ${endPrice}
</#if>
<#if isChecked?? && isChecked!="">
  and pgs.id in(${goodIds})
</#if>
order by pgs.order_index desc LIMIT ?,?