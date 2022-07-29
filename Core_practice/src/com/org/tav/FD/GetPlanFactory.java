package com.org.tav.FD;

public class GetPlanFactory {

	
	public Plan getPlan(String planType) {
		if(planType ==null) {
			return null;
		}
		if(planType.equalsIgnoreCase("Dom")) {
			return new DomesticPlan();
		}
		if(planType.equalsIgnoreCase("Comm")) {
			return new CommercialPlan();
		}
		if(planType.equalsIgnoreCase("Int")) {
			return new InstitutionPlan();
		}
		return null;
	}
}
