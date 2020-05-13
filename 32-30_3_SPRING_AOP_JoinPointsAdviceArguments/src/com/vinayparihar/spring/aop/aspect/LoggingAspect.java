/**
 * 
 */
package com.vinayparihar.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author VinayParihar
 * @time 10:44:21 PM @date May 10, 2020
 */
@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		
	}
	
	@Before("args(String)")
	public void stringArgumentethods() {
		System.out.println("A method that take string argument has been called.");
		
	}
	

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	@Pointcut("within(com.vinayparihar.spring.aop.model.Circle)")
	public void allCircleMethods() {
	}

}
