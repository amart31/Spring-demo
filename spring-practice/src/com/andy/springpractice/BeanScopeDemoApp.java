package com.andy.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring conf file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationcontext.xml");
		
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tCoach", Coach.class);
		

		//check if they are same bean
		boolean result = (theCoach == alphaCoach);
		
		
		//print results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		
		//close context
		context.close();
	}

}
