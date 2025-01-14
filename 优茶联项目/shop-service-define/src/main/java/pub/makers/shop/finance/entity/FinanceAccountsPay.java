package pub.makers.shop.finance.entity;

import java.io.Serializable;
import java.util.Date;

import pub.makers.shop.tradeOrder.entity.Indent;

public class FinanceAccountsPay implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Long id;		
	
	/** 单据号 */
	private String code;	
	
	/** 订单 */
	private Long orderId;
	
	/** 是否导入 */
	private Integer statue;		
	
	/** 单据类型("48":收款单，"49":付款单) */
	private String vouchtype;
	
	/** 单据日期 */
	private Date vouchdate;
	
	/** 客户ID */
	private Long customerid;
	
	/** 客户编码 */
	private String customercode;
	
	/** 客户名称 */
	private String customername;
	
	/** 部门编码 */
	private String departmentcode;
	
	/** 摘要(收款单据号+备注） */
	private String digest;		
	
	/** 结算方式 */
	private String balancecode;
	
	/** 结算科目 */
	private String balanceitemcode;
	
	/** 币种 */
	private String foreigncurrency;
	
	/** 汇率(默认1.0） */
	private Double currencyrate;
	
	/** 金额*/
	private Double amount;		
	
	/** 本币金额 */
	private Double originalamount;
	
	/** 操作人 */
	private String operator;		
	
	/** 应收应付标志 ("AR":应收,"AP":应付,空:其他) 应收系统的收付款写为"AR"，应付系统的收付款单写为"AP"*/
	private String flag;		
	
	/** 备注 */
	private String note;		
	
	/** U8销售订单Id */
	private String u8OrderId;
	
	/** U8收付款单Id */
	private String u8AccountsId;
	
	/** 创建时间 */
	private Date createTime;		
	
	/** 更新时间 */
	private Date updateTime;
	
	private Indent indent;

	private String name;

	private String orderType;

	private String orderBizType;

	public String getOrderBizType() {
		return orderBizType;
	}

	public void setOrderBizType(String orderBizType) {
		this.orderBizType = orderBizType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getStatue() {
		return statue;
	}

	public void setStatue(Integer statue) {
		this.statue = statue;
	}

	public String getVouchtype() {
		return vouchtype;
	}

	public void setVouchtype(String vouchtype) {
		this.vouchtype = vouchtype;
	}

	public Date getVouchdate() {
		return vouchdate;
	}

	public void setVouchdate(Date vouchdate) {
		this.vouchdate = vouchdate;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getCustomercode() {
		return customercode;
	}

	public void setCustomercode(String customercode) {
		this.customercode = customercode;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getDepartmentcode() {
		return departmentcode;
	}

	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getBalancecode() {
		return balancecode;
	}

	public void setBalancecode(String balancecode) {
		this.balancecode = balancecode;
	}

	public String getBalanceitemcode() {
		return balanceitemcode;
	}

	public void setBalanceitemcode(String balanceitemcode) {
		this.balanceitemcode = balanceitemcode;
	}

	public String getForeigncurrency() {
		return foreigncurrency;
	}

	public void setForeigncurrency(String foreigncurrency) {
		this.foreigncurrency = foreigncurrency;
	}

	public Double getCurrencyrate() {
		return currencyrate;
	}

	public void setCurrencyrate(Double currencyrate) {
		this.currencyrate = currencyrate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getOriginalamount() {
		return originalamount;
	}

	public void setOriginalamount(Double originalamount) {
		this.originalamount = originalamount;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getU8OrderId() {
		return u8OrderId;
	}

	public void setU8OrderId(String u8OrderId) {
		this.u8OrderId = u8OrderId;
	}

	public String getU8AccountsId() {
		return u8AccountsId;
	}

	public void setU8AccountsId(String u8AccountsId) {
		this.u8AccountsId = u8AccountsId;
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

	public Indent getIndent() {
		return indent;
	}

	public void setIndent(Indent indent) {
		this.indent = indent;
	}
}
