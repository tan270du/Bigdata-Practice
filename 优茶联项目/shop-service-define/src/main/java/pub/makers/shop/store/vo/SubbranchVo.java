package pub.makers.shop.store.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import pub.makers.shop.store.entity.BankCard;
import pub.makers.shop.store.entity.StoreLevel;
import pub.makers.shop.store.entity.Subbranch;

/**
 * Created by dy on 2017/4/14.
 */
public class SubbranchVo implements Serializable{

    private String id;

    private String name;

    private String userName;

    private String mobile;

    private String levelId;

    private String levelName;

    private Integer state;

    private String password;

    private String headImgUrl;

    private String email;

    private String weixin;

    private String description;

    private String number;

    private String createBy;

    private Date createTime;

    private String isValid;

    private String storeId;

    private Date updateTime;

    private String province;

    private String city;

    private String country;

    private String address;

    private String phone;

    private String provinceName;

    private String countryName;

    private String cityName;

    private String departmentNum;

    private String roleName;

    private String memo;

    private String recommendUserName;
    private Integer verify;
    private List<ImageVo> picList;
    private String shopPhoto;
    private String businessContent;
    private Integer updateStatus;
    private String reason;
    private Long bankCardId;
    private String bankName;
    private String bankCard;
    private String recommendUser;
    private Integer status;
    private String roleId;

    private String lat;
    private String lng;
    
    private StoreLevel storeLevel;
    private BankCard bankCardInfo;
    private String loginToken;

    public String getRecommendUserId() {
        return recommendUserId;
    }

    public void setRecommendUserId(String recommendUserId) {
        this.recommendUserId = recommendUserId;
    }

    private String recommendUserId;
    private String concatName;
    private String concatPhone;
    private String recommendDegree;
    private String businessImgUrl;
    private String cardindexImgUrl;
    private String cardbackImgUrl;
    private String taxImgUrl;

    private String idCardIndex;
    private String idCardBack;
    private String businessLicence;
    private String taxPhoto;

    //银行卡
    private String bankUserName;
    private String idCard;
    private String bankMobile;
    private Integer delet;
    private Long connectId;
    private String connectName;
    private Integer connectType;
    private String connectTypeName;
    private String bankAddress;
    private String verifyCode;
    private String parentSubranchId;

    private String token;

    private VtwoStoreRoleVo storeRole;


    private String isSubAccount;

    public String getIsSubAccount() {
        return isSubAccount;
    }

    public void setIsSubAccount(String isSubAccount) {
        this.isSubAccount = isSubAccount;
    }

    public String getParentSubranchId() {
        return parentSubranchId;
    }

