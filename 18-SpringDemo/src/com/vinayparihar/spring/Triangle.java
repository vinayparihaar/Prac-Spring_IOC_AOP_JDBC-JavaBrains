/**
 * 
 */
package com.vinayparihar.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author VinayParihar
 * @date May 6, 2020 @time 10:12:42 PM
 */
public class Triangle implements InitializingBean, DisposableBean {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A = ( " + getPointA().getX() + "," + getPointA().getY() + " )");
		System.out.println("Point B = ( " + getPointB().getX() + "," + getPointB().getY() + " )");
		System.out.println("Point C = ( " + getPointC().getX() + "," + getPointC().getY() + " )");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Trianagle");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called for Trianagle");

	}

	public void myInit() {
		System.out.println("myInit method called for Trianagle default-init-method");
	}

	public void cleanUp() {
		System.out.println("cleanUp method called for Trianagle default-destroy-method");
	}

}
