package cn.trasen.chengying.service;

import cn.trasen.chengying.entity.dataList.InputReadList;
import cn.trasen.chengying.entity.dataList.ReturnSqlCommand;

/**
 * @author rq
 */
public interface ReadList {
    /**
     * 请求微服务清单
     *
     * @param request 请求参数
     * @return 字符串
     */
    String readServiceList(InputReadList request);
    /**
     * 请求sql清单
     *
     * @param request 请求参数
     * @return 字符串
     */
    ReturnSqlCommand readSqlList(InputReadList request);
}
