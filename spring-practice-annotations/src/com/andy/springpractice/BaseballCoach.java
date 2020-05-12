package com.andy.springpractice;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	
	private HappyFortuneService happyFortuneService;
	
	@Autowired
	public BaseballCoach(HappyFortuneService fortuneService) {
		happyFortuneService = fortuneService;
	}
	
	private String[] workouts = {"batting cage", "infield work", "weight room",
			"intensity work", "agility work", "game drills"
	};
	
	private String[] fortunes = {"good", "lucky", "careful", "unlucky"
	};
	
	Random r= new Random();
	
	int randomString = r.nextInt(workouts.length);
	
	int randomFortune = r.nextInt(fortunes.length);
	
	String fortune = fortunes[randomFortune];
	
	String workout = workouts[randomString];
	

	@Override
	public String getDailyWorkout() {
		
		return workout;
	}


	@Override
	public String getFortune() {
		
		return "Today is your " + fortune + " day";
	}

}
