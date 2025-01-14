package pub.makers.shop.user.service;

import pub.makers.daotemplate.service.BaseCRUDService;
import pub.makers.shop.user.entity.WeixinUserInfo;

/**
 * Created by dy on 2017/5/5.
 */
public interface WeixinUserInfoService extends BaseCRUDService<WeixinUserInfo> {
	
	WeixinUserInfo findByOpenId(String openId);
}
