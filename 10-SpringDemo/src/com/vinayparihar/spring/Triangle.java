/**
 * 
 */
package com.vinayparihar.spring;

import java.util.List;

/**
 * @author VinayParihar
 * @date May 6, 2020 @time 10:12:42 PM
 */
public class Triangle {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		for (Point point : points) {
			System.out.println("Point  = ( " + point.getX() + "," + point.getY() + " )");
		}

	}

}
