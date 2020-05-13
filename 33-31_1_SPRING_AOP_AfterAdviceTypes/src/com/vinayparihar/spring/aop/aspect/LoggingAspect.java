/**
 * 
 */
package com.vinayparihar.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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

	@After("args(name)")
	public void stringArgumentethods(String name) {
		System.out.println("After : A method that take string argument has been called.The value is " + name);

	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	@Pointcut("within(com.vinayparihar.spring.aop.model.Circle)")
	public void allCircleMethods() {
	}

}
