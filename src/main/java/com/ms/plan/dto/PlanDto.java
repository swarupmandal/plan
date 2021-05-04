package com.ms.plan.dto;

import com.ms.plan.entity.Plan;

public class PlanDto {

	Integer planId;
	
	String planName;
	
	Integer nationalRate;
	
	Integer localRate;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getNationalRate() {
		return nationalRate;
	}

	public void setNationalRate(Integer nationalRate) {
		this.nationalRate = nationalRate;
	}

	public Integer getLocalRate() {
		return localRate;
	}

	public void setLocalRate(Integer localRate) {
		this.localRate = localRate;
	}

	public PlanDto() {
		super();
	}
	
	public PlanDto(Integer planId, String planName, Integer nationalRate, Integer localRate) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.nationalRate = nationalRate;
		this.localRate = localRate;
	}
	
	public static PlanDto valueOf(Plan plan) {
		PlanDto dto = new PlanDto();
		dto.setLocalRate(plan.getLocalRate());
		dto.setPlanId(plan.getPlanId());
		dto.setNationalRate(plan.getNationalRate());
		dto.setPlanName(plan.getPlanName());
		
		return dto;
	}

	@Override
	public String toString() {
		return "PlanDto [planId=" + planId + ", planName=" + planName + ", nationalRate=" + nationalRate
				+ ", localRate=" + localRate + "]";
	}
	
	
	
}
