<#if isChecked?? && isChecked!="">
  select count(*) from  purchase_classify pc
  where 1=1
	<#if name?? && name!="">
    and pc.name like '%${name}%'
  </#if>
  order by pc.parent_id
<#else>
  select count(*) from purchase_goods_sku pgs
  LEFT JOIN cargo_sku cs on cs.id = pgs.cargo_sku_id
  LEFT JOIN cargo c on cs.cargo_id = c.id
  LEFT JOIN purchase_goods pg on pg.id = pgs.pur_goods_id
  where 1=1
  and pgs.`status` = '1'
  <#if name?? && name!="">
     and (cs.sku_name like '%${name}%' or cs.code like '%${name}%')
  </#if>
  <#if startPrice?? && startPrice!=0>
    and cs.retail_price >= ${startPrice}
  </#if>
  <#if endPrice?? && endPrice!=0>
    and cs.retail_price <= ${endPrice}
  </#if>
  order by pgs.order_index desc
</#if>
