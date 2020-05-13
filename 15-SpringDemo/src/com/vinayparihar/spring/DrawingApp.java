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
public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		abstractApplicationContext.registerShutdownHook();
		Triangle triangle = (Triangle) abstractApplicationContext.getBean("triangle");
		triangle.draw();

	}

}
