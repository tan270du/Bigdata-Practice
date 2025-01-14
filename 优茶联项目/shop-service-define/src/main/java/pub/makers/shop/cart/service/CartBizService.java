package pub.makers.shop.cart.service;

import pub.makers.shop.baseGood.pojo.ChangeGoodNumQuery;
import pub.makers.shop.baseOrder.enums.OrderBizType;
import pub.makers.shop.cart.pojo.CartQuery;
import pub.makers.shop.cart.vo.CartVo;
import pub.makers.shop.cart.vo.ChangeGoodNumVo;

import java.util.List;

public interface CartBizService {
	/**
	 * 添加购物车
	 */
	void addToCart(CartQuery query);

	/**
	 * 从购物车删除
	 */
	void delFromCart(List<String> idList, String userId, OrderBizType orderBizType);

	/**
	 * 购物车列表
	 */
	List<CartVo> getCartList(CartQuery query);

	/**
	 * 清空购物车
	 */
	void clearCart(CartQuery query);

	/**
	 * 修改购物车商品数量
	 */
	void updateCartNum(CartQuery query);

	/**
	 * 修改购物车商品数量
	 */
	void updateCartNumByGoodsId(CartQuery query);

	/**
	 * 增加购物车商品数量
	 */
	void addCartNum(CartQuery query);

	/**
	 * 购物车数量
	 */
	Long countCartList(CartQuery query);

	/**
	 * 计算商品变化数量
	 */
	ChangeGoodNumVo changeGoodNum(ChangeGoodNumQuery query);
}
