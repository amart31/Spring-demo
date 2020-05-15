package com.andy.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoxCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService FortuneService;
	
	public BoxCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFortune() {
		
		return FortuneService.getFortune();
	}

}
