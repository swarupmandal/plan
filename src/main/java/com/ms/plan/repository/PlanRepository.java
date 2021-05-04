package com.ms.plan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.plan.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

	List<Plan> findAll();
	
}
