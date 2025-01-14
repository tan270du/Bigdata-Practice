package pub.makers.shop.cargo.service;

import pub.makers.shop.base.vo.Paging;
import pub.makers.shop.base.vo.ResultList;
import pub.makers.shop.cargo.entity.CargoBrand;
import pub.makers.shop.cargo.entity.vo.CargoBrandVo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by dy on 2017/5/21.
 */
public interface CargoBrandMgrBizService {
    /**
     * 获取所有品牌
     * @return
     */
    List<CargoBrandVo> findCargoBrandListAll();

    ResultList<CargoBrandVo> selectCargoBrandList(String cargoBrandName,Paging paging);

    Map<String,Object> saveOrUpdateCargoBrand(CargoBrandVo cargoBrand,String userId);

    Map<String, Object> deleteCargoBrand(String idStr);
}
