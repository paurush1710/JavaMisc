package com.paurush.mavenPractical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        Bike obj = new Bike();
//        obj.drive();
//        
//        Vehicle obj2 = new Car();
//        obj2.drive();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Vehicle obj3 = (Vehicle) context.getBean("vehicle");
        obj3.drive();
        
    }
}
