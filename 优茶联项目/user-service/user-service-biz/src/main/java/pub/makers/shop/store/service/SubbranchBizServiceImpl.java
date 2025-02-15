package pub.makers.shop.store.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.lantu.base.common.entity.BoolType;
import com.lantu.base.util.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import pub.makers.base.exception.ValidateUtils;
import pub.makers.daotemplate.vo.Conds;
import pub.makers.daotemplate.vo.Update;
import pub.makers.shop.base.util.IdGenerator;
import pub.makers.shop.base.util.SqlHelper;
import pub.makers.shop.base.vo.ResultData;
import pub.makers.shop.store.entity.Subbranch;
import pub.makers.shop.store.entity.VtwoStorePhoto;
import pub.makers.shop.store.entity.VtwoStoreRole;
import pub.makers.shop.store.pojo.SubbranchInfo;
import pub.makers.shop.store.vo.ImageVo;
import pub.makers.shop.store.vo.SubbranchVo;
import pub.makers.shop.store.vo.VtwoStoreRoleVo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Service(version = "1.0.0")
public class SubbranchBizServiceImpl implements SubbranchBizService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private SubbranchService subbranService;
    @Autowired
    private VtwoStoreRoleService vtwoStoreRoleService;
    @Autowired
    private SubbranchLoginBizService subbranchLoginBizService;
    @Autowired
    private VtwoStorePhotoService vtwoStorePhotoService;
    @Autowired
    private TransactionTemplate transactionTemplate;


    public BigDecimal queryTradeSuppliersPrice(String shopId, String skuId) {

        String stmt = SqlHelper.getSql("sql/querySuppliersPriceByShipIdAndSkuId.sql");
        System.out.println(String.format("%s\t%s\t%s", stmt, shopId, skuId));
        BigDecimal suppliersPrice = jdbcTemplate.queryForObject(stmt, BigDecimal.class, skuId, shopId);

        return suppliersPrice;
    }

    @Override
    public BigDecimal queryPurchaseSuppliersPrice(String shopId, String skuId) {
        String stmt = SqlHelper.getSql("sql/queryPurchaseSuppliersPriceByShopIdAndSkuId.sql");
        System.out.println(String.format("%s\t%s\t%s", stmt, shopId, skuId));
        BigDecimal suppliersPrice = jdbcTemplate.queryForObject(stmt, BigDecimal.class, skuId, shopId);

        return suppliersPrice;
    }


    @Override
    public ResultData querySummary(String subbranchId) {

        // 查询店铺
        return null;
    }


    @Override
    public Set<Long> getChildren(Long subbranchId) {

        List<Subbranch> subbranchList = subbranService.list(Conds.get("id").eq("parentSubranchId", subbranchId).eq("isSubAccount", BoolType.T.name()));
        Set<Long> idsSet = ListUtils.getIdSet(subbranchList, "id");
        idsSet.add(subbranchId);

        return idsSet;
    }

    @Override
    public SubbranchVo shopInfo(String id) {
        Subbranch subbranch = subbranService.getById(id);
        ValidateUtils.notNull(subbranch, "店铺不存在");

        SubbranchVo vo = SubbranchVo.fromSubbranch(subbranch);
        // 店铺图片
        List<VtwoStorePhoto> photoList = vtwoStorePhotoService.list(Conds.get().eq("is_able", 0).eq("store_id", id).order("create_time DESC"));
        vo.setPicList(Lists.transform(photoList, new Function<VtwoStorePhoto, ImageVo>() {
            @Override
            public ImageVo apply(VtwoStorePhoto vtwoStorePhoto) {
                return ImageVo.fromStorePhoto(vtwoStorePhoto);
            }
        }));

        // 店铺信息
        VtwoStoreRole storeRole = vtwoStoreRoleService.get(Conds.get().eq("store_id", id));
        vo.setStoreRole(VtwoStoreRoleVo.fromVtwoStoreRole(storeRole));
        return vo;
    }

    @Override
    public void updateShop(final SubbranchInfo info) {
        // 前置验证
        check(info);
        Subbranch subbranch = subbranService.getById(info.getId());
        ValidateUtils.notNull(subbranch, "店铺不存在");
        ValidateUtils.isTrue(!BoolType.T.name().equals(subbranch.getDelFlag()), "账号不存在，请重新注册");
        ValidateUtils.isTrue(!BoolType.F.name().equals(subbranch.getIsValid()), "账号已禁用");

        final VtwoStoreRole storeRole = vtwoStoreRoleService.get(Conds.get().eq("store_id", info.getId()));
        ValidateUtils.notNull(storeRole, "店铺不存在");
//        ValidateUtils.isTrue(storeRole.getStatus() != null && storeRole.getStatus() == 2, "未审核通过");

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                // 更新店铺信息
                subbranService.update(Update.byId(info.getId()).set("name", info.getName()).set("user_name", info.getUserName()).set("address", info.getAddress())
                        .set("description", info.getDescription()).set("head_img_url", info.getHeadImgUrl()).set("province_name", info.getProvinceName())
                        .set("city_name", info.getCityName()).set("country_name", info.getCountryName()).set("weixin", info.getWeixin())
                        .set("province", info.getProvince()).set("city", info.getCity()).set("country", info.getCountry()).set("phone", info.getPhone()));

                // 更新代理商信息
                vtwoStoreRoleService.update(Update.byId(storeRole.getId()).set("id_card_index", info.getIdCardIndex()).set("id_card_back", info.getIdCardBack())
                        .set("business_licence", info.getBusinessLicence()).set("tax_photo", info.getTaxPhoto()));

                // 更新图片
                vtwoStorePhotoService.delete(Conds.get().eq("store_id", info.getId()));
                for (String url : info.getAddPicList()) {
                    VtwoStorePhoto photo = new VtwoStorePhoto();
                    photo.setId(IdGenerator.getDefault().nextId());
                    photo.setStoreId(Long.valueOf(info.getId()));
                    photo.setPhotoUrl(url);
                    photo.setCreateTime(new Date());
                    photo.setIsAble("0");
                    vtwoStorePhotoService.insert(photo);
                }
            }
        });
    }

    private void check(SubbranchInfo info) {
        ValidateUtils.notNull(info, "店铺信息为空");
        ValidateUtils.notNull(info.getId(), "店铺信息为空");
        ValidateUtils.notNull(info.getName(), "店铺名称为空");
        ValidateUtils.notNull(info.getUserName(), "店长名称为空");
        ValidateUtils.notNull(info.getProvinceName(), "省份为空");
        ValidateUtils.notNull(info.getCityName(), "城市为空");
//        ValidateUtils.notNull(info.getCountryName(), "区为空");
        ValidateUtils.notNull(info.getAddress(), "地址为空");
//        ValidateUtils.notNull(info.getDelPicList(), "店铺简介为空");
//        ValidateUtils.notNull(info.getHeadImgUrl(), "头像为空");
//        ValidateUtils.notNull(info.getIdCardIndex(), "身份证正面为空");
//        ValidateUtils.notNull(info.getIdCardBack(), "身份证反面为空");
//        ValidateUtils.notNull(info.getBusinessLicence(), "营业执照为空");
//        ValidateUtils.notNull(info.getTaxPhoto(), "税务登记照为空");
    }

    @Override
    public void updatePassword(String id, String password, String mobile) {
        Subbranch subbranch = new Subbranch();
        if (org.apache.commons.lang.StringUtils.isNotBlank(id)) {
            subbranch = subbranService.getById(id);
        } else {
            subbranch = subbranService.getByMobile(mobile);
        }
        ValidateUtils.notNull(subbranch, "店铺不存在");
        ValidateUtils.isTrue(!BoolType.T.name().equals(subbranch.getDelFlag()), "账号不存在，请重新注册");
        ValidateUtils.isTrue(BoolType.T.name().equals(subbranch.getIsValid()), "账号已禁用");

        VtwoStoreRole storeRole = vtwoStoreRoleService.get(Conds.get().eq("store_id", subbranch.getId()));
        ValidateUtils.notNull(storeRole, "店铺不存在");
        ValidateUtils.isTrue(storeRole.getStatus() != null && storeRole.getStatus() == 2, "未审核通过");

        subbranService.update(Update.byId(subbranch.getId()).set("password", password));
    }


    @Override
    public Subbranch getById(String shopId) {
        return subbranService.getById(shopId);
    }

    @Override
    public Subbranch getByMobile(String mobile) {
        return subbranService.getByMobile(mobile);
    }

    @Override
    public VtwoStoreRole getStoreRoleInfo(String mobile) {
        Subbranch subbranch = new Subbranch();
        subbranch = subbranService.getByMobile(mobile);
        return vtwoStoreRoleService.get(Conds.get().eq("store_id", subbranch.getId()));
    }
}
