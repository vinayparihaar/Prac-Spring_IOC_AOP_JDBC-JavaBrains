/**
 * 
 */
package com.vinayparihar.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/**
 * @author VinayParihar
 * @date May 8, 2020 @time 2:01:38 PM
 */

@Component
public class Circle implements Shape {
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	/*
	 * @Resource(name = "pointB")
	 *  public void setCenter(Point center) { 
	 *  this.center = center;
	 * }
	 */
	
	@PostConstruct
	public void initializeCircle() {
	System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle");
		}


	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Circle :-)", null));
		System.out.println("Circle : Point is : ( " + center.getX() + "," + center.getY() + " )");
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting :-)", null));

	}

}
