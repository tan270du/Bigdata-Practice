package pub.makers.shop.user.entity;

import org.apache.commons.lang.StringUtils;
import pub.makers.shop.user.vo.WeixinStoreWeixinuserVo;

import java.io.Serializable;
import java.util.Date;

public class WeixinStoreWeixinuser implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Long id;
	
	/** 分店ID */
	private Long storeId;		
	
	/** 微信粉丝ID */
	private Long weixinuserId;

	private Long subscribe;
	private Date subscribeTime;
	private String nickname;

	private Integer sex;

	private String country;

	private String province;

	private String city;

	private String language;

	private String headImgUrl;

	private String userName;

	private String tel;

	private Date birthday;

	private String weixinNum;

	private String personSign;

	private Date dateCreated;

	private String address;

	private String remark;


	public WeixinStoreWeixinuser() {
	}

	public WeixinStoreWeixinuser(WeixinStoreWeixinuserVo weixinStoreWeixinuserVo) {
		this.storeId = Long.parseLong(weixinStoreWeixinuserVo.getStoreId());
		this.weixinuserId = Long.parseLong(weixinStoreWeixinuserVo.getWeixinuserId());
		this.subscribe = Long.parseLong(weixinStoreWeixinuserVo.getSubscribe());
		this.subscribeTime = weixinStoreWeixinuserVo.getSubscribeTime();
		this.nickname = weixinStoreWeixinuserVo.getNickname();
		this.sex = weixinStoreWeixinuserVo.getSex();
		this.country = weixinStoreWeixinuserVo.getCountry();
		this.province = weixinStoreWeixinuserVo.getCity();
		this.city = weixinStoreWeixinuserVo.getCity();
		this.language = weixinStoreWeixinuserVo.getLanguage();
		this.headImgUrl = weixinStoreWeixinuserVo.getHeadImgUrl();
		this.userName = weixinStoreWeixinuserVo.getUserName();
		this.tel = weixinStoreWeixinuserVo.getTel();
		this.birthday = weixinStoreWeixinuserVo.getBirthday();
		this.weixinNum = weixinStoreWeixinuserVo.getWeixinNum();
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}
	
	public Long getStoreId(){
		return storeId;
	}
	
	public void setWeixinuserId(Long weixinuserId){
		this.weixinuserId = weixinuserId;
	}
	
	public Long getWeixinuserId(){
		return weixinuserId;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Long getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(Long subscribe) {
		this.subscribe = subscribe;
	}

	public Date getSubscribeTime() {
		return subscribeTime;
	}

	public void setSubscribeTime(Date subscribeTime) {
		this.subscribeTime = subscribeTime;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getWeixinNum() {
		return weixinNum;
	}

	public void setWeixinNum(String weixinNum) {
		this.weixinNum = weixinNum;
	}

	public String getPersonSign() {
		return personSign;
	}

	public void setPersonSign(String personSign) {
		this.personSign = personSign;
	}

	public void resetProperties(WeixinStoreWeixinuserVo weixinStoreWeixinuserVo) {
		this.storeId = Long.parseLong(weixinStoreWeixinuserVo.getStoreId());
		this.weixinuserId = Long.parseLong(weixinStoreWeixinuserVo.getWeixinuserId());
		this.subscribe = StringUtils.isNotBlank(weixinStoreWeixinuserVo.getSubscribe()) ? Long.parseLong(weixinStoreWeixinuserVo.getSubscribe()) : null;
		this.subscribeTime = weixinStoreWeixinuserVo.getSubscribeTime();
		this.nickname = weixinStoreWeixinuserVo.getNickname();
		this.sex = weixinStoreWeixinuserVo.getSex();
		this.country = weixinStoreWeixinuserVo.getCountry();
		this.province = weixinStoreWeixinuserVo.getCity();
		this.city = weixinStoreWeixinuserVo.getCity();
		this.language = weixinStoreWeixinuserVo.getLanguage();
		this.headImgUrl = weixinStoreWeixinuserVo.getHeadImgUrl();
		this.userName = weixinStoreWeixinuserVo.getUserName();
		this.tel = weixinStoreWeixinuserVo.getTel();
		this.birthday = weixinStoreWeixinuserVo.getBirthday();
		this.weixinNum = weixinStoreWeixinuserVo.getWeixinNum();
		this.address = weixinStoreWeixinuserVo.getAddress();
		this.remark = weixinStoreWeixinuserVo.getRemark();
	}
}
