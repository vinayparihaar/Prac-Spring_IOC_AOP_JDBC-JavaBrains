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
		/*
		 * Circle circle= new JdbcDaoImpl().getCircle(1); System.out.println("Id : "
		 * +circle.getId()+" Name : "+ circle.getName());
		 */
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl jdbcDaoImpl=applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		/*
		 * Circle circle2=jdbcDaoImpl.getCircle(1); System.out.println("Id : "
		 * +circle2.getId()+" Name : "+ circle2.getName());
		 */
		System.out.println(jdbcDaoImpl.getCircleCount());

	}

}
