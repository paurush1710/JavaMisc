package com.paurush.mavenPractical_annotationBased;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	public void drive() {
		System.out.println("It's moving : Bike");
	}

}
