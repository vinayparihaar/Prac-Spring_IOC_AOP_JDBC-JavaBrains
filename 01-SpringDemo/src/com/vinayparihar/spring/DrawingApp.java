/**
 * 
 */
package com.vinayparihar.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * @author VinayParihar
 * @date May 6, 2020 @time 10:14:09 PM
 */
public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Triangle triangle = new Triangle();
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		Triangle triangle = (Triangle) beanFactory.getBean("triangle");
		triangle.draw();

	}

}
