package com.data.data.hmly.action.plan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.zuipin.util.DateUtils;
import org.apache.commons.lang3.StringUtils;

import com.data.data.hmly.action.FrameBaseAction;
import com.data.data.hmly.enums.TargetType;
import com.data.data.hmly.service.LabelItemService;
import com.data.data.hmly.service.LabelService;
import com.data.data.hmly.service.TbAreaService;
import com.data.data.hmly.service.entity.Label;
import com.data.data.hmly.service.entity.LabelItem;
import com.data.data.hmly.service.entity.TbArea;
import com.data.data.hmly.service.plan.PlanService;
import com.data.data.hmly.service.plan.entity.Plan;
import com.data.data.hmly.service.scenic.entity.ScenicInfo;
import com.framework.hibernate.util.Page;
import com.opensymphony.xwork2.Result;
/**
 * 线路
 * @author caiys
 * @date 2015年10月13日 下午4:12:38
 */
public class PlanAction extends FrameBaseAction  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4395061833017783442L;
	@Resource
	private TbAreaService 				tbAreaService;
	@Resource
	private PlanService planService;
	@Resource
	private LabelItemService labelItemService;
	@Resource
	private LabelService labelService;
	private Integer			page				= 1;
	private Integer			rows				= 10;
	private Map<String, Object> map = new HashMap<String,Object>();
	
	
	public Result planList() {
		Page pageInfo = new Page(page, rows);
		String name = (String) getParameter("name");
		String cityId = (String) getParameter("cityId");
		String labelId = (String) getParameter("labelId");
		String tagIds = (String) getParameter("tagIds");
		TbArea area = null;
		Plan info = null;
		if (StringUtils.isNotBlank(cityId)) {
			area = tbAreaService.getArea(Long.parseLong(cityId));
		}
		if (StringUtils.isNotBlank(name)) {
			info = new Plan();
			info.setName(name);
		}
		
		List<Plan> plans = planService.getPlanLabels(info, area, tagIds, pageInfo);
		List<PlanLabel> scenicLabels = new ArrayList<PlanLabel>();
		for (Plan sInfo:plans) {
			PlanLabel slabel = new PlanLabel();
			
			slabel.setId(sInfo.getId());
			slabel.setName(sInfo.getName());
            slabel.setUpdateTime(DateUtils.format(sInfo.getModifyTime(), "yyyy-MM-dd HH:mm:ss"));
			slabel.setCityId(sInfo.getCity().getId());
			slabel.setCityName(sInfo.getCity().getFullPath());
			
			List<LabelItem> items = labelItemService.findItemByTargId(sInfo.getId(), TargetType.PLAN);
			
			List<String> labelNames = new ArrayList<String>();
			List<Integer> itemSorts = new ArrayList<Integer>();
			List<Long> itemIds = new ArrayList<Long>();
			List<Long> labIds = new ArrayList<Long>();
			for (LabelItem it : items) {
				if ((it.getTargetId()).equals(sInfo.getId())) {
					if (StringUtils.isNotBlank(labelId)) {
						Long lId = Long.parseLong(labelId);
						List<Label> labels = labelService.findLabelsByParent(lId);
						if (labels.size() > 0) {
							for (Label la : labels) {
								if ((la.getId()).equals(it.getLabel().getId())) {
									slabel.setSort(it.getOrder());
									itemSorts.add(it.getOrder());
									labelNames.add(it.getLabel().getName());
									itemIds.add(it.getId());
									labIds.add(it.getLabel().getId());
								}
							}
							
						} else {
							if (lId.equals(it.getLabel().getId())) {
								slabel.setSort(it.getOrder());
								itemSorts.add(it.getOrder());
								labelNames.add(it.getLabel().getName());
								itemIds.add(it.getId());
								labIds.add(it.getLabel().getId());
							}
						}
						
					} else {
						slabel.setSort(it.getOrder());
						itemSorts.add(it.getOrder());
						labelNames.add(it.getLabel().getName());
						itemIds.add(it.getId());
						labIds.add(it.getLabel().getId());
					}
				}
				
			}
			
			slabel.setLabelNames(labelNames);
			slabel.setItemSort(itemSorts);
			slabel.setLabelItems(itemIds);
			slabel.setLabelIds(labIds);
			
			
			scenicLabels.add(slabel);
		}
		return datagrid(scenicLabels, pageInfo.getTotalCount());
	}

	public Result yhyPlanList() {
		Page pageInfo = new Page(page, rows);
		String name = (String) getParameter("name");
		String labelId = (String) getParameter("labelId");
		String tagIds = (String) getParameter("tagIds");
		TbArea area = tbAreaService.getArea(350200L);
		Plan info = null;
		if (StringUtils.isNotBlank(name)) {
			info = new Plan();
			info.setName(name);
		}

		List<Plan> plans = planService.getPlanLabels(info, area, tagIds, pageInfo);
		List<PlanLabel> scenicLabels = new ArrayList<PlanLabel>();
		for (Plan sInfo:plans) {
			PlanLabel slabel = new PlanLabel();

			slabel.setId(sInfo.getId());
			slabel.setName(sInfo.getName());
			slabel.setUpdateTime(DateUtils.format(sInfo.getModifyTime(), "yyyy-MM-dd HH:mm:ss"));
			slabel.setCityId(sInfo.getCity().getId());
			slabel.setCityName(sInfo.getCity().getFullPath());

			List<LabelItem> items = labelItemService.findItemByTargId(sInfo.getId(), TargetType.PLAN);

			List<String> labelNames = new ArrayList<String>();
			List<Integer> itemSorts = new ArrayList<Integer>();
			List<Long> itemIds = new ArrayList<Long>();
			List<Long> labIds = new ArrayList<Long>();
			for (LabelItem it : items) {
				if ((it.getTargetId()).equals(sInfo.getId())) {
					if (StringUtils.isNotBlank(labelId)) {
						Long lId = Long.parseLong(labelId);
						List<Label> labels = labelService.findLabelsByParent(lId);
						if (labels.size() > 0) {
							for (Label la : labels) {
								if ((la.getId()).equals(it.getLabel().getId())) {
									slabel.setSort(it.getOrder());
									itemSorts.add(it.getOrder());
									labelNames.add(it.getLabel().getName());
									itemIds.add(it.getId());
									labIds.add(it.getLabel().getId());
								}
							}

						} else {
							if (lId.equals(it.getLabel().getId())) {
								slabel.setSort(it.getOrder());
								itemSorts.add(it.getOrder());
								labelNames.add(it.getLabel().getName());
								itemIds.add(it.getId());
								labIds.add(it.getLabel().getId());
							}
						}

					} else {
						slabel.setSort(it.getOrder());
						itemSorts.add(it.getOrder());
						labelNames.add(it.getLabel().getName());
						itemIds.add(it.getId());
						labIds.add(it.getLabel().getId());
					}
				}

			}

			slabel.setLabelNames(labelNames);
			slabel.setItemSort(itemSorts);
			slabel.setLabelItems(itemIds);
			slabel.setLabelIds(labIds);


			scenicLabels.add(slabel);
		}
		return datagrid(scenicLabels, pageInfo.getTotalCount());
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	

}
