package pub.makers.shop.purchaseOrder.entity;

import pub.makers.shop.baseOrder.pojo.BaseOrderItem;
import pub.makers.shop.purchaseOrder.vo.PurchaseOrderListVo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by dy on 2017/4/14.
 */
public class PurchaseOrderList extends BaseOrderItem {

    /**
	 * 
	 */
	private static final long serialVersionUID = -789959024759175387L;
	
	private String id;          //主键id
    private String orderId;     //订单id
    private String purGoodsSkuId;   //商品sku的id
    private int number;             //数量
    private String purGoodsName;    //商品名称
    private String purGoodsImgUrl;  //商品缩略图URL
    private String purGoodsType;        //商品类型
    private double supplyPrice;         //供货价
    private String materialSkuId;   //货品skuId
    private Date createTime;        //创建时间
    private String purServicePackingId;     //打包服务id
    private String purPackingBagId;         //打包包装id
    private String packingImageId;          //打包图片id
    private String purGoodsId;              //商品id
    private String isSample;                //是否是样品  0，不是，1，是
    private String purPackingPrice; //代包装服务价格
    private String purPackingBagValue; //代包装服务克数
    private String packingImageUrl; //代包装服务图片
    private String postId;          //邮费规则
    private String packingStyleCode; //代包编码
    private String packingStyleName; //代包名称
    private Integer isEvalution;// 是否评论 0 否  1是
    private String purGoodsCode;//进货商品编码

    private int startNum;
    private int leftNums;

    private String packNum;//代包个数（500/bagValue*PackingPrice）
    private String isPur;           //是否散茶
    private String[] priceChannel;  //价格区间

    private String materialSkuName;

    private String cargoSkuId; //货品skuid
    private Integer shipReturnTime; //发货前申请售后次数
    private Integer returnTime; //发货后申请售后次数
    private String isValid; //是否有效
    private String delFlag; //删除状态
    private Date lastUpdated; //更新时间
    private String giftFlag; //赠品标识
    private String status; //订单商品状态
    
