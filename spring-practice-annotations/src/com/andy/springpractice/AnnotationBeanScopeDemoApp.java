package com.andy.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach tCoach = context.getBean("tennisCoach", Coach.class);
		BaseballCoach bballCoach = context.getBean("baseballCoach", BaseballCoach.class);
		BoxCoach bCoach = context.getBean("boxCoach", BoxCoach.class);

		//check if they are the same
		boolean result = (theCoach == tCoach);
		
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(tCoach);


		
		//close context
		context.close();
	}

}
