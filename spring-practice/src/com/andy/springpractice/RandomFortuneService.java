package com.andy.springpractice;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	String[] fortunes = {"shitty luck", "so-so luck", "average luck",
			"good luck", "top luck"};
	Random r= new Random();
	
	int randomString = r.nextInt(fortunes.length);
	
	String luck = fortunes[randomString];

	@Override
	public String getFortune() {
		return luck;
	}

}