    public void setParentSubranchId(String parentSubranchId) {
        this.parentSubranchId = parentSubranchId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Long getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Long bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRecommendUser() {
        return recommendUser;
    }

    public void setRecommendUser(String recommendUser) {
        this.recommendUser = recommendUser;
    }

    public Integer getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(Integer updateStatus) {
        this.updateStatus = updateStatus;
    }

    public Integer getVerify() {
        return verify;
    }

    public void setVerify(Integer verify) {
        this.verify = verify;
    }


    public String getConcatName() {
        return concatName;
    }

    public void setConcatName(String concatName) {
        this.concatName = concatName;
    }

    public String getConcatPhone() {
        return concatPhone;
    }

    public void setConcatPhone(String concatPhone) {
        this.concatPhone = concatPhone;
    }

    public String getRecommendDegree() {
        return recommendDegree;
    }

    public void setRecommendDegree(String recommendDegree) {
        this.recommendDegree = recommendDegree;
    }


    public String getBusinessImgUrl() {
        return businessImgUrl;
    }

    public void setBusinessImgUrl(String businessImgUrl) {
        this.businessImgUrl = businessImgUrl;
    }

    public String getCardindexImgUrl() {
        return cardindexImgUrl;
    }

    public void setCardindexImgUrl(String cardindexImgUrl) {
        this.cardindexImgUrl = cardindexImgUrl;
    }

    public String getCardbackImgUrl() {
        return cardbackImgUrl;
    }

    public void setCardbackImgUrl(String cardbackImgUrl) {
        this.cardbackImgUrl = cardbackImgUrl;
    }

    public String getTaxImgUrl() {
        return taxImgUrl;
    }

    public void setTaxImgUrl(String taxImgUrl) {
        this.taxImgUrl = taxImgUrl;
    }


    public String getShopPhoto() {
        return shopPhoto;
    }

    public void setShopPhoto(String shopPhoto) {
        this.shopPhoto = shopPhoto;
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

    public String getProvinceName() {
        return provinceName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRecommendUserName() {
        return recommendUserName;
    }

    public void setRecommendUserName(String recommendUserName) {
        this.recommendUserName = recommendUserName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<ImageVo> getPicList() {
        return picList;
    }

    public void setPicList(List<ImageVo> picList) {
        this.picList = picList;
    }

    public String getBusinessContent() {
        return businessContent;
    }

    public void setBusinessContent(String businessContent) {
        this.businessContent = businessContent;
    }

    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBankMobile() {
        return bankMobile;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile;
    }

    public Integer getDelet() {
        return delet;
    }

    public void setDelet(Integer delet) {
        this.delet = delet;
    }

    public Long getConnectId() {
        return connectId;
    }

    public void setConnectId(Long connectId) {
        this.connectId = connectId;
    }

    public String getConnectName() {
        return connectName;
    }

    public void setConnectName(String connectName) {
        this.connectName = connectName;
    }

    public Integer getConnectType() {
        return connectType;
    }

    public void setConnectType(Integer connectType) {
        this.connectType = connectType;
    }

    public String getConnectTypeName() {
        return connectTypeName;
    }

    public void setConnectTypeName(String connectTypeName) {
        this.connectTypeName = connectTypeName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public VtwoStoreRoleVo getStoreRole() {
        return storeRole;
    }

    public void setStoreRole(VtwoStoreRoleVo storeRole) {
        this.storeRole = storeRole;
    }

    public static SubbranchVo fromSubbranch(Subbranch subbranch) {
        SubbranchVo vo = new SubbranchVo();
        vo.setId(subbranch.getId().toString());
        vo.setName(subbranch.getName());
        vo.setUserName(subbranch.getUserName());
        vo.setMobile(subbranch.getMobile());
        vo.setLevelId(subbranch.getLevelId() == null ? null : subbranch.getLevelId().toString());
        vo.setState(subbranch.getState());
        vo.setPassword(subbranch.getPassword());
        vo.setHeadImgUrl(subbranch.getHeadImgUrl());
        vo.setEmail(subbranch.getEmail());
        vo.setWeixin(subbranch.getWeixin());
        vo.setDescription(subbranch.getDescription());
        vo.setNumber(subbranch.getNumber());
        vo.setCreateBy(subbranch.getCreateBy() == null ? null : subbranch.getCreateBy().toString());
        vo.setCreateTime(subbranch.getCreateTime());
        vo.setStoreId(subbranch.getStoreId() == null ? null : subbranch.getStoreId().toString());
        vo.setUpdateTime(subbranch.getUpdateTime());
        vo.setProvince(subbranch.getProvince());
        vo.setCity(subbranch.getCity());
        vo.setCountry(subbranch.getCountry());
        vo.setAddress(subbranch.getAddress());
        vo.setLat(subbranch.getLat() == null ? null : subbranch.getLat().toString());
        vo.setLng(subbranch.getLng() == null ? null : subbranch.getLng().toString());
        vo.setPhone(subbranch.getPhone());
        vo.setProvinceName(subbranch.getProvinceName());
        vo.setCountryName(subbranch.getCountryName());
        vo.setCityName(subbranch.getCityName());
        vo.setIsSubAccount(subbranch.getIsSubAccount());
        vo.setDepartmentNum(subbranch.getDepartmentNum());
        return vo;
    }

	public StoreLevel getStoreLevel() {
		return storeLevel;
	}

	public void setStoreLevel(StoreLevel storeLevel) {
		this.storeLevel = storeLevel;
	}

	public BankCard getBankCardInfo() {
		return bankCardInfo;
	}

	public void setBankCardInfo(BankCard bankCardInfo) {
		this.bankCardInfo = bankCardInfo;
	}

	public String getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
    
}
