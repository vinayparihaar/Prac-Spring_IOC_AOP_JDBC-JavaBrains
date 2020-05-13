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
	private int height;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(String type) {
		super();
		this.type = type;
	}

	public Triangle(int height) {
		super();
		this.height = height;
	}

	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}

	public void draw() {
		System.out.println(getType() + " Triangle drawn of Height " + getHeight());
	}

}
