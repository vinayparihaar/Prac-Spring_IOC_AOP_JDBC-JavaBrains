/**
 * 
 */
package com.vinayparihar.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author VinayParihar
 * @date May 8, 2020 @time 11:33:52 AM
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before " + bean.getClass() + "  " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After " + bean.getClass() + "  " + beanName);
		return bean;
	}

}
