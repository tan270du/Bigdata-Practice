package pub.makers.shop.store.service;

import pub.makers.shop.store.vo.GoodReceiptAddrVo;

import java.util.List;

/**
 * Created by kok on 2017/6/8.
 */
public interface GoodReceiptAddrBizService {
    /**
     * 用户id查找收货地址
     */
    List<GoodReceiptAddrVo> listGoodReceiptAddr(String userId);

    /**
     * 用户id查找默认收货地址
     */
    GoodReceiptAddrVo defaultGoodReceiptAddr(String userId);

    /**
     * id查找收货地址
     */
    GoodReceiptAddrVo getById(String id);

    /**
     * 保存收货地址
     */
    GoodReceiptAddrVo createGoodReceiptAddr(GoodReceiptAddrVo addr);

    /**
     * 更新收货地址
     */
    GoodReceiptAddrVo updateGoodReceiptAddr(GoodReceiptAddrVo addr);

    /**
     * 删除收获地址
     */
    void delGoodReceiptAddr(String addrId, String userId);

    /**
     * 设置默认收货地址
     */
    void updateDefaultAddr(String addrId, String userId);
}
