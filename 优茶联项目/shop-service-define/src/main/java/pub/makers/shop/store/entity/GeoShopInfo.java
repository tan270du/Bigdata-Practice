package pub.makers.shop.store.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 百度地图采集到的店铺信息
 * @author apple
 *
 */
public class GeoShopInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String uid;
	private String storeId;
	private String address;
	private String city;
	private String detailUrl;
	private String isAccurate;
	private String phoneNumber;
	private double[] loc;
	private String postcode;
	private String province;
	private String title;
	private String type;
	private String url;
	private Date firstDisTime;
	private Date cooperationTime;
	private String mainUser;
	private String discussStatus;
	/** 加盟状态 */
	private String joinStatus;
	/** 地区ID */
	private String regionId;
	private double distance;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDetailUrl() {
		return detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	public String getIsAccurate() {
		return isAccurate;
	}
	public void setIsAccurate(String isAccurate) {
		this.isAccurate = isAccurate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double[] getLoc() {
		return loc;
	}
	public void setLoc(double[] loc) {
		this.loc = loc;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getJoinStatus() {
		return joinStatus;
	}
	public void setJoinStatus(String joinStatus) {
		this.joinStatus = joinStatus;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getFirstDisTime() {
		return firstDisTime;
	}
	public void setFirstDisTime(Date firstDisTime) {
		this.firstDisTime = firstDisTime;
	}
	public Date getCooperationTime() {
		return cooperationTime;
	}
	public void setCooperationTime(Date cooperationTime) {
		this.cooperationTime = cooperationTime;
	}
	public String getMainUser() {
		return mainUser;
	}
	public void setMainUser(String mainUser) {
		this.mainUser = mainUser;
	}
	public String getDiscussStatus() {
		return discussStatus;
	}
	public void setDiscussStatus(String discussStatus) {
		this.discussStatus = discussStatus;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
