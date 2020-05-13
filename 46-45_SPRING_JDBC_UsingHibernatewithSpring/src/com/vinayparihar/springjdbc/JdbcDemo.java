/**
 * 
 */
package com.vinayparihar.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinayparihar.springjdbc.dao.HibernateDaoImpl;



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
		HibernateDaoImpl hibernateDaoImpl = applicationContext.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		System.out.println("No. of Circles :"+hibernateDaoImpl.getCircleCount());

	}

}
