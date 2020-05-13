/**
 * 
 */
package com.vinayparihar.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinayparihar.spring.aop.service.impl.ShapeService;

/**
 * @author VinayParihar
 * @time 9:05:21 PM @date May 10, 2020
 */
public class AOPMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = applicationContext.getBean("shapeService", ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
		//System.out.println(shapeService.getTriangle().getName());

	}

}
