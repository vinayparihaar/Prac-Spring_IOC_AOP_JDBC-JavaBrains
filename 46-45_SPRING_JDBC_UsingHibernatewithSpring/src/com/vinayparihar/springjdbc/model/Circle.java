/**
 * 
 */
package com.vinayparihar.springjdbc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author VinayParihar
 * @date May 12, 2020 @time 11:01:11 AM
 */
@Entity
public class Circle {
	@Id
	private int id;
	private String name;

	public Circle() {
	}

	public Circle(int id, String name) {
		/*
		 * super(); this.id = id; this.name = name;
		 */
		setId(id);
		setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
