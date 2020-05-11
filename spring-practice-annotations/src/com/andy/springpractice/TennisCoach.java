package com.andy.springpractice;

import org.springframework.stereotype.Component;


//assign a bean id to the bean
//if left blank then default bean id (class name camleCased.
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice back hand volley";
	}

}
