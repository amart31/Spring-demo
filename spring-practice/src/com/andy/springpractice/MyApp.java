package com.andy.springpractice;

public class MyApp {
	
	public static void main(String[] args) {
		Coach bballCoach = new BaseballCoach();
		
		Coach tCoach = new TrackCoach();
		
		System.out.println(bballCoach.getDailyWorkout());
		
		System.out.println(tCoach.getDailyWorkout());
	}

}
