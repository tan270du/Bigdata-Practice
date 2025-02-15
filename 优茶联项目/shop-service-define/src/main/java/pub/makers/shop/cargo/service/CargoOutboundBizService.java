package pub.makers.shop.cargo.service;

import pub.makers.shop.baseOrder.enums.OrderBizType;

/**
 * Created by kok on 2017/5/12.
 * 出货单管理
 */
public interface CargoOutboundBizService {

    /**
     * 新增出库单
     */
    void addOutbound(String orderId, OrderBizType orderType, Long userId, String remarks);

    /**
     * 确认出货单
     */
    void confirmOutbound(String orderId, String desc);

    /**
     * 取消出货单
     */
    void cancelOutbound(String orderId, String desc);
}
