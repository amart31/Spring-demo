package com.andy.springpractice;

public class BaseballCoach implements Coach {
	
	//private field 
	private RandomFortuneService randomFortuneService;
	
	public BaseballCoach() {
		
	}
	
	//constructor for depency injection
	public BaseballCoach(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}
	
	public String getDailyWorkout() {
		return "spend 30 minutes daily on batting cages";
	}

	@Override
	public String getDailyFortune() {
		return randomFortuneService.getFortune();
	}

}
