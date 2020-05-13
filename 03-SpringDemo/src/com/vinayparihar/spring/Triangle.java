/**
 * 
 */
package com.vinayparihar.spring;

/**
 * @author VinayParihar
 * @date May 6, 2020 @time 10:12:42 PM
 */
public class Triangle {

	private String type;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() +" Triangle drawn");
	}

}
