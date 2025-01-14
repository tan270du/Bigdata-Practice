package pub.makers.shop.store.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kok on 2017/6/6.
 */
public class SubbranchInfo implements Serializable {
    private String id;
    private String name; // 店铺名称
    private String mobile; //注册号码
    private String password; //密码
    private String recommendUser; //邀请人
    private String userName; // 店长名称
    private String provinceName; // 省份
    private String weixin; //微信
    private String phone; //门店电话
    private String cityName; // 城市
    private String countryName; //区
    private String address; // 地址
    private String province;
    private String city;
    private String country;
    private String description; // 店铺简介
    private String headImgUrl; // 头像
    private String idCardIndex; // 身份证正面
    private String idCardBack; // 身份证反面
    private String businessLicence; // 营业执照
    private String taxPhoto; // 税务登记照
    private List<String> delPicList = new ArrayList<String>(); // 删除图片id列表
    private List<String> addPicList = new ArrayList<String>(); // 添加图片url列表

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRecommendUser() {
        return recommendUser;
    }

    public void setRecommendUser(String recommendUser) {
        this.recommendUser = recommendUser;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdCardIndex() {
        return idCardIndex;
    }

    public void setIdCardIndex(String idCardIndex) {
        this.idCardIndex = idCardIndex;
    }

    public String getIdCardBack() {
        return idCardBack;
    }

    public void setIdCardBack(String idCardBack) {
        this.idCardBack = idCardBack;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<String> getDelPicList() {
        return delPicList;
    }

    public void setDelPicList(List<String> delPicList) {
        this.delPicList = delPicList;
    }

    public List<String> getAddPicList() {
        return addPicList;
    }

    public void setAddPicList(List<String> addPicList) {
        this.addPicList = addPicList;
    }

    public String getBusinessLicence() {
        return businessLicence;
    }

    public void setBusinessLicence(String businessLicence) {
        this.businessLicence = businessLicence;
    }

    public String getTaxPhoto() {
        return taxPhoto;
    }

    public void setTaxPhoto(String taxPhoto) {
        this.taxPhoto = taxPhoto;
    }
}
