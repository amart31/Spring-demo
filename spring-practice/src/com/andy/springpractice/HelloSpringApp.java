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
		
		//call the bean methods
		System.out.println(bballCoach.getDailyWorkout() + "\n");
		System.out.println(tCoach.getDailyWorkout() + "\n");
		
		System.out.println("boxing coach daily workout: " + bCoach.getDailyWorkout() + "\n");

		
		//close the context
		context.close();
		
	}

}
