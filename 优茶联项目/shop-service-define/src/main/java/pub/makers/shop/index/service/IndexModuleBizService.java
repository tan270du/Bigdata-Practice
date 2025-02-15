package pub.makers.shop.index.service;

import pub.makers.shop.index.entity.IndexAdImages;
import pub.makers.shop.index.entity.IndexFloorKeyword;
import pub.makers.shop.index.entity.IndexModule;
import pub.makers.shop.index.enums.IndexModuleType;
import pub.makers.shop.index.enums.KeywordPostCode;
import pub.makers.shop.index.pojo.IndexAdImagesQuery;
import pub.makers.shop.index.vo.IndentMobileModuleClassifyVo;
import pub.makers.shop.index.vo.IndentMobileModuleVo;
import pub.makers.shop.index.vo.IndexModuleGoodVo;

import java.util.List;
import java.util.Map;

/**
 * Created by kok on 2017/6/13.
 */
public interface IndexModuleBizService {
    /**
     * 首页广告列表
     */
    List<IndexAdImages> getIndexAdImagesList(IndexAdImagesQuery query);

    /**
     * 查询首页模块列表
     */
    List<IndexModule> getIndexModuleList(IndexModuleType type, String storeLevelId);

    /**
     * 查询楼层关键字列表
     */
    List<IndexFloorKeyword> getKeywordListByModule(String floorId, KeywordPostCode keywordPostCode, Integer limit);

    /**
     * 查询模块商品列表
     */
    List<IndexModuleGoodVo> getGoodListByModule(String moduleId, String storeLevelId);

    /**
     * 移动端查询首页模块列表
     */
    List<IndentMobileModuleVo> getMobileIndexModuleList(String storeLevelId);

    /**
     * 移动端模块分类 key为模块id
     */
    Map<String, List<IndentMobileModuleClassifyVo>> getClassifyListByModule(List<String> moduleIdList, String storeLevelId);
}
