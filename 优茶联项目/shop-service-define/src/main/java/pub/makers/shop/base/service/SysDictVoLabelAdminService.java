package pub.makers.shop.base.service;

/**
 * Created by devpc on 2017/7/24.
 */

import pub.makers.shop.base.entity.SysDict;
import pub.makers.shop.base.vo.Paging;
import pub.makers.shop.base.vo.ResultList;
import pub.makers.shop.base.vo.SysDictVo;

import java.util.List;

/**
 * 查询  标签  内容  的  接口
 */
public interface SysDictVoLabelAdminService {
    //得到标签的方法
    List<SysDictVo> getSysDictLabel(String label);
    //增加标签
    boolean addSysDictLabel(SysDict sysDict);
    //分页得到标签
    ResultList<SysDict> getSysDictLabelToShow(SysDict sysDict,Paging pg) ;
    //修改
    boolean updateSysDictLabel(SysDict sysDict);
    //删除
    boolean deleteSysDictLabel(String dictId);
    //单个查询
    SysDict getOneSysDictLabel(String dictid);

}
