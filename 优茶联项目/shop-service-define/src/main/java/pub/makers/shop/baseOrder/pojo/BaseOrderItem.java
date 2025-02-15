package pub.makers.shop.baseOrder.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public abstract class BaseOrderItem implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void setId(String id);

	public abstract String getItemId();

	public abstract String getGoodSkuId();
	
	public abstract String getCargoSkuId();
	
	public abstract int getBuyNum();
	
	public abstract void setBuyNum(int num);
	
	public abstract void setGoodSkuId(String skuId);

	public abstract String getGoodName();

	// 以下是促销相关
	
	/**
	 * 获取商品金额
	 * @return
	 */
	public abstract BigDecimal getGoodPrice();

	/**
	 * 设置商品金额
	 * @return
	 */
	public abstract void setGoodPrice(BigDecimal goodPrice);
	
	/**
	 * 设置待支付金额
	 * @param amount
	 */
	public abstract void setWaitPayAmont(BigDecimal amount);
	
	public abstract BigDecimal getWaitPayAmont();
	/**
	 * 设置优惠金额
	 * @param amount
	 */
	public abstract void setDiscountAmount(BigDecimal amount);
	
	/**
	 * 获取商品的优惠金额
	 * @return
	 */
	public abstract BigDecimal getDiscountAmount();
	
	/**
	 * 设置商品的赠品标识
	 * @param giftFlag
	 */
	public abstract void setGiftFlag(String giftFlag);

	/**
	 * 获取商品的赠品标识
	 */
	public abstract String getGiftFlag();

	public abstract String getIsSample();

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public abstract void setMessageList(List<String> messageList);

	public abstract String getGoodType();

	public abstract void setSumAmount(BigDecimal sumAmount);

	public abstract BigDecimal getSumAmount();
}
