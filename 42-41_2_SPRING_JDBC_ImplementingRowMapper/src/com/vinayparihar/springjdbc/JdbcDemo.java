/**
 * 
 */
package com.vinayparihar.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinayparihar.springjdbc.dao.JdbcDaoImpl;

/**
 * @author VinayParihar
 * @date May 12, 2020 @time 11:06:00 AM
 */
public class JdbcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl jdbcDaoImpl = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

		System.out.println("ID : " + jdbcDaoImpl.getAllCircles().get(0).getId() + "," + " Name : "
				+ jdbcDaoImpl.getAllCircles().get(0).getName());

	}

}
