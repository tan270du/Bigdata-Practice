package pub.makers.shop.tradeOrder.vo;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import pub.makers.shop.base.utils.DateParseUtil;
import pub.makers.shop.tradeOrder.entity.Indent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2017/5/9.
 */
public class IndentParams implements Serializable {

    private String goodSku;     //商品SKU
    private String cargoNo;     //商品SKU编码
    private String goodName;    //商品名称
    private String buyerName;   //买家昵称
    private String orderNo;     //订单号
    private String storeName;   //店铺名称
    private String storeNum;    //店铺编码
    private String storeDeptNum;    //部门编码
    private String receiver;    //收货人姓名
    private String receiverPhone;   //收货人电话
    private String buyType; //购买类型
    private String province;    //省名称
    private String city;    //城市名称
    private String country;    //区名称
    private String provinceId;    //省ID
    private String cityId;    //城市ID
    private String countryId;    //区ID
    private String type;    //订单类型
    private String indentStatusStr;    //订单状态
    private String dealStatus;
    private List<String> indentStatus;    //订单状态
    private String afterSaleService;     //售后服务
    private String preSellStatusStr;     //预售状态
    private String presellStatus;       //预售状态
    private List<String> preSellStatus;     //预售状态
    private Date startCreateTime;
    private Date endCreateTime;
    private String startTimeStr;
    private String endTimeStr;
    private String ids; //订单串
    private Integer exportExcelType;
    private String address;
    private String id;

    private String isRemarkInfo;
    private Integer needInvoice;

    private String orderType;
    private String concatName;

    private String orderSource;

    private String indentShopType;

    private String weixinTraderId;

    public String getWeixinTraderId() {
        return weixinTraderId;
    }

    public void setWeixinTraderId(String weixinTraderId) {
        this.weixinTraderId = weixinTraderId;
    }

    public String getPresellStatus() {
        return presellStatus;
    }

    public void setPresellStatus(String presellStatus) {
        this.presellStatus = presellStatus;
    }

    public String getIndentShopType() {
        return indentShopType;
    }

