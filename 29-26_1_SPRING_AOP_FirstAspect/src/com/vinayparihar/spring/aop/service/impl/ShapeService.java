/**
 * 
 */
package com.vinayparihar.spring.aop.service.impl;

import com.vinayparihar.spring.aop.model.Circle;
import com.vinayparihar.spring.aop.model.Triangle;

/**
 * @author VinayParihar
 * @time 9:07:30 PM @date May 10, 2020
 */
public class ShapeService {
	private Circle circle;
	private Triangle triangle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
