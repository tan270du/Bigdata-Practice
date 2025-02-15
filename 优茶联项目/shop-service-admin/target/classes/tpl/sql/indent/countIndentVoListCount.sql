select count(1) from (select
count(*)
from
indent i
  <#if concatName?? && concatName?length gt 0> LEFT JOIN vtwo_store_role r ON i.subbranch_id= r.store_id </#if>
  LEFT JOIN store_subbranch s ON s.id=i.subbranch_id
  left join indent_list il on il.indent_id = i.id
  left join cargo_sku cs on il.cargo_sku_id = cs.id
  left join weixin_user_info wui on i.buyer_id = wui.id
  <#if orderType?? && orderType?length gt 0 && orderType == 'presell'>
    left join trade_order_list_payment tolp on tolp.order_id = i.id
    left join trade_order_presell_extra tope on tope.order_id = i.id
  </#if>
where 1=1  and i.status != 0
     <#if cargoNo?? && cargoNo?length gt 0> and cs.code like concat('%', '${cargoNo ! ''}', '%') </#if>
     <#if indentShopType?? && indentShopType?length gt 0> and i.indent_shop_type like concat('%', '${indentShopType ! ''}', '%') </#if>
    <#if goodName?? && goodName?length gt 0> and il.trade_good_name like concat('%', '${goodName ! ''}', '%') </#if>
    <#if buyerName?? && buyerName?length gt 0> and wui.nickname like concat('%', '${buyerName ! ''}', '%') </#if>
    <#if orderNo?? && orderNo?length gt 0> and i.name like concat('%', '${orderNo ! ''}', '%') </#if>
    <#if storeName?? && storeName?length gt 0> and s.name like concat('%', '${storeName ! ''}', '%') </#if>
      <#if storeNum??> and s.number = ${storeNum}</#if>
      <#if storeDeptNum??> and s.department_num = ${storeDeptNum}</#if>
      <#if receiver?? && receiver?length gt 0> and i.receiver like concat('%', '${receiver ! ''}', '%') </#if>
	 <#if receiverPhone?? && receiverPhone?length gt 0> and i.receiver_phone like concat('%', '${receiverPhone ! ''}', '%') </#if>
      <#if indentStatusStr?? && indentStatusStr?length gt 0>and i.status in (${indentStatusStr}) </#if>
      <#if buyType?? && buyType?length gt 0> and i.buy_type like '${buyType}'</#if>
      <#if startTimeStr?? && startTimeStr?length gt 0> and i.create_time >= '${startTimeStr}' </#if>
      <#if endTimeStr?? && endTimeStr?length gt 0>  and i.create_time <= '${endTimeStr}' </#if>
      <#if type?? && type?length gt 0> and i.type = '${type}' </#if>
      <#if dealStatus?? && dealStatus?length gt 0> and i.deal_status = ${dealStatus} </#if>
      <#if isRemarkInfo?? && isRemarkInfo?length gt 0> and i.remark_level is not null </#if>
      <#if afterSaleService?? && afterSaleService?length gt 0> and il.status in ('${afterSaleService}')   </#if>
      <#if preSellStatusStr?? && preSellStatusStr?length gt 0> and i.status = '${preSellStatusStr}' and i.order_type = '${orderType}' </#if>

      <#if orderType?? && orderType?length gt 0 && orderType == 'presell'>

        and i.order_type = '${orderType}'
        <#if presellStatus?? && presellStatus?length gt 0>
          <#if presellStatus == '1'>
            and tope.presell_type = 'second'
            and tolp.pay_status = 'F'
            and tolp.stage_num = 1
          </#if>
          <#if presellStatus == '2'>
            and tope.presell_type = 'second'
            and tolp.pay_status = 'F'
            and tolp.stage_num = 2
            and i.status = 20
          </#if>
          <#if presellStatus == '3'>
            and tope.presell_type = 'second'
            and tolp.pay_status = 'F'
            and tolp.stage_num = 2
            and i.status = 11
          </#if>
          <#if presellStatus == '4'>
            and tope.presell_type = 'second'
            and tolp.pay_status = 'T'
            and tolp.stage_num = 2
          </#if>
          <#if presellStatus == '5'>
            and tope.presell_type = 'one'
            and tolp.pay_status = 'F'
            and tolp.stage_num = 1
          </#if>
          <#if presellStatus == '6'>
            and tope.presell_type = 'one'
            and tolp.pay_status = 'T'
            and tolp.stage_num = 1
          </#if>
        </#if>
      </#if>

      <#if orderType?? && orderType?length gt 0> and i.order_type = '${orderType}' </#if>
      <#if province?? && province?length gt 0 && province != '---请选择---'> and s.province_name like concat('%', '${province ! ''}', '%')  </#if>
      <#if city?? && city?length gt 0 && city != '---请选择---'> and s.city_name like concat('%', '${city ! ''}', '%')  </#if>
      <#if country?? && country?length gt 0 && country != '---请选择---'> and s.country_name like concat('%', '${country ! ''}', '%') </#if>
      <#if needInvoice?? && needInvoice?length gt 0> and i.need_invoice = ${needInvoice} </#if>
group by i.id) a