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
public class DrawingAppCircle {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		Circle circle = (Circle) applicationContext.getBean("circle");
		circle.draw();

	}

}
