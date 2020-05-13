/**
 * 
 */
package com.vinayparihar.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl jdbcDaoImpl = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		jdbcDaoImpl.insertCircle(new Circle(5, "Fifth Circle"));
		System.out.println(jdbcDaoImpl.getAllCircles().size());

	}

}
