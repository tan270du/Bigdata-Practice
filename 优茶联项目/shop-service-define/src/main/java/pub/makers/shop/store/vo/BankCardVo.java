package pub.makers.shop.store.vo;

import pub.makers.shop.store.entity.BankCard;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kok on 2017/7/21.
 */
public class BankCardVo implements Serializable {
    /** 主键 */
    private String bankCardId;

    /** 是否经用 */
    private Integer state;

    /** 姓名 */
    private String name;

    /** 身份证 */
    private String idCard;

    /** 银行卡名称 */
    private String bankName;

    /** 银行卡号 */
    private String bankCard;

    /** 银行预留手机号 */
    private String mobile;

    /**  */
    private Date updateTime;

    /**  */
    private Date createTime;

    /** 是否删除 */
    private Integer delet;

    /** 关联ID（店铺或者会员） */
    private String connectId;

    /** 关联类型(1:分店;0:会员;2:总店) */
    private Integer connectType;

    /** 开户行 */
    private String bankAddress;

    public BankCardVo() {
    }

    public BankCardVo(BankCard bankCard) {
        if (bankCard == null) {
            return;
        }
        this.bankCardId = bankCard.getBankCardId() == null ? null : bankCard.getBankCardId().toString();
        this.state = bankCard.getState();
        this.name = bankCard.getName();
        this.idCard = bankCard.getIdCard();
        this.bankName = bankCard.getBankName();
        this.bankCard = bankCard.getBankCard();
        this.mobile = bankCard.getMobile();
        this.updateTime = bankCard.getUpdateTime();
        this.createTime = bankCard.getCreateTime();
        this.connectId = bankCard.getConnectId() == null ? null : bankCard.getConnectId().toString();
        this.connectType = bankCard.getConnectType();
        this.bankAddress = bankCard.getBankAddress();
    }

    public String getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDelet() {
        return delet;
    }

    public void setDelet(Integer delet) {
        this.delet = delet;
    }

    public String getConnectId() {
        return connectId;
    }

    public void setConnectId(String connectId) {
        this.connectId = connectId;
    }

    public Integer getConnectType() {
        return connectType;
    }

    public void setConnectType(Integer connectType) {
        this.connectType = connectType;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public BankCard toBankCard() {
        BankCard bankCard = new BankCard();
        bankCard.setBankCardId(this.getBankCardId() == null ? null : Long.valueOf(this.getBankCardId()));
        bankCard.setState(this.getState());
        bankCard.setName(this.getName());
        bankCard.setIdCard(this.getIdCard());
        bankCard.setBankName(this.getBankName());
        bankCard.setBankCard(this.getBankCard());
        bankCard.setMobile(this.getMobile());
        bankCard.setConnectId(this.getConnectId() == null ? null : Long.valueOf(this.getConnectId()));
        bankCard.setConnectType(this.getConnectType());
        bankCard.setBankAddress(this.getBankAddress());
        return bankCard;
    }
}
