package com.hmlyinfo.app.soutu.plan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmlyinfo.app.soutu.plan.domain.RecommendPlanTrip;
import com.hmlyinfo.app.soutu.plan.mapper.RecommendPlanTripMapper;
import com.hmlyinfo.base.persistent.BaseMapper;
import com.hmlyinfo.base.service.BaseService;

@Service
public class RecommendPlanTripService extends BaseService<RecommendPlanTrip, Long>{

	@Autowired
	private RecommendPlanTripMapper<RecommendPlanTrip> mapper;

	@Override
	public BaseMapper<RecommendPlanTrip> getMapper() 
	{
		return mapper;
	}
	
	@Override
	public String getKey() 
	{
		return "id";
	}

}
