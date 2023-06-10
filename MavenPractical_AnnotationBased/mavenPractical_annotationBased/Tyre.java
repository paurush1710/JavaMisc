package com.paurush.mavenPractical_annotationBased;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String brand;

//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void normal() {
		System.out.println("Tyre normal fn");
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
}
