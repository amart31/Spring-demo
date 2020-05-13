package com.andy.springpractice;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService FortuneService;
	
	public BaseballCoach() {
		
	}
	
	/*
	public BaseballCoach(HappyFortuneService fortuneService) {
		happyFortuneService = fortuneService;
	}
	
	*/
	
	private String[] workouts = {"batting cage", "infield work", "weight room",
			"intensity work", "agility work", "game drills"
	};
	
	private Random r= new Random();
	
	private int randomString = r.nextInt(workouts.length);
	
	private String workout = workouts[randomString];
	

	@Override
	public String getDailyWorkout() {
		
		return workout;
	}


	@Override
	public String getFortune() {
		
		return FortuneService.getFortune();
	}

}
