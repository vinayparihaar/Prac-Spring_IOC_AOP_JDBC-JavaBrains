/**
 * 
 */
package com.vinayparihar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author VinayParihar
 * @date May 6, 2020 @time 10:14:09 PM
 */
public class DrawingAppTrinagle {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		/* Shape shape = (Shape) applicationContext.getBean("triangle"); */
		Shape shape = (Shape) applicationContext.getBean("circle");
		shape.draw();

	}

}
