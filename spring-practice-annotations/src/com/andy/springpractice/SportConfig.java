package com.andy.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.andy.springpractice")
@PropertySource("classpath:fortunes.properties")
public class SportConfig {
	
	//used for the fortune service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	//bean used for coach and to inject dependency
	//calls the happyfortuneservice created above
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(happyFortuneService());
		
		return mySwimCoach;
	}

}

