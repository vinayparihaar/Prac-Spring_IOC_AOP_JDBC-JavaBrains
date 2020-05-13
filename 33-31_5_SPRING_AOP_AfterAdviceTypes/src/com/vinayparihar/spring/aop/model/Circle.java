/**
 * 
 */
package com.vinayparihar.spring.aop.model;

/**
 * @author VinayParihar
 * @time 9:08:08 PM @date May 10, 2020
 */
public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle's setter method called.");
		throw new RuntimeException();
	}
	
	public String setNameandReturn(String name) {
		this.name = name;
		System.out.println("Circle's SetNameandReturn method called.");
		return name;
	}

}
