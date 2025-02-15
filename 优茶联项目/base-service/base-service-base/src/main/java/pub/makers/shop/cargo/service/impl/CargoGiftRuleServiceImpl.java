package pub.makers.shop.cargo.service.impl;

import org.springframework.stereotype.Service;
import pub.makers.daotemplate.service.impl.BaseCRUDServiceImpl;
import pub.makers.shop.cargo.dao.CargoGiftRuleDao;
import pub.makers.shop.cargo.entity.CargoGiftRule;
import pub.makers.shop.cargo.service.CargoGiftRuleService;

/**
 * Created by dy on 2017/5/23.
 */
@Service
public class CargoGiftRuleServiceImpl extends BaseCRUDServiceImpl<CargoGiftRule, String, CargoGiftRuleDao> implements CargoGiftRuleService {
}
