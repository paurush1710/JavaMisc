package com.paurush.springAnno;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{
	
	public void process() {
		System.out.println("World's Best CPU");
		
	}
}
