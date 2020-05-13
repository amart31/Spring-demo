package com.andy.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//assign a bean id to the bean
//if left blank then default bean id (class name camleCased.
@Component
public class TennisCoach implements Coach {
	
	//use the qualifier annotation with the bean id of the service you want to use
	//coding to an interface
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService FortuneService;
	
	//define a default a constructor 
	public TennisCoach() {
	}
	
	/*
	//define setter method for injection
	@Autowired
	public void setHappyFortuneService(HappyFortuneService fortuneService) {
		happyFortuneService = fortuneService;
		System.out.println("Inside setFortuneService()");

	}
	
	
	//define a constructor injection
	@Autowired
	public TennisCoach(HappyFortuneService fortuneService) {
		happyFortuneService = fortuneService;
	}
	
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice back hand volley";
	}
	
	@Override
	public String getFortune() {
		return FortuneService.getFortune();
	}

}
