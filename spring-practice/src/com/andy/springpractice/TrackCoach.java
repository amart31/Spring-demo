package com.andy.springpractice;

public class TrackCoach implements Coach {
	
	private RandomFortuneService randomFortuneService;
	
	public TrackCoach() {
		
	}
	
	TrackCoach(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run 30 laps daily on the track";
	}

	@Override
	public String getDailyFortune() {
		return randomFortuneService.getFortune();
	}

}
