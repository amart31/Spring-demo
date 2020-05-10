package com.andy.springpractice;

public class TrackCoach implements Coach {
	
	private RandomFortuneService randomFortuneService;
	private HappyFortuneService happyFortuneService;
	
	public TrackCoach() {
		
	}
	
	TrackCoach(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	TrackCoach(HappyFortuneService happyFortuneService) {
		this.happyFortuneService = happyFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "run 30 laps daily on the track";
	}

	@Override
	public String getDailyFortune() {
		return happyFortuneService.getFortune();
	}
	
	//add an init method(custom hook)
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff" );
	}
	
	
	//add a destroy method (custom hook)
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff" );
	}

}
