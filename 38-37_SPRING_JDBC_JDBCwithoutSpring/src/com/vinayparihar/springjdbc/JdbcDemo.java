/**
 * 
 */
package com.vinayparihar.springjdbc;

import com.vinayparihar.springjdbc.dao.JdbcDaoImpl;
import com.vinayparihar.springjdbc.model.Circle;

/**
 * @author VinayParihar
 * @date May 12, 2020 @time 11:06:00 AM
 */
public class JdbcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle= new JdbcDaoImpl().getCircle(1);
		System.out.println("Id : " +circle.getId()+" Name : "+ circle.getName());

	}

}
