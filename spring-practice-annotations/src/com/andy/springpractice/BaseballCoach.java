package com.andy.springpractice;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService FortuneService;
	
	@Value("${foo.luck}")
	private String luck;
	
	@Value("${foo.sport}")
	private String sport;
	
	@Value("${foo.city}")
	private String city;
	
	@Value("${foo.superpower}")
	private String superpower;
	
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


	public String getSport() {
		return sport;
	}


	public void setSport(String sport) {
		this.sport = sport;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getSuperpower() {
		return superpower;
	}


	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}


	public void setLuck(String luck) {
		this.luck = luck;
	}
	
	

}
