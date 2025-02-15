package pub.makers.shop.user.service.impl;

import org.springframework.stereotype.Service;

import pub.makers.daotemplate.service.impl.BaseCRUDServiceImpl;
import pub.makers.daotemplate.vo.Conds;
import pub.makers.shop.user.dao.WeixinStoreWeixinuserDao;
import pub.makers.shop.user.entity.WeixinStoreWeixinuser;
import pub.makers.shop.user.service.WeixinStoreWeixinuserService;

@Service
public class WeixinStoreWeixinuserServiceImpl extends BaseCRUDServiceImpl<WeixinStoreWeixinuser, String, WeixinStoreWeixinuserDao>
										implements WeixinStoreWeixinuserService{

	@Override
	public void addStoreUser(Long storeId, Long weixinUserId, Long id) {
		
		Long counts = count(Conds.get().eq("storeId", storeId).eq("weixinuserId", weixinUserId));
		if (counts == 0){
			WeixinStoreWeixinuser user = new WeixinStoreWeixinuser();
			user.setId(id);
			user.setStoreId(storeId);
			user.setWeixinuserId(weixinUserId);
			
			insert(user);
		}
	}
	
}
