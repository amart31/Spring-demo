package com.andy.springpractice;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneInterface {
	
	private String[] fortuneLevel = {"good", "lucky", "charming", "magic",
			"blessed"
	};
	
	Random r = new Random();
	
	int rString = r.nextInt(fortuneLevel.length);
	
	String fortune = fortuneLevel[rString];

	@Override
	public String getFortune() {
		
		return "Today is your " + fortune + " day";
	}

}