    public void setIndentShopType(String indentShopType) {
        this.indentShopType = indentShopType;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getConcatName() {
        return concatName;
    }

    public void setConcatName(String concatName) {
        this.concatName = concatName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(Integer needInvoice) {
        this.needInvoice = needInvoice;
    }

    public String getCargoNo() {
        if (StringUtils.isBlank(this.cargoNo)) {
            return null;
        }
        return cargoNo;
    }

    public void setCargoNo(String cargoNo) {
        this.cargoNo = cargoNo;
    }

    public String getIsRemarkInfo() {
        if (StringUtils.isBlank(this.isRemarkInfo)) {
            return null;
        }
        return isRemarkInfo;
    }

    public void setIsRemarkInfo(String isRemarkInfo) {
        this.isRemarkInfo = isRemarkInfo;
    }

    public String getId() {
        if (StringUtils.isBlank(this.id)) {
            return null;
        }
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        if (StringUtils.isBlank(this.address)) {
            return null;
        }
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getExportExcelType() {
        return exportExcelType;
    }

    public void setExportExcelType(Integer exportExcelType) {
        this.exportExcelType = exportExcelType;
    }

    public String getIds() {
        if (StringUtils.isBlank(this.ids)) {
            return null;
        }
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getDealStatus() {
        if (StringUtils.isBlank(this.dealStatus)) {
            return null;
        }
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getGoodSku() {
        if (StringUtils.isBlank(this.goodSku)) {
            return null;
        }
        return goodSku;
    }

    public void setGoodSku(String goodSku) {
        this.goodSku = goodSku;
    }

    public String getGoodName() {
        if (StringUtils.isBlank(this.goodName)) {
            return null;
        }
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getBuyerName() {
        if (StringUtils.isBlank(this.buyerName)) {
            return null;
        }
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getOrderNo() {
        if (StringUtils.isBlank(this.orderNo)) {
            return null;
        }
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getStoreName() {
        if (StringUtils.isBlank(this.storeName)) {
            return null;
        }
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreNum() {
        if (StringUtils.isBlank(this.storeNum)) {
            return null;
        }
        return storeNum;
    }

    public void setStoreNum(String storeNum) {
        this.storeNum = storeNum;
    }

    public String getStoreDeptNum() {
        if (StringUtils.isBlank(this.storeDeptNum)) {
            return null;
        }
        return storeDeptNum;
    }

    public void setStoreDeptNum(String storeDeptNum) {
        this.storeDeptNum = storeDeptNum;
    }

    public String getReceiver() {
        if (StringUtils.isBlank(this.receiver)) {
            return null;
        }
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiverPhone() {

        if (StringUtils.isBlank(this.receiverPhone)) {
            return null;
        }

        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getBuyType() {
        if (StringUtils.isBlank(this.buyType)) {
            return null;
        }
        return buyType;
    }

    public void setBuyType(String buyType) {
        this.buyType = buyType;
    }

    public String getProvince() {
        if (StringUtils.isBlank(this.province)) {
            return null;
        }
        if ("---请选择---".equals(this.province)) {
            return null;
        }
        return province;
    }

    public void setProvince(String province) {
        if ("-1".equals(province)) {
            this.province = null;
        } else {
            this.province = province;
        }
    }

    public String getCity() {
        if (StringUtils.isBlank(this.city)) {
            return null;
        }
        if ("---请选择---".equals(this.city)) {
            return null;
        }
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCountry() {
        if (StringUtils.isBlank(this.country)) {
            return null;
        }
        if ("---请选择---".equals(this.country)) {
            return null;
        }
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getType() {
        if (StringUtils.isBlank(this.type)) {
            return null;
        }
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndentStatusStr() {
        if (StringUtils.isBlank(this.indentStatusStr)) {
            return null;
        }
        return indentStatusStr;
    }

    public void setIndentStatusStr(String indentStatusStr) {
        List<String> stringList = new ArrayList<String>();
        if (StringUtils.isNotBlank(indentStatusStr)) {
            String[] status = indentStatusStr.split(",");
            for (String statu : status) {
                stringList.add(statu);
            }
            this.indentStatus = stringList;
        }

        this.indentStatusStr = indentStatusStr;
    }

    public List<String> getIndentStatus() {
        return indentStatus;
    }

    public void setIndentStatus(List<String> indentStatus) {
        this.indentStatus = indentStatus;
    }

    public String getAfterSaleService() {
        if (StringUtils.isBlank(this.afterSaleService)) {
            return null;
        }
        return afterSaleService;
    }

    public void setAfterSaleService(String afterSaleService) {
        this.afterSaleService = afterSaleService;
    }

    public String getPreSellStatusStr() {
        if (StringUtils.isBlank(this.preSellStatusStr)) {
            return null;
        }
        return preSellStatusStr;
    }

    public void setPreSellStatusStr(String preSellStatusStr) {
        List<String> stringList = new ArrayList<String>();
        if (StringUtils.isNotBlank(preSellStatusStr)) {
            String[] status = preSellStatusStr.split(",");
            for (String statu : status) {
                stringList.add(statu);
            }
            this.preSellStatus = stringList;
        }
        this.preSellStatusStr = preSellStatusStr;
    }

    public List<String> getPreSellStatus() {
        return preSellStatus;
    }

    public void setPreSellStatus(List<String> preSellStatus) {
        this.preSellStatus = preSellStatus;
    }

    public Date getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(Date startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public Date getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(Date endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public String getStartTimeStr() {
        if (StringUtils.isBlank(this.startTimeStr)) {
            return null;
        }
        return startTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        if (StringUtils.isNotBlank(startTimeStr)) {
            this.startCreateTime = DateParseUtil.simpleDateFormat(startTimeStr, "yyyy-MM-dd HH:mm:ss");
        }
        this.startTimeStr = startTimeStr;
    }

    public String getEndTimeStr() {
        if (StringUtils.isBlank(this.endTimeStr)) {
            return null;
        }
        return endTimeStr;
    }

    public void setEndTimeStr(String endTimeStr) {
        if (StringUtils.isNotBlank(endTimeStr)) {
            this.endCreateTime = DateParseUtil.simpleDateFormat(endTimeStr, "yyyy-MM-dd HH:mm:ss");
        }
        this.endTimeStr = endTimeStr;
    }
}
