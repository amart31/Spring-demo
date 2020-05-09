package com.andy.springpractice;

public class BoxingCoach implements Coach{
	
	//private var 
	private RandomFortuneService randomFortuneService;
	
	public BoxingCoach() {
	}
	
	//constructor for depency injection
	BoxingCoach(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Hit the punching bag for 2 hours in the morning";
	}

	@Override
	public String getDailyFortune() {
		return randomFortuneService.getFortune();
	}
	

}
