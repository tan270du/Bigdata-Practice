package pub.makers.shop.baseOrder.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderPresellExtra implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private String id;		
	
	/** 订单ID */
	private String orderId;		
	
	/** 预售类型 */
	private String presellType;		
	
	/** 预售活动ID */
	private String presellActivityId;		
	
	/** 删除状态 */
	private String delFlag;		
	
	/** 预售首款 */
	private BigDecimal presellFirst;
	
	/** 预售尾款 */
	private BigDecimal presellEnd;

	/** 预售价 */
	private BigDecimal presellAmount;

	/** 创建时间 */
	private Date dateCreated;		
	
	/** 更新时间 */
	private Date lastUpdated;		
	

	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
	public String getOrderId(){
		return orderId;
	}
	
	public void setPresellType(String presellType){
		this.presellType = presellType;
	}
	
	public String getPresellType(){
		return presellType;
	}
	
	public void setPresellActivityId(String presellActivityId){
		this.presellActivityId = presellActivityId;
	}
	
	public String getPresellActivityId(){
		return presellActivityId;
	}
	
	public void setDelFlag(String delFlag){
		this.delFlag = delFlag;
	}
	
	public String getDelFlag(){
		return delFlag;
	}
	
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public void setLastUpdated(Date lastUpdated){
		this.lastUpdated = lastUpdated;
	}
	
	public Date getLastUpdated(){
		return lastUpdated;
	}

	public BigDecimal getPresellFirst() {
		return presellFirst;
	}

	public void setPresellFirst(BigDecimal presellFirst) {
		this.presellFirst = presellFirst;
	}

	public BigDecimal getPresellEnd() {
		return presellEnd;
	}

	public void setPresellEnd(BigDecimal presellEnd) {
		this.presellEnd = presellEnd;
	}

	public BigDecimal getPresellAmount() {
		return presellAmount;
	}

	public void setPresellAmount(BigDecimal presellAmount) {
		this.presellAmount = presellAmount;
	}
}
