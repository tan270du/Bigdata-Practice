package pub.makers.shop.store.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import pub.makers.base.exception.ValidateUtils;
import pub.makers.daotemplate.vo.Conds;
import pub.makers.daotemplate.vo.Update;
import pub.makers.shop.base.util.IdGenerator;
import pub.makers.shop.store.entity.GoodReceiptAddr;
import pub.makers.shop.store.vo.GoodReceiptAddrVo;

import java.util.Date;
import java.util.List;

/**
 * Created by kok on 2017/6/8.
 */
@Service(version = "1.0.0")
public class GoodReceiptAddrBizServiceImpl implements GoodReceiptAddrBizService {
    @Autowired
    private GoodReceiptAddrService goodReceiptAddrService;
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public List<GoodReceiptAddrVo> listGoodReceiptAddr(String userId) {
        List<GoodReceiptAddr> addrList = goodReceiptAddrService.list(Conds.get().eq("user_id", userId));
        List<GoodReceiptAddrVo> addrVoList = Lists.newArrayList();
        for (GoodReceiptAddr addr : addrList) {
            GoodReceiptAddrVo vo = GoodReceiptAddrVo.fromGoodReceiptAddr(addr);
            if (vo.getStatus() == 1) {
                addrVoList.add(0, vo);
            } else {
                addrVoList.add(vo);
            }
        }
        return addrVoList;
    }

    @Override
    public GoodReceiptAddrVo defaultGoodReceiptAddr(String userId) {
        GoodReceiptAddr addr = goodReceiptAddrService.get(Conds.get().eq("user_id", userId).eq("status", 1));
        return addr == null ? new GoodReceiptAddrVo() : GoodReceiptAddrVo.fromGoodReceiptAddr(addr);
    }

    @Override
    public GoodReceiptAddrVo getById(String id) {
        GoodReceiptAddr addr = goodReceiptAddrService.getById(id);
        return addr == null ? new GoodReceiptAddrVo() : GoodReceiptAddrVo.fromGoodReceiptAddr(addr);
    }

    @Override
    public GoodReceiptAddrVo createGoodReceiptAddr(GoodReceiptAddrVo vo) {
        // 前置验证
        checkAddr(vo);
        Long count = goodReceiptAddrService.count(Conds.get().eq("user_id", vo.getUserId()));
        ValidateUtils.isTrue(count <= 20, "收货地址最多可创建20个");

        GoodReceiptAddr addr = vo.toGoodReceiptAddr();
        addr.setId(IdGenerator.getDefault().nextId());
        GoodReceiptAddr defaultAddr = goodReceiptAddrService.get(Conds.get().eq("user_id", vo.getUserId()).eq("status", 1));
        addr.setStatus(defaultAddr == null ? 1 : 0);
        addr.setCreateTime(new Date());
        goodReceiptAddrService.insert(addr);
        return GoodReceiptAddrVo.fromGoodReceiptAddr(addr);
    }

    @Override
    public GoodReceiptAddrVo updateGoodReceiptAddr(GoodReceiptAddrVo vo) {
        // 前置验证
        checkAddr(vo);
        GoodReceiptAddr receiptAddr = goodReceiptAddrService.getById(vo.getId());
        ValidateUtils.notNull(receiptAddr, "收货地址不存在");
        ValidateUtils.isTrue(receiptAddr.getUserId().toString().equals(vo.getUserId()), "只能修改自己的收货地址");

        // 更新收货地址
        goodReceiptAddrService.update(Update.byId(vo.getId()).set("receipt_name", vo.getReceiptName()).set("mobile", vo.getMobile())
                .set("fiexd_phone", vo.getFiexdPhone()).set("province_code", vo.getProvinceCode()).set("province_name", vo.getProvinceName())
                .set("city_code", vo.getCityCode()).set("city_name", vo.getCityName()).set("area_code", vo.getAreaCode()).set("area_name", vo.getAreaName())
                .set("detail_addr", vo.getDetailAddr()).set("update_time", new Date()));
        return getById(vo.getId());
    }

    @Override
    public void delGoodReceiptAddr(final String addrId, final String userId) {
        // 前置验证
        final GoodReceiptAddr receiptAddr = goodReceiptAddrService.getById(addrId);
        ValidateUtils.notNull(receiptAddr, "收货地址不存在");
        ValidateUtils.isTrue(receiptAddr.getUserId().toString().equals(userId), "只能删除自己的收货地址");

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                goodReceiptAddrService.deleteById(addrId);
                if (receiptAddr.getStatus() == 1) {
                    List<GoodReceiptAddr> addrList = goodReceiptAddrService.list(Conds.get().eq("user_id", userId));
                    if (!addrList.isEmpty()) {
                        goodReceiptAddrService.update(Update.byId(addrList.get(0).getId()).set("status", 1));
                    }
                }
            }
        });
    }

    @Override
    public void updateDefaultAddr(String addrId, final String userId) {
        // 前置验证
        final GoodReceiptAddr receiptAddr = goodReceiptAddrService.getById(addrId);
        ValidateUtils.notNull(receiptAddr, "收货地址不存在");
        ValidateUtils.isTrue(receiptAddr.getUserId().toString().equals(userId), "只能修改自己的收货地址");

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                GoodReceiptAddr oldDefault = goodReceiptAddrService.get(Conds.get().eq("user_id", userId).eq("status", 1));
                if (oldDefault != null) {
                    goodReceiptAddrService.update(Update.byId(oldDefault.getId()).set("status", 0));
                }
                goodReceiptAddrService.update(Update.byId(receiptAddr.getId()).set("status", 1));
            }
        });
    }

    private void checkAddr(GoodReceiptAddrVo addr){
        ValidateUtils.notNull(addr, "收货地址不能为空");
        ValidateUtils.notNull(addr.getUserId(), "用户不能为空");
        ValidateUtils.notNull(addr.getReceiptName(), "收货人不能为空");
        ValidateUtils.isTrue(addr.getMobile() != null || addr.getFiexdPhone() != null, "手机号码和固定电话不能同时为空");
//        ValidateUtils.notNull(addr.getProvinceCode(), "省份不能为空，请选择省份");
        ValidateUtils.notNull(addr.getProvinceName(), "省份不能为空，请选择省份");
//        ValidateUtils.notNull(addr.getCityCode(), "城市不能为空，请选择城市");
        ValidateUtils.notNull(addr.getCityName(), "城市不能为空，请选择城市");
//        ValidateUtils.notNull(addr.getAreaCode(), "地区不能为空，请选择地区");
//        ValidateUtils.notNull(addr.getAreaName(), "地区不能为空，请选择地区");
        ValidateUtils.notNull(addr.getDetailAddr(), "详细地址不能为空");
    }
}
