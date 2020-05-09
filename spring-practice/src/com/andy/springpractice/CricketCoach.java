package com.andy.springpractice;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	private RandomFortuneService randomFortuneService;

	public CricketCoach() {
		
	}
	
public CricketCoach(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
		
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return randomFortuneService;
	}

	public void setFortuneService(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return randomFortuneService.getFortune();
	}

}
