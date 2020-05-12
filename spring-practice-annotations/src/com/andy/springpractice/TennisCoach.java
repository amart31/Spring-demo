package com.andy.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//assign a bean id to the bean
//if left blank then default bean id (class name camleCased.
@Component
public class TennisCoach implements Coach {
	
	private HappyFortuneService happyFortuneService;
	
	@Autowired
	public TennisCoach(HappyFortuneService fortuneService) {
		happyFortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice back hand volley";
	}
	
	@Override
	public String getFortune() {
		return happyFortuneService.getFortune();
	}

}
