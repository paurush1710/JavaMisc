package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SpringBoot1Application {

	public static void main(String[] args) {
		System.out.println("Before SP_RUN");
		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);
	 
	    System.out.println("Hello World");
	    
	    Alien a = context.getBean(Alien.class);
	    a.show();
//	    Alien a1 = context.getBean(Alien.class);
//	    a1.show();
	}

}
