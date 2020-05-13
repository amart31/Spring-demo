package com.andy.springpractice;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("randomFortuneService")
public class RandomFortuneService implements FortuneService {

	
	//create an array of random strings
	private String[] randomFortune = {
			"Good luck day", "Bad fortune day", "So-so day",
			"Irish luck day", "Sailor's luck day", "Blessed day",
	};	
	
	private Random r = new Random();
	
	int rString = r.nextInt(randomFortune.length);
	
	@Override
	public String getFortune() {
		//pick a random string from the array		
		
		return randomFortune[rString];
	}

}
