package com.andy.springpractice;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("happyFortuneService")
public class HappyFortuneService implements FortuneService {
	
	private String[] fortuneLevel = {"good", "lucky", "charming", "magic",
			"blessed"
	};
	
	private Random r = new Random();
	
	private int rString = r.nextInt(fortuneLevel.length);
	
	private String fortune = fortuneLevel[rString];

	@Override
	public String getFortune() {
		
		return "Today is your " + fortune + " day";
	}

}
