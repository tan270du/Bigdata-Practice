package cn.trasen.chengying.service.impl;

import cn.trasen.chengying.entity.configureQuery.ServiceAddressDTO;
import cn.trasen.chengying.service.ServiceAddress;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


/**
 * @author rq
 */
@Slf4j
@Service
    public class ServiceAddressImpl implements ServiceAddress {
    @Autowired
    private  MongoTemplate mongoTemp;

    @Override
    public ServiceAddressDTO findServiceAddress() {
        log.info("查询服务地址");
        Query query = new Query(Criteria.where("description").is("创星微服务公网01"));
        log.info("查询体 query = {} ", query);
        ServiceAddressDTO serviceAddressInfo = mongoTemp.findOne(query, ServiceAddressDTO.class);
        if (serviceAddressInfo == null) {
            log.warn("查询无服务地址!");
            return null;
        }
        log.info("结果返回 serviceAddressInfo = {} ", serviceAddressInfo.getId());
        return serviceAddressInfo;
    }
}