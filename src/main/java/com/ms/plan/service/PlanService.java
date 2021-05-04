package com.ms.plan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.plan.dto.PlanDto;
import com.ms.plan.entity.Plan;
import com.ms.plan.repository.PlanRepository;

@Service
public class PlanService {

	Logger logger = LoggerFactory.getLogger(this.getClass());	
	
	@Autowired
	private PlanRepository planRepository;
	
	public List<PlanDto> getAllPlans(){
	
		List<Plan> plans = planRepository.findAll();
		List<PlanDto> planDtos = new ArrayList<PlanDto>();
		
		for(Plan plan : plans) {
			PlanDto dto = PlanDto.valueOf(plan);
			planDtos.add(dto);
		}
		
		logger.info("Get All plans request ", planDtos);
		
		return planDtos;		
		
	}
	
	public PlanDto getSpecificPlan(int planId) {
		
		PlanDto dto = null;
		Optional<Plan> optional = planRepository.findById(planId);
		if(optional.isPresent()) {
			Plan plan = optional.get();
			dto = PlanDto.valueOf(plan);
		}
		logger.info("Get Specific Plan Request ", planId);
		return dto;
	}
	
	
	
}
