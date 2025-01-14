package pub.makers.shop.tradeGoods.vo;

import java.io.Serializable;

/**
 * SKU检查结果
 * @author apple
 *
 */
public class TradeGoodSkuCheckResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean success;
	private Long skuId;
	private String message;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Long getSkuId() {
		return skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public static TradeGoodSkuCheckResult createSuccess(){
		
		TradeGoodSkuCheckResult result = new TradeGoodSkuCheckResult();
		result.setSuccess(true);
		
		return result;
	}
	
	public static TradeGoodSkuCheckResult createFail(Long skuId, String message){
		
		TradeGoodSkuCheckResult result = new TradeGoodSkuCheckResult();
		result.setSuccess(false);
		result.setSkuId(skuId);
		result.setMessage(message);
		
		return result;
	}
}
