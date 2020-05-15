package com.andy.springpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		BaseballCoach bballCoach = context.getBean("baseballCoach", BaseballCoach.class);
		

		BoxCoach boxCoach = context.getBean("boxCoach", BoxCoach.class);
		
		//call a method on the bean
		
		System.out.println("TennisCoach fortune: " + theCoach.getFortune());
		
		System.out.println("BaseballCoach fortune: " + bballCoach.getFortune());
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(bballCoach.getDailyWorkout() + "\n");
		
		System.out.println(bballCoach.getFortune());
		System.out.println(bballCoach.getCity());
		System.out.println(bballCoach.getSport());
		System.out.println(bballCoach.getSuperpower());
		
		System.out.println(boxCoach.getFortune());
		
		
		//close the context
		context.close();
	}

}
