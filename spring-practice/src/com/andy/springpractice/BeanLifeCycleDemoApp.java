package com.andy.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load spring conf file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		//had to change to TrackCoach class b/c when i changed the setup i added the HappyFortuneService in the 
		//track coach class not the coach, Coach class still requires the RandomFortuneService class
		TrackCoach theCoach = context.getBean("tCoach", TrackCoach.class);
		
		Coach bCoach = context.getBean("bCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune()+"\n");
		
		System.out.println("boxing coach fortune: "+ bCoach.getDailyFortune());
		
		
		//close context
		context.close();
	}

}
