package com.andy.springpractice;

import org.springframework.beans.factory.DisposableBean;

public class BoxingCoach implements Coach, DisposableBean{
	
	//private var 
	private RandomFortuneService randomFortuneService;
	
	public BoxingCoach() {
	}
	
	//constructor for depency injection
	BoxingCoach(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Hit the punching bag for 2 hours in the morning";
	}

	@Override
	public String getDailyFortune() {
		return randomFortuneService.getFortune();
	}
	
	//add an init method(custom hook)
		public void doMyStartupStuff() {
			System.out.println("BoxingCoach: inside method doMyStartupStuff" );
		}
		
		/*
		
		//add a destroy method (custom hook)
		public void doMyCleanupStuff() {
			System.out.println("BoxingCoach: inside method doMyCleanupStuff" );
		}
		
		*/

		
		// add a destroy method
		@Override
		public void destroy() throws Exception {
			System.out.println("boxingCoach: inside method doMyCleanupStuffYoYo");		
		}
	

}
