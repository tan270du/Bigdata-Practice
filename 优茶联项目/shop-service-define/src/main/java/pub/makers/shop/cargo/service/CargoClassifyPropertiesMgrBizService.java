package pub.makers.shop.cargo.service;

import pub.makers.shop.base.vo.Paging;
import pub.makers.shop.base.vo.ResultList;
import pub.makers.shop.cargo.entity.CargoClassify;
import pub.makers.shop.cargo.entity.CargoClassifyProperties;

import java.util.List;

/**
 * Created by daiwenfa on 2017/5/19.
 */
public interface CargoClassifyPropertiesMgrBizService  {
    ResultList<CargoClassifyProperties> cargoClassifyPropertiesList(CargoClassifyProperties ccp, Paging pg);

    CargoClassifyProperties delCargoClassifyPropertiesById(String id);

    Boolean saveOrUpdate(CargoClassifyProperties ccp);

    CargoClassifyProperties ableOrDisable(String id);

    List<CargoClassify> getOneCargoClassify();

    /**
     * 通过系统类目ID获取公共参数
     * @param classifyId
     * @return
     */
    List<CargoClassifyProperties> getCargoClassifyParamsByCargoClassifyId(String classifyId);

    CargoClassifyProperties getCargoClassifyProperties(String id);
}
