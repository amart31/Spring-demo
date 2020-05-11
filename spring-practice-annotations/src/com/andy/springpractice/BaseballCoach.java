package com.andy.springpractice;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	
	private String[] workouts = {"batting cage", "infield work", "weight room",
			"intensity work", "agility work", "game drills"
	};
	
	Random r= new Random();
	
	int randomString = r.nextInt(workouts.length);
	
	String workout = workouts[randomString];
	

	@Override
	public String getDailyWorkout() {
		
		return workout;
	}

}
