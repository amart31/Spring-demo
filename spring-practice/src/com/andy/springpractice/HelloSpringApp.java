package com.andy.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach  bballCoach = context.getBean("bballCoach", Coach.class);
		Coach  tCoach = context.getBean("tCoach", Coach.class);
		

		Coach  bCoach = context.getBean("boxCoach", Coach.class);
		
		CricketCoach  cCoach = context.getBean("cCoach", CricketCoach.class);
		
		//call the bean methods
		System.out.println("baseball coach daily workout: " + bballCoach.getDailyWorkout());
		System.out.println("track coach daily workout: " + tCoach.getDailyWorkout());
		System.out.println("boxing coach daily workout: " + bCoach.getDailyWorkout() + "\n");
		
		
		
		System.out.println("baseball coach daily fortune: " + bballCoach.getDailyFortune());
		System.out.println("boxing coach daily fortune: " + bCoach.getDailyFortune());
		System.out.println("track coach daily fortune: " + tCoach.getDailyFortune());
		
		System.out.println("\n");
		
		System.out.println("cricket coach daily fortune: " + cCoach.getDailyFortune());
		
		System.out.println("cricket coach email: " + cCoach.getEmailAddress());
		System.out.println("cricket coach team: " + cCoach.getTeam());

		//close the context
		context.close();
		
	}

}