    private BigDecimal purGoodsAmount;  // 商品原价（市场指导价格）
    private BigDecimal originalAmount; //原价
    private BigDecimal sumAmount;       // 商品订单总价   =市场指导价*数量
    private BigDecimal finalAmount;     //成 交价   = 供货价*数量-优惠金额
    private BigDecimal discountAmount; //优惠金额
    private BigDecimal returnAmount; //已退款金额
    private String shipCancelAfter; //发货前撤销售后申请
    private String receiveCancelAfter; //发货后撤销售后申请
    private String goodType; //商品类型

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getItemId() {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPurGoodsSkuId() {
        return purGoodsSkuId;
    }

    public void setPurGoodsSkuId(String purGoodsSkuId) {
        this.purGoodsSkuId = purGoodsSkuId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getPurGoodsName() {
        return purGoodsName;
    }

    public void setPurGoodsName(String purGoodsName) {
        this.purGoodsName = purGoodsName;
    }

    public String getPurGoodsImgUrl() {
        return purGoodsImgUrl;
    }

    public void setPurGoodsImgUrl(String purGoodsImgUrl) {
        this.purGoodsImgUrl = purGoodsImgUrl;
    }

    public BigDecimal getPurGoodsAmount() {
        return purGoodsAmount;
    }

    public void setPurGoodsAmount(BigDecimal purGoodsAmount) {
        this.purGoodsAmount = purGoodsAmount;
    }

    public String getPurGoodsType() {
        return purGoodsType;
    }

    public void setPurGoodsType(String purGoodsType) {
        this.purGoodsType = purGoodsType;
    }

    public double getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(double supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public String getMaterialSkuId() {
        return materialSkuId;
    }

    public void setMaterialSkuId(String materialSkuId) {
        this.materialSkuId = materialSkuId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPurServicePackingId() {
        return purServicePackingId;
    }

    public void setPurServicePackingId(String purServicePackingId) {
        this.purServicePackingId = purServicePackingId;
    }

    public String getPurPackingBagId() {
        return purPackingBagId;
    }

    public void setPurPackingBagId(String purPackingBagId) {
        this.purPackingBagId = purPackingBagId;
    }

    public String getPackingImageId() {
        return packingImageId;
    }

    public void setPackingImageId(String packingImageId) {
        this.packingImageId = packingImageId;
    }

    public String getPurGoodsId() {
        return purGoodsId;
    }

    public void setPurGoodsId(String purGoodsId) {
        this.purGoodsId = purGoodsId;
    }

    public String getIsSample() {
        return isSample;
    }

    @Override
    public void setMessageList(List<String> messageList) {

    }

    public void setIsSample(String isSample) {
        this.isSample = isSample;
    }

    public BigDecimal getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(BigDecimal sumAmount) {
        this.sumAmount = sumAmount;
    }

    public String getPurPackingPrice() {
        return purPackingPrice;
    }

    public void setPurPackingPrice(String purPackingPrice) {
        this.purPackingPrice = purPackingPrice;
    }

    public String getPurPackingBagValue() {
        return purPackingBagValue;
    }

    public void setPurPackingBagValue(String purPackingBagValue) {
        this.purPackingBagValue = purPackingBagValue;
    }

    public String getPackingImageUrl() {
        return packingImageUrl;
    }

    public void setPackingImageUrl(String packingImageUrl) {
        this.packingImageUrl = packingImageUrl;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPackingStyleCode() {
        return packingStyleCode;
    }

    public void setPackingStyleCode(String packingStyleCode) {
        this.packingStyleCode = packingStyleCode;
    }

    public String getPackingStyleName() {
        return packingStyleName;
    }

    public void setPackingStyleName(String packingStyleName) {
        this.packingStyleName = packingStyleName;
    }

    public Integer getIsEvalution() {
        return isEvalution;
    }

    public void setIsEvalution(Integer isEvalution) {
        this.isEvalution = isEvalution;
    }

    public String getPurGoodsCode() {
        return purGoodsCode;
    }

    public void setPurGoodsCode(String purGoodsCode) {
        this.purGoodsCode = purGoodsCode;
    }

    public int getStartNum() {
        return startNum;
    }

    public void setStartNum(int startNum) {
        this.startNum = startNum;
    }

    public int getLeftNums() {
        return leftNums;
    }

    public void setLeftNums(int leftNums) {
        this.leftNums = leftNums;
    }

    public String getPackNum() {
        return packNum;
    }

    public void setPackNum(String packNum) {
        this.packNum = packNum;
    }

    public String getIsPur() {
        return isPur;
    }

    public void setIsPur(String isPur) {
        this.isPur = isPur;
    }

    public String[] getPriceChannel() {
        return priceChannel;
    }

    public void setPriceChannel(String[] priceChannel) {
        this.priceChannel = priceChannel;
    }

    public String getMaterialSkuName() {
        return materialSkuName;
    }

    public void setMaterialSkuName(String materialSkuName) {
        this.materialSkuName = materialSkuName;
    }

    public String getCargoSkuId() {
        return cargoSkuId;
    }

    public void setCargoSkuId(String cargoSkuId) {
        this.cargoSkuId = cargoSkuId;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public Integer getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Integer returnTime) {
        this.returnTime = returnTime;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getGiftFlag() {
        return giftFlag;
    }

    public void setGiftFlag(String giftFlag) {
        this.giftFlag = giftFlag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getShipCancelAfter() {
        return shipCancelAfter;
    }

    public void setShipCancelAfter(String shipCancelAfter) {
        this.shipCancelAfter = shipCancelAfter;
    }

    public String getReceiveCancelAfter() {
        return receiveCancelAfter;
    }

    public void setReceiveCancelAfter(String receiveCancelAfter) {
        this.receiveCancelAfter = receiveCancelAfter;
    }

    public Integer getShipReturnTime() {
        return shipReturnTime;
    }

    public void setShipReturnTime(Integer shipReturnTime) {
        this.shipReturnTime = shipReturnTime;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public static PurchaseOrderList  fromPurchaseOrderListVo(PurchaseOrderListVo vo) {
        PurchaseOrderList list = new PurchaseOrderList();
        list.setId(vo.getId());
        list.setOrderId(vo.getOrderId());
        list.setPurGoodsSkuId(vo.getPurGoodsSkuId());
        list.setCargoSkuId(vo.getCargoSkuId());
        list.setNumber(vo.getNumber());
        list.setFinalAmount(vo.getFinalAmount());
        list.setPurGoodsName(vo.getPurGoodsName());
        list.setPurGoodsCode(vo.getPurGoodsCode());
        list.setPurGoodsAmount(vo.getPurGoodsAmount());
        list.setPurGoodsType(vo.getPurGoodsType());
        list.setPurGoodsImgUrl(vo.getPurGoodsImgUrl());
        list.setSupplyPrice(vo.getSupplyPrice());
        list.setMaterialSkuId(vo.getMaterialSkuId());
        list.setMaterialSkuName(vo.getMaterialSkuName());
        list.setCreateTime(vo.getCreateTime());
        list.setPurServicePackingId(vo.getPurServicePackingId());
        list.setPurPackingBagId(vo.getPurPackingBagId());
        list.setPurPackingBagValue(vo.getPurPackingBagValue());
        list.setPurPackingPrice(vo.getPurPackingPrice());
        list.setPackingImageId(vo.getPackingImageId());
        list.setPackingImageUrl(vo.getPackingImageUrl());
        list.setPurGoodsId(vo.getPurGoodsId());
        list.setIsSample(vo.getIsSample());
        list.setSumAmount(vo.getSumAmount());
        list.setPostId(vo.getPostId());
        list.setPackingStyleCode(vo.getPackingStyleCode());
        list.setPackingStyleName(vo.getPackingStyleName());
        list.setIsEvalution(vo.getIsEvalution());
        list.setDiscountAmount(vo.getDiscountAmount());
        list.setOriginalAmount(vo.getOriginalAmount());
        list.setShipReturnTime(vo.getShipReturnTime());
        list.setReturnTime(vo.getReturnTime());
        list.setIsValid(vo.getIsValid());
        list.setDelFlag(vo.getDelFlag());
        list.setLastUpdated(vo.getLastUpdated());
        list.setGiftFlag(vo.getGiftFlag());
        list.setReturnAmount(vo.getReturnAmount());
        list.setStatus(vo.getStatus());
        list.setShipCancelAfter(vo.getShipCancelAfter());
        list.setReceiveCancelAfter(vo.getReceiveCancelAfter());
        list.setGoodType(vo.getGoodType());
        return list;
    }

	@Override
	public String getGoodSkuId() {
		return purGoodsSkuId;
	}

	@Override
	public int getBuyNum() {
		return number;
	}

	@Override
	public BigDecimal getGoodPrice() {
		
		return purGoodsAmount;
	}

    @Override
    public void setGoodPrice(BigDecimal goodPrice) {
        this.purGoodsAmount = goodPrice;
    }

    @Override
	public void setWaitPayAmont(BigDecimal amount) {
		
		this.finalAmount =amount;
	}

	@Override
	public void setDiscountAmount(BigDecimal amount) {
		
		this.discountAmount = amount;
	}

	@Override
	public void setBuyNum(int num) {
		this.number = num;
	}

	@Override
	public BigDecimal getWaitPayAmont() {
		
		return finalAmount;
	}

	@Override
	public void setGoodSkuId(String skuId) {
		
		purGoodsSkuId = skuId;
	}

    @Override
    public String getGoodName() {
        return this.purGoodsName;
    }
}
