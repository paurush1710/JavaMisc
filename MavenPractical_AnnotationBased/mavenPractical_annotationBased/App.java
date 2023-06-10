package com.paurush.mavenPractical_annotationBased;

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
        System.out.println("MaveN Annotation Based");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle v = (Vehicle)context.getBean("car");
        v.drive();
//        v = (Vehicle)context.getBean("bike");
//        v.drive();
//        
//        Tyre t = (Tyre)context.getBean("tyre");
//        System.out.println(t);
//        t.normal();
        
    }
}
