/**
 * 
 */
package com.vinayparihar.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author VinayParihar
 * @date May 6, 2020 @time 10:14:09 PM
 */
public class DrawingAppUsingInterface {

	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		abstractApplicationContext.registerShutdownHook();
		Circle circle = (Circle) abstractApplicationContext.getBean("circle");
		circle.draw();
		System.out.println(abstractApplicationContext.getMessage("greeting", null, "Default Greeting :-)", null));

	}

}
