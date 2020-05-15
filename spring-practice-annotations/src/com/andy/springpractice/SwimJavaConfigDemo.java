package com.andy.springpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SwimJavaConfigDemo {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		SwimCoach myCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println("mycoach " + myCoach.getFortune());
		
		System.out.println("email: " + myCoach.getEmail());

		
		System.out.println("team: " + myCoach.getTeam());

		
		//close the context
		context.close();
	}

}
