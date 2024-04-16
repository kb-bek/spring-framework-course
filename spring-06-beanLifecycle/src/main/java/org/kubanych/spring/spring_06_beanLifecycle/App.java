package org.kubanych.spring.spring_06_beanLifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        		"applicationContext.xml"
        		);
        
        
        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
        
        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());
        
        
        /*
         * Console Result
         * 
	         Doing initialization
			 Moonlight Sonata
			 Moonlight Sonata
			 Doing destruction

         * */
        
        context.close();
    }
}
