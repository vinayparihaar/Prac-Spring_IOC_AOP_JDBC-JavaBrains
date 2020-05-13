/**
 * 
 */
package com.vinayparihar.spring;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author VinayParihar
 * @date May 8, 2020 @time 2:01:38 PM
 */
public class Circle implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle : Point is : ( " + center.getX() + "," + center.getY() + " )");

	}

}
